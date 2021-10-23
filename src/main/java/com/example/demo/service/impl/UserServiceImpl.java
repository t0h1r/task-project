package com.example.demo.service.impl;

import com.example.demo.dto.MessageDto;
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
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(Long id, User user) {
        User oldUser = userRepository.getById(id);
        oldUser.setUserName(user.getUserName());
        oldUser.setEmail(user.getEmail());
        oldUser.setPhone(user.getPhone());
        oldUser.setLogin(user.getLogin());
        oldUser.setPassword(user.getPassword());
        return userRepository.save(oldUser);
    }

    @Override
    public MessageDto deleteUser(Long id) {
        User user = userRepository.findById(id).get();
        if (user != null) {
            userRepository.delete(user);
            return new MessageDto("User deleted!!!");
        } else {
            return new MessageDto("User not found :(");
        }
    }
}
