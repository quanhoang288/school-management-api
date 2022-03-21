package com.hust.schoolmanagementapi.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AuthRequest {
    @NotNull(message = "login_id field is required")
    @JsonProperty("login_id")
    private String loginId;
    @NotNull
    private String password;
}
