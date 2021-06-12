package com.sda.wedding.service;

import com.sda.wedding.exceptions.MissingHallException;
import com.sda.wedding.model.Hall;
import com.sda.wedding.repository.HallRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HallService {

    private final HallRepository hallRepository;

    public List<Hall> getAllHalls() {
        return hallRepository.findAll();
    }

    public Hall findHallById (Long hallId) {
        return hallRepository.findById(hallId)
                .orElseThrow(()-> new MissingHallException(hallId));
    }

    public void deleteById (long hallId) {
        hallRepository.deleteById(hallId);
    }

    public Hall createHall (Hall hall) {
        return hallRepository.save(hall);
    }
}
