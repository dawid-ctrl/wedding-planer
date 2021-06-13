package com.sda.wedding.delete.mapper;


import com.sda.wedding.model.Band;
import com.sda.wedding.delete.mapper.web.dto.BandResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
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
