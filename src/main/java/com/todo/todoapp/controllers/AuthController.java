package com.todo.todoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todoapp.config.JwtUtil;
import com.todo.todoapp.dto.LoginRequest;
import com.todo.todoapp.dto.LoginResponse;
import com.todo.todoapp.models.UserModel;
import com.todo.todoapp.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        try {
            UserModel user = userService.authenticateUser(
                    loginRequest.getUsername(),
                    loginRequest.getPassword());

            String token = jwtUtil.generateToken(
                    user.getUsername(),
                    user.getId(),
                    user.getRole());

            LoginResponse response = new LoginResponse(
                    token,
                    user.getUsername(),
                    user.getRole(),
                    user.getId());

            return ResponseEntity.ok(response);

        } catch (RuntimeException e) {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
