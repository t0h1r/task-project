package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/create")
    public ResponseEntity<?> createUser(@RequestBody User request) {
        return ResponseEntity.ok(userService.create(request));
    }

    @PutMapping("/user/edit/{id}")
    public ResponseEntity<?> createEdit(@RequestBody User request,
                                        @PathVariable Long id) {
        return ResponseEntity.ok(userService.update(id, request));
    }

    @DeleteMapping("/user/delete")
    public ResponseEntity<?> delete(@RequestBody Long id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }
}
