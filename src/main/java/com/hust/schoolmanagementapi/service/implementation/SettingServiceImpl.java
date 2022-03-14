package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.SettingRepository;
import com.hust.schoolmanagementapi.service.SettingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SettingServiceImpl implements SettingService {
    private final SettingRepository settingRepository;
}
