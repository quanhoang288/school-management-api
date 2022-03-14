package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.AdminRepository;
import com.hust.schoolmanagementapi.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
}
