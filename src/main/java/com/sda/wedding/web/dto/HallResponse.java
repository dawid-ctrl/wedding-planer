package com.sda.wedding.web.dto;

import com.sda.wedding.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HallResponse {
    private Long id;
    private String name;
    private String city;
    private String email;
    private int capacity;
    private boolean isAvailable;
//    private Set<User> userSet;
}
