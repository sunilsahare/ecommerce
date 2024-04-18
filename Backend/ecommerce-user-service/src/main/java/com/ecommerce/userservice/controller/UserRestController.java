package com.ecommerce.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.common.exception.FieldError;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @GetMapping
    public String test() {
        FieldError fieldError = FieldError.builder()
                .message("Name should be in lower case.")
                .fieldName("name")
                .value("SHaN").build();
        throw new com.ecommerce.common.exception.BusinessException(List.of(fieldError));
    }

}
