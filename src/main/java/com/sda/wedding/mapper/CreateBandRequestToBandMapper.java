package com.sda.wedding.mapper;

import com.sda.wedding.model.Band;
import com.sda.wedding.web.dto.CreateBandRequest;
import org.springframework.stereotype.Component;

@Component
public class CreateBandRequestToBandMapper {

    public Band toDomain (CreateBandRequest createBandRequest) {
        return Band.builder()
                .name(createBandRequest.getName())
                .email(createBandRequest.getEmail())
                .city(createBandRequest.getCity())
                .music(createBandRequest.getMusic())
                .isAvailable(createBandRequest.isAvailable())
                .build();
    }
}
