package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createOrUpdate(User user) {
        User newUser;
        if (user.getId() == null) {
            newUser = userRepository.save(user);
            return newUser;
        } else {
            User oldUser = userRepository.getById(user.getId());
            oldUser.setUserName(user.getUserName());
            oldUser.setEmail(user.getEmail());
            oldUser.setPhone(user.getPhone());
            oldUser.setLogin(user.getLogin());
            oldUser.setPassword(user.getPassword());
            userRepository.save(oldUser);
            return oldUser;
        }
    }
}
