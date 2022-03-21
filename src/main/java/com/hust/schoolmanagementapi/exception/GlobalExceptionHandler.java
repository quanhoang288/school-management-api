package com.hust.schoolmanagementapi.exception;

import com.hust.schoolmanagementapi.dto.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException exception) {
        log.warn("User not found exception");
        return new ResponseEntity<>(
            ErrorResponse.builder()
                .code(ErrorCode.USER_NOT_FOUND)
                .status(HttpStatus.NOT_FOUND)
                .message(exception.getMessage())
                .build(),
            HttpStatus.NOT_FOUND
        );
    }
}
