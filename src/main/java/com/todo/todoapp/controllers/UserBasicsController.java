package com.todo.todoapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userbasic")
public class UserBasicsController {

    @GetMapping("/public")
    public String publicEndPoint(){
        return "Hello, User! you are publicEndpoint";
    }

    @GetMapping("/account")
    public String accountEndpoint(){
        return "Hello, User! you are accountEndpoint";
    }

    @GetMapping("/admin")
    public String adminEndpoint(){
        return "Hello, User! you are adminEndpoint";
    }
}
