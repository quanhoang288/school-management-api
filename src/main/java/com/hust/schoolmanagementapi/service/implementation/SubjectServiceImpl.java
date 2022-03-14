package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.SubjectRepository;
import com.hust.schoolmanagementapi.service.SubjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private SubjectRepository subjectRepository;
}
