package com.ecommerce.userservice.controller;

import com.ecommerce.common.exception.ApiResponse;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ApiResponse> businessException(BusinessException exception) {
        ApiResponse response = ApiResponse.builder()
                .status("FAILED")
                .message(exception.getMessage())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .fieldErrors(exception.getFieldErrors())
                .mapList(exception.getMapList())
                .build();

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException exception) {
        ApiResponse response = ApiResponse.builder()
                .status("FAILED")
                .message(exception.getMessage())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .fieldErrors(null)
                .mapList(null)
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse> exception(Exception exception) {

        ApiResponse response = ApiResponse.builder()
                .status("FAILED")
                .message(exception.getMessage() == null ? "Something went wrong." : exception.getMessage())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .fieldErrors(null)
                .mapList(null)
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }

}
