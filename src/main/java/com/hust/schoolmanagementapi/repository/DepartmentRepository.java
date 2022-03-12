package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.DepartmentService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentService, Long> {
}
