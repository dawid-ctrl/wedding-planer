package com.sda.wedding.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserResponse {

    private Long id;
    private String name;
    private String surname;
    private String login;
}
