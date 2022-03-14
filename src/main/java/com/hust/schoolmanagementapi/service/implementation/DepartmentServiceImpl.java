package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.DepartmentRepository;
import com.hust.schoolmanagementapi.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
}
