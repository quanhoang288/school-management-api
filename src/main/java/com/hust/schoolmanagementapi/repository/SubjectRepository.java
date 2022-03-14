package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
