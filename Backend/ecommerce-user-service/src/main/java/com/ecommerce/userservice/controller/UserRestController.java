package com.ecommerce.userservice.controller;

import com.ecommerce.common.dto.User;
import com.ecommerce.userservice.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.Positive;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private UserService userService;

    private static final Logger LOG = LoggerFactory.getLogger(UserRestController.class);

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody @Valid User user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody @Valid User user) {
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(
            @PathVariable("userId")
            @Positive(message = "userId must be a positive number")
            @NumberFormat(style = NumberFormat.Style.NUMBER)
            Long userId) {
        return ResponseEntity.ok(userService.getUser(userId));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> removeUser(
            @PathVariable("userId")
            @Positive(message = "userId must be a positive number")
            @NumberFormat(style = NumberFormat.Style.NUMBER)
            Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("User Successfully Deleted");
    }

}
