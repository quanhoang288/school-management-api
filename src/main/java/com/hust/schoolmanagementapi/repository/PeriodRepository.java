package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.entity.Period;
import com.hust.schoolmanagementapi.service.PeriodService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodRepository extends JpaRepository<Period, Long> {
}
