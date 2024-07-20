package com.charan6700.userservice.service;

import com.charan6700.userservice.dto.SignUpRequest;
import com.charan6700.userservice.entity.UserEntity;

public interface UserService {
    UserEntity registerUser(SignUpRequest signUpRequest);
}
