package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.AdminService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminService, Long> {
}
