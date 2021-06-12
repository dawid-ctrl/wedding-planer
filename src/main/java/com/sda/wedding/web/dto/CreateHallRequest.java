package com.sda.wedding.web.dto;

import com.sda.wedding.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateHallRequest {

    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "City cannot be blank")
    private String city;
    @NotBlank(message = "E-mail cannot be blank")
    @Email(message = "Invalid email")
    private String email;
    @NotBlank(message = "Capacity cannot be blank")
    private int capacity;
    private boolean isAvailable;
//    private Set<User> userSet;
}
