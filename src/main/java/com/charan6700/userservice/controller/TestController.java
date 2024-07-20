package com.charan6700.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/auth")
public class TestController {

    @PostMapping
    public ResponseEntity<?> testAuthentication() {

        return ResponseEntity.ok("Authentication test successful!");
    }

}
