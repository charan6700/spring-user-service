package com.charan6700.userservice.controller;

import com.charan6700.userservice.dto.SignUpRequest;
import com.charan6700.userservice.dto.SignUpResponse;
import com.charan6700.userservice.entity.UserEntity;
import com.charan6700.userservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class SignUpController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponse> signUp(@Valid @RequestBody SignUpRequest signUpRequest) {
        try {
            UserEntity user = userService.registerUser(signUpRequest);
            SignUpResponse response = new SignUpResponse("User registered successfully", user.getUserId());
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new SignUpResponse("User registration failed: " + e.getMessage(), null));
        }
    }
}

