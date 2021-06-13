package com.sda.wedding.web;


import com.sda.wedding.model.TypeOfMusic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBandRequest {

    @NotEmpty(message = "Name cannot be empty")
    private String name;
    @Email(message = "Invalid email")
    private String email;
    @NotEmpty(message = "City cannot be empty")
    private String city;
    @NotEmpty(message = "Music cannot be empty")
    private TypeOfMusic music;
    private boolean isAvailable;

}

