package com.charan6700.userservice.service.implementation;


import com.charan6700.userservice.dto.SignUpRequest;
import com.charan6700.userservice.entity.UserEntity;
import com.charan6700.userservice.enums.Role;
import com.charan6700.userservice.repository.UserRepository;
import com.charan6700.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserEntity registerUser(SignUpRequest signUpRequest) {
        // Check if the username or email already exists
        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            throw new RuntimeException("Email is already in use");
        }

        // Create new user
        UserEntity user = new UserEntity();
        user.setEmail(signUpRequest.getEmail());
        user.setPasswordHash(passwordEncoder.encode(signUpRequest.getPassword()));
        user.setFirstName(signUpRequest.getFirstName());
        user.setLastName(signUpRequest.getLastName());
        user.setPhoneNumber(signUpRequest.getPhoneNumber());
        user.setRole(Role.CUSTOMER);

        // Save user to the database
        return userRepository.save(user);
    }
}

