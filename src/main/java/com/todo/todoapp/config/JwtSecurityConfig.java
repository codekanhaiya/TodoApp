package com.todo.todoapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class JwtSecurityConfig {
     @Bean
    public PasswordEncoder passwordEncoder() {
        // BCrypt is recommended for secure password hashing
        return new BCryptPasswordEncoder();
    }
}
