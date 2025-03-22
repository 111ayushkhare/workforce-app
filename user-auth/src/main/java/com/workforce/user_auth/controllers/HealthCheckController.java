package com.workforce.user_auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheckController {

    @GetMapping("/health-check")
    public String sayHello() {
        return "Server is fine 😀!";
    }

    @GetMapping("/error")
    public String oopsSomeError() {
        return "Not a good time 🥹!";
    }
}
