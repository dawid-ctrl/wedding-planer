package com.sda.wedding.service;

import com.sda.wedding.model.Band;
import com.sda.wedding.model.Hall;
import com.sda.wedding.repository.BandRepository;
import com.sda.wedding.repository.HallRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final BandRepository bandRepository;
    private final HallRepository hallRepository;

    public List<Band> getAllBands() {
        return bandRepository.findAll();
    }

    public List<Hall> getAllHalls() {
        return hallRepository.findAll();
    }
}
