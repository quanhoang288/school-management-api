package com.hust.schoolmanagementapi.listener;

import com.hust.schoolmanagementapi.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Slf4j
public class UserListener {
    private final PasswordEncoder passwordEncoder;

    public UserListener() {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @PrePersist
    public void onPrePersist(User user) {
        log.info("PrePersist: " + user);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
    }

    @PostPersist
    public void onPostPersist(User user) {
        log.info("PostPersist: " + user);
    }

    @PreUpdate
    void onPreUpdate(User user) {
        log.info("PreUpdate: " + user);
    }

    @PostUpdate
    void onPostUpdate(User user) {
        log.info("PostUpdate: " + user);
    }

    @PreRemove
    void onPreRemove(User user) {
        log.info("PreRemove: " + user);
    }

    @PostRemove
    void onPostRemove(User user) {
        log.info("PostRemove: " + user);
    }
}
