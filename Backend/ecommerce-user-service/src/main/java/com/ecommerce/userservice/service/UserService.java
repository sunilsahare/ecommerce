package com.ecommerce.userservice.service;

import com.ecommerce.common.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);
    public User getUser(Long userId);
    public List<User> getAllUser();

    public Optional<com.ecommerce.userservice.entity.User> getUserByUserId(Long userId);
    public void isUsernameExist(String username);
    public void isEmailExist(String email);
    public Optional<com.ecommerce.userservice.entity.UserInfo> getUserByEmail(String email);
    public Optional<com.ecommerce.userservice.entity.User> getUserByUsername(String username);

}
