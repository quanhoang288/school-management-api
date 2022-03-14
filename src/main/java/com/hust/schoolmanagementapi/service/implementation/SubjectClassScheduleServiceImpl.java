package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.SubjectClassScheduleRepository;
import com.hust.schoolmanagementapi.service.SubjectClassScheduleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubjectClassScheduleServiceImpl implements SubjectClassScheduleService {
    private SubjectClassScheduleRepository subjectClassScheduleRepository;
}
