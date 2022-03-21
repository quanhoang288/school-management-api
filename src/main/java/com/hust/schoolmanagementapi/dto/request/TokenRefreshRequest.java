package com.hust.schoolmanagementapi.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TokenRefreshRequest {
    @NotBlank
    @JsonProperty("refresh_token")
    private String refreshToken;
}