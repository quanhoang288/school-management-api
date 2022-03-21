package com.hust.schoolmanagementapi.service.implementation;

import com.hust.schoolmanagementapi.dto.response.AuthResponse;
import com.hust.schoolmanagementapi.repository.UserRepository;
import com.hust.schoolmanagementapi.security.jwt.JwtTokenUtil;
import com.hust.schoolmanagementapi.dto.request.AuthRequest;
import com.hust.schoolmanagementapi.entity.User;
import com.hust.schoolmanagementapi.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final JwtTokenUtil jwtTokenUtil;

    @Override
    public AuthResponse login(AuthRequest request) {
        log.info("inside login service");
        try {

            log.info("login id: " + request.getLoginId());
            log.info("password: " + request.getPassword());

            Authentication authenticate = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(request.getLoginId(), request.getPassword()));
            log.info("authenticated: ", authenticate.toString());
            String accessToken = jwtTokenUtil.generateAccessToken((UserDetails) authenticate.getPrincipal());
            UserDetails userDetails = (UserDetails) authenticate.getPrincipal();
            User user = userRepository.findByLoginId(userDetails.getUsername());

            return new AuthResponse(user.getId(), accessToken, null);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
