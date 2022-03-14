package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
