package com.hust.schoolmanagementapi.database.seeder;

import com.hust.schoolmanagementapi.entity.Admin;
import com.hust.schoolmanagementapi.entity.Role;
import com.hust.schoolmanagementapi.entity.enums.AdminType;
import com.hust.schoolmanagementapi.entity.enums.RoleType;
import com.hust.schoolmanagementapi.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.hust.schoolmanagementapi.entity.enums.RoleType.*;

@AllArgsConstructor
@Service
public class RoleSeeder extends AbstractSeeder{
    private RoleRepository roleRepository;

    @Override
    @Transactional
    public void run() {
        String[] roleCodes = {"LEC", "STU", "ADM"};
        RoleType[] roleNames = {
            ROLE_LECTURER,
            ROLE_STUDENT,
            ROLE_ADMIN
        };

        List<HashMap<String, Object>> roles = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            HashMap<String, Object> role = new HashMap<>();
            role.put("code", roleCodes[i]);
            role.put("name", roleNames[i]);
            roles.add(role);
        }

        List<Role> roleEntities = new ArrayList<>();

        for (int i = 0; i < roles.size(); i++) {
            HashMap<String, Object> curRole = roles.get(i);
            if (roleRepository.existsRoleByCode((String) curRole.get("code"))) {
                return;
            }
            roleEntities.add(Role.builder()
                .code((String) curRole.get("code"))
                .name((RoleType) curRole.get("name"))
                .build()
            );
        }

        roleRepository.saveAll(roleEntities);

    }
}
