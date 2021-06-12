package com.sda.wedding.controller;

import com.sda.wedding.mapper.BandToBandDtoMapper;
import com.sda.wedding.mapper.CreateBandRequestToBandMapper;
import com.sda.wedding.model.Band;
import com.sda.wedding.service.BandService;
import com.sda.wedding.web.dto.BandResponse;
import com.sda.wedding.web.dto.CreateBandRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/band")
@RequiredArgsConstructor
public class BandController {

    private final BandService bandService;
    private final BandToBandDtoMapper bandMapper;
    private final CreateBandRequestToBandMapper createBandRequestToBandMapper;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<BandResponse> getAllBands() {
        return bandService.getAllBands()
                .stream()
                .map(bandMapper::toResponse)
                .collect(Collectors.toList());
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public String viewAllBands (Model model) {
//        List<BandResponse> bandsList = bandService.getAllBands()
//                .stream()
//                .map(bandMapper::toResponse)
//                .collect(Collectors.toList());
//        model.addAttribute("bands",bandsList);
//      return "bands-all";
//    }


    @GetMapping("/{bandId}")
    @ResponseStatus(HttpStatus.OK)
    public BandResponse findById(@PathVariable("bandId") Long bandId) {
        return bandMapper.toResponse(bandService.findBandById(bandId));
    }

    @PostMapping("/create-band")
    public ResponseEntity<?> createBand(@RequestBody @Valid CreateBandRequest createBandRequest,
                                        BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            Map<String, String> errors = bindingResult.getFieldErrors()
                    .stream()
                    .collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
        return ResponseEntity.badRequest().body(errors);
        }

        Band bandToBeCreated = createBandRequestToBandMapper.toDomain(createBandRequest);

        return new ResponseEntity<>(
                bandMapper.toResponse(bandService.createBand(bandToBeCreated)),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping("/delete/{bandId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById (@PathVariable("bandId") Long bandId) {
        bandService.deleteById(bandId);
    }



}
