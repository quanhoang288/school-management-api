package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.entity.ClassRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRegistrationRepository extends JpaRepository<ClassRegistration, Long> {
}
