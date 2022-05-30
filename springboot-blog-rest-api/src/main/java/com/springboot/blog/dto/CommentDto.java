package com.springboot.blog.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class CommentDto {

    private long id;

    @NotBlank(message = "Name must not be blank or empty")
    private String name;

    @NotBlank(message = "Email must not be blank or empty")
    @Email
    private String email;

    @NotBlank(message = "Body must not be blank or empty")
    private String body;
}
