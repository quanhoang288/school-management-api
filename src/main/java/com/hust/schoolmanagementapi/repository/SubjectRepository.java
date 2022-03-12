package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.SubjectService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<SubjectService, Long> {
}
