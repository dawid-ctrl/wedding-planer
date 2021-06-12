package com.sda.wedding.mapper;

import com.sda.wedding.model.Hall;
import com.sda.wedding.web.dto.CreateHallRequest;
import org.springframework.stereotype.Component;

@Component
public class CreateHallRequestToHallMapper {

    public Hall toDomain (CreateHallRequest createHallRequest) {
        return Hall.builder()
                .name(createHallRequest.getName())
                .city(createHallRequest.getCity())
                .email(createHallRequest.getEmail())
                .capacity(createHallRequest.getCapacity())
                .isAvailable(createHallRequest.isAvailable())
                .build();
    }
}
