package com.springboot.blog.dto;

import lombok.Data;

@Data
public class SignInDto {

    private String usernameOrEmail;
    private String password;
}
