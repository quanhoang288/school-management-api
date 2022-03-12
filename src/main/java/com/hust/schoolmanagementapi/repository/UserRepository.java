package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserService, Long> {
}
