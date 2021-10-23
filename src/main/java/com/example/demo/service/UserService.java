package com.example.demo.service;

import com.example.demo.dto.response.ResponseMessage;
import com.example.demo.entity.User;

import java.util.List;


public interface UserService{
    User create(User user);
    User update(Long id, User user);
    ResponseMessage deleteUser(Long id);
    List<User> allUsers();
    User findById(Long id);
}
