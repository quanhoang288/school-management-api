package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.SettingService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingRepository extends JpaRepository<SettingService, Long> {
}
