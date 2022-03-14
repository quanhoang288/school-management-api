package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.ClassRegistrationRepository;
import com.hust.schoolmanagementapi.service.ClassRegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassRegistrationServiceImpl implements ClassRegistrationService {
    private final ClassRegistrationRepository classRegistrationRepository;
}
