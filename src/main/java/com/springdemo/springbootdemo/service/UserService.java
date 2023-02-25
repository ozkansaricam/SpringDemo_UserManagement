package com.springdemo.springbootdemo.service;

import com.springdemo.springbootdemo.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long user_id);
    List<User> getAllUsers();
    User updateUser(User user);

    void deleteUser(Long userId);
}