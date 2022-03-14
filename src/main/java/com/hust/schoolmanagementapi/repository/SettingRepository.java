package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.entity.Setting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingRepository extends JpaRepository<Setting, Long> {
}
