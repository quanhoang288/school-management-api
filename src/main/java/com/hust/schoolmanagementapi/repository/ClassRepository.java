package com.hust.schoolmanagementapi.repository;

import com.hust.schoolmanagementapi.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Classes, Long> {
}
