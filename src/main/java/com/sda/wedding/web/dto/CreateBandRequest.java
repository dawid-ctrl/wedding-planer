package com.sda.wedding.web.dto;


import com.sda.wedding.model.TypeOfMusic;
import com.sda.wedding.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBandRequest {


    private String name;
    private String email;
    private String city;
    private TypeOfMusic music;
    private boolean isAvailable;

}

