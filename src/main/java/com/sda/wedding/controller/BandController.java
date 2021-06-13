package com.sda.wedding.controller;


import com.sda.wedding.model.Band;
import com.sda.wedding.service.BandService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/api/v1/band")
@AllArgsConstructor
public class BandController {

    private final BandService bandService;

    @GetMapping
    public String empty() {
        return "redirect:/welcome";
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public String viewAllBands (Model model) {
        List<Band> bandsList = bandService.getAllBands();
        model.addAttribute("bands",bandsList);
      return "bands-all";
    }

    @GetMapping("/add-band-form")
    public String addBandForm(Model model) {
        Band band = new Band();
        model.addAttribute("bands", band);
        return "add-band";
    }

    @PostMapping("/add-band")
    public String addBand(@Valid Band band, BindingResult result) {
        if (result.hasFieldErrors()) {
            return "add-band";
        }
        bandService.createBand(band);
        return "redirect:/api/v1/band/all";
    }

    @GetMapping("update-band/{bandId}")
    public String updateBandForm(@PathVariable Long bandId, Model model) {
        Band band = bandService.findBandById(bandId);
        model.addAttribute("band", band);
        return "update-band";
    }

    @PostMapping("/update-band")
    public String saveBand(@Valid Band band, BindingResult result) {
        if (result.hasFieldErrors()){
            return "update-band";
        }
        bandService.createBand(band);
        return "redirect:/api/v1/band/all";
    }

    @GetMapping("/delete-band/{bandId}")
    public String deleteById (@PathVariable Long bandId) {
        bandService.deleteBand(bandId);
        return "redirect:/api/v1/band/all";
    }

    @GetMapping("/calendar/{bandId}")
    public String checkCalendar (@PathVariable Long bandId) {

        return "band-calendar";
    }

    @GetMapping("/chose-band-from/{bandId}")
    public String checkYourBand (Model model, Long bandId) {
        Band band = bandService.findBandById(bandId);
        model.addAttribute("bands",band);
        return "chose-band";
    }




    // REST CODE
//    @GetMapping("/all")
//    @ResponseStatus(HttpStatus.OK)
//    public List<BandResponse> getAllBands() {
//        return bandService.getAllBands()
//                .stream()
//                .map(bandMapper::toResponse)
//                .collect(Collectors.toList());
//    }


    //    @GetMapping("/{bandId}")
//    @ResponseStatus(HttpStatus.OK)
//    public BandResponse findById(@PathVariable("bandId") Long bandId) {
//        return bandMapper.toResponse(bandService.findBandById(bandId));
//    }

//    @PostMapping("/create-band")
//    public ResponseEntity<?> createBand(@RequestBody @Valid CreateBandRequest createBandRequest,
//                                        BindingResult bindingResult) {
//        if (bindingResult.hasFieldErrors()) {
//            Map<String, String> errors = bindingResult.getFieldErrors()
//                    .stream()
//                    .collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
//        return ResponseEntity.badRequest().body(errors);
//        }
//
//        Band bandToBeCreated = createBandRequestToBandMapper.toDomain(createBandRequest);
//
//        return new ResponseEntity<>(
//                bandMapper.toResponse(bandService.createBand(bandToBeCreated)),
//                HttpStatus.CREATED
//        );
//    }


}
