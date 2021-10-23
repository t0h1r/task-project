package com.example.demo.dto.request;

import lombok.Data;

@Data
public class CreateUserRequestDto {

    private Long id;
    private String userName;
    private String email;
    private String phone;
    private String login;
    private String password;

}
