package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    boolean existsRoleByCode(String code);
}
