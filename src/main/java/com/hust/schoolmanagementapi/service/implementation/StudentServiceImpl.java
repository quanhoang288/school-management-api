package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.StudentRepository;
import com.hust.schoolmanagementapi.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
}
