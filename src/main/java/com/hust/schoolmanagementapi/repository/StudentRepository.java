package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.StudentService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentService, Long> {
}
