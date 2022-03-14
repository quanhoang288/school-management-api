package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.ClassRepository;
import com.hust.schoolmanagementapi.service.ClassService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassServiceImpl implements ClassService {
    private final ClassRepository classRepository;
}
