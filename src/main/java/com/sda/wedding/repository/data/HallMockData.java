package com.sda.wedding.repository.data;

import com.sda.wedding.model.Hall;
import com.sda.wedding.repository.HallRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HallMockData {
    private final HallRepository hallRepository;

    @PostConstruct
    public void addMockHall () {
        List<Hall> halls = List.of(
                createHall("Arena Kraków", "Kraków", "arena.krakow@gmail.com", 12000,true),
                createHall("Piwnica pod Baranami", "Kraków", "piwnica@gmail.com", 150,true),
                createHall("Weselny Dwór", "Warszawa", "weselny@dwor.com", 200,false),
                createHall("Acapulko", "Wroclaw", "acapulco@gmail.com", 300,true)
        );

        halls.forEach(hallRepository::save);
    }

    private Hall createHall (String name, String city, String email, int capacity, boolean isAvailable) {
        return new Hall()
                .setName(name)
                .setCity(city)
                .setEmail(email)
                .setCapacity(capacity)
                .setAvailable(isAvailable);
    }

}
