package com.hust.schoolmanagementapi.database.seeder;

import com.hust.schoolmanagementapi.entity.Admin;
import com.hust.schoolmanagementapi.entity.enums.AdminType;
import com.hust.schoolmanagementapi.repository.AdminRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Slf4j
@Service
public class AdminSeeder extends AbstractSeeder{

    @Autowired
    private final AdminRepository adminRepository;

    @Override
    @Transactional
    public void run() {
        Admin admin = adminRepository.findByLoginId("admin");
        log.info(admin.toString());
        if (admin == null) {
            admin = Admin.builder().loginId("admin").password("123456").adminType(AdminType.SYSTEM_ADMIN).build();
            adminRepository.save(admin);
        }
    }
}
