package com.sda.wedding.service;

import com.sda.wedding.exceptions.MissingBandException;
import com.sda.wedding.model.Band;
import com.sda.wedding.repository.BandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class BandService {

    private final BandRepository bandRepository;

    public List<Band> getAllBands() {
        return bandRepository.findAll();
    }

    public Band findBandById(Long bandId) {
        return bandRepository.findById(bandId)
                .orElseThrow(()-> new MissingBandException(bandId));
    }

    public void deleteBand (Long bandId) {
        bandRepository.deleteById(bandId);
    }


    public void createBand (Band band) {
        bandRepository.save(band);
    }

}
