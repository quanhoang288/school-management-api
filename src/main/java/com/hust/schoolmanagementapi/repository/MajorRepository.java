package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.MajorService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MajorRepository extends JpaRepository<MajorService, Long> {
}
