package com.example.demo.service;

import com.example.demo.dto.MessageDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService{
    User create(User user);
    User update(Long id, User user);
    MessageDto deleteUser(Long id);
    List<User> allUsers();
    User findById(Long id);
}
