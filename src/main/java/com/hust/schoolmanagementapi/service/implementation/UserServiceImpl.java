package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.repository.UserRepository;
import com.hust.schoolmanagementapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
}
