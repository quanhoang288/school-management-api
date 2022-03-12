package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.ClassRegistrationService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRegistrationRepository extends JpaRepository<ClassRegistrationService, Long> {
}
