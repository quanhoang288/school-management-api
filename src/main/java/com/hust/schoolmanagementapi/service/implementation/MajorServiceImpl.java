package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.MajorRepository;
import com.hust.schoolmanagementapi.service.MajorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MajorServiceImpl implements MajorService {
    private MajorRepository majorRepository;
}
