package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.LecturerService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepository extends JpaRepository<LecturerService, Long> {
}
