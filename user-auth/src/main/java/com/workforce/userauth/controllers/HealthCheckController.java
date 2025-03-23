package com.workforce.userauth.controllers;

import com.workforce.userauth.constants.HealthCheckConstants;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheckController {

    @GetMapping("/health-check")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.TEXT_PLAIN)
                .body(HealthCheckConstants.SERVER_IS_OK.getValue());
    }

    @GetMapping("/health-issue")
    public ResponseEntity<String> oopsSomeError() {
        throw new RuntimeException(HealthCheckConstants.SERVER_IS_SICK.getValue());
    }
}
