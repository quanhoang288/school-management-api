package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<T extends User> extends JpaRepository<T, Long> {
}
