package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.SubjectClassRepository;
import com.hust.schoolmanagementapi.service.SubjectClassService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubjectClassServiceImpl implements SubjectClassService {
    private SubjectClassRepository subjectClassRepository;
}
