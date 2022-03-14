package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.PeriodRepository;
import com.hust.schoolmanagementapi.service.PeriodService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PeriodServiceImpl implements PeriodService {
    private final PeriodRepository periodRepository;
}
