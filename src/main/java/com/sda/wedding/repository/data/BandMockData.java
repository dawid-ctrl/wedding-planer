package com.sda.wedding.repository.data;

import com.sda.wedding.model.Band;
import com.sda.wedding.model.TypeOfMusic;
import com.sda.wedding.repository.BandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@RequiredArgsConstructor
@Component
public class BandMockData {

    private final BandRepository repository;

    @PostConstruct
    public void addMockBands () {
        List<Band> bands = List.of(
                createBand("Magic Band", "Krakow", "magic@gmail.com", TypeOfMusic.COUNTRY,true),
                createBand("Mig", "Warszawa", "mig@gmail.com", TypeOfMusic.DISCO,true),
                createBand("Total", "Wroclaw", "total@wp.pl", TypeOfMusic.POP,false),
                createBand("Shadow", "Krakow", "shadow@wp.com", TypeOfMusic.JAZZ,false),
                createBand("Boys", "Krakow", "boys@gmail.com", TypeOfMusic.ROCK,true)
        );

        bands.forEach(repository::save);
    }
    private Band createBand (String name, String city, String email, TypeOfMusic music, boolean isAvailable) {
        return new Band()
                .setName(name)
                .setCity(city)
                .setEmail(email)
                .setMusic(music)
                .setAvailable(isAvailable);

    }

}
