package com.sda.wedding.delete.mapper.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
