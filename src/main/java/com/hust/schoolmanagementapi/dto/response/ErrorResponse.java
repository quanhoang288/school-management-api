package com.hust.schoolmanagementapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
public final class ErrorResponse {
    private String code;
    private String message;
    private HttpStatus status;
}