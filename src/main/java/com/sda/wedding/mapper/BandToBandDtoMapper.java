package com.sda.wedding.mapper;


import com.sda.wedding.model.Band;
import com.sda.wedding.web.dto.BandResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BandToBandDtoMapper {
    public BandResponse toResponse (Band band) {
        return BandResponse.builder()
                .id(band.getId())
                .name(band.getName())
                .email(band.getEmail())
                .city(band.getCity())
                .music(band.getMusic())
                .isAvailable(band.isAvailable())
                .build();
    }
}
