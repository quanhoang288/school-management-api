package com.hust.schoolmanagementapi.controller;

import com.hust.schoolmanagementapi.dto.request.DepartmentCreateRequest;
import com.hust.schoolmanagementapi.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("departments")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping("")
    public ResponseEntity create(@RequestBody @Valid DepartmentCreateRequest request) {
        return ResponseEntity.ok("OK");
    }
}
