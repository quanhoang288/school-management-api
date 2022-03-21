package com.hust.schoolmanagementapi.service;

import com.hust.schoolmanagementapi.dto.request.AuthRequest;
import com.hust.schoolmanagementapi.dto.response.AuthResponse;


public interface AuthService {
    AuthResponse login(AuthRequest request);
}
