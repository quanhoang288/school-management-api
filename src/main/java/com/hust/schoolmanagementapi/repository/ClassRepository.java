package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.ClassService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassService, Long> {
}
