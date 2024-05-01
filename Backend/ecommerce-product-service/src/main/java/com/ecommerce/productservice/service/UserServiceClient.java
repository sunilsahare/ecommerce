package com.ecommerce.productservice.service;

import com.ecommerce.common.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-SERVICE",url = "http://localhost:8082")
public interface UserServiceClient {

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUser(@PathVariable("userId") Long userId);
}
