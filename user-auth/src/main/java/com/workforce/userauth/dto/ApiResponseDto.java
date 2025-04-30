package com.workforce.userauth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ApiResponseDto<T> {
    private HttpStatus statusCode;
    private String message;
    private T data;
}
