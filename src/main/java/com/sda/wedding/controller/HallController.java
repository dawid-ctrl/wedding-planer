package com.sda.wedding.controller;

import com.sda.wedding.service.HallService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/hall")
@RequiredArgsConstructor
public class HallController {

    private final HallService hallService;

//

    @DeleteMapping("/delete/{hallId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById (@PathVariable("hallId") Long hallId) {
        hallService.deleteById(hallId);
    }

//REST CODE

//    @GetMapping("/all")
//    @ResponseStatus(HttpStatus.OK)
//    public List<HallResponse> getAllHalls() {
//        return hallService.getAllHalls()
//                .stream()
//                .map(hallDtoMapper::toResponse)
//                .collect(Collectors.toList());
//    }
//
//    @GetMapping("/{hallId}")
//    @ResponseStatus(HttpStatus.OK)
//    public HallResponse findById (@PathVariable("hallId") Long hallId) {
//        return hallDtoMapper.toResponse(hallService.findHallById(hallId));
//    }
//
//    @PostMapping("/create-hall")
//    public ResponseEntity<?> createHall (@RequestBody @Valid CreateHallRequest createHallRequest,
//                                         BindingResult bindingResult) {
//        if (bindingResult.hasFieldErrors()) {
//            Map<String, String> errors = bindingResult.getFieldErrors()
//                    .stream()
//                    .collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
//            return ResponseEntity.badRequest().body(errors);
//        }
//        Hall hallToBeCreated = createHallRequestToHallMapper.toDomain(createHallRequest);
//
//        return new ResponseEntity<>(
//                hallDtoMapper.toResponse(hallService.createHall(hallToBeCreated)),
//                HttpStatus.CREATED
//        );
//    }



}
