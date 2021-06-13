package com.sda.wedding.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateHallRequest {

    @NotEmpty(message = "Name cannot be empty")
    private String name;
    @NotEmpty(message = "Name cannot be empty")
    private String city;
    @Email(message = "Invalid email")
    private String email;
    @NotEmpty(message = "Name cannot be empty")
    private int capacity;
    private boolean isAvailable;
//    private Set<User> userSet;
}
