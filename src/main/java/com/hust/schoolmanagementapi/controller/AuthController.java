package com.hust.schoolmanagementapi.controller;

import com.hust.schoolmanagementapi.dto.request.TokenRefreshRequest;
import com.hust.schoolmanagementapi.dto.response.AuthResponse;
import com.hust.schoolmanagementapi.dto.response.TokenRefreshResponse;
import com.hust.schoolmanagementapi.security.jwt.JwtTokenUtil;
import com.hust.schoolmanagementapi.dto.request.AuthRequest;
import com.hust.schoolmanagementapi.entity.User;
import com.hust.schoolmanagementapi.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController {
    private final AuthService authService;

    @PostMapping("login")
    public ResponseEntity<AuthResponse> login(@RequestBody @Valid AuthRequest request) {
        log.info("login...");
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("refresh_token")
    public ResponseEntity<TokenRefreshResponse> refreshToken(@RequestBody @Valid TokenRefreshRequest request) {
        return null;
    }
}
