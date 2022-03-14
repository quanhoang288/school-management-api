package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.LecturerRepository;
import com.hust.schoolmanagementapi.service.LecturerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LecturerServiceImpl implements LecturerService {
    private LecturerRepository lecturerRepository;
}
