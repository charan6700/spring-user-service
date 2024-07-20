package com.charan6700.userservice.dto;

import lombok.Data;

@Data
public class SignUpResponse {

    private String message;
    private Long userId;

    public SignUpResponse(String message, Long userId) {
        this.message = message;
        this.userId = userId;
    }
}

