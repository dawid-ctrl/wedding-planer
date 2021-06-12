package com.sda.wedding.controller;

import com.sda.wedding.exceptions.MissingBandException;
import com.sda.wedding.exceptions.MissingHallException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestControllerAdvice {
    @ExceptionHandler({MissingBandException.class, MissingHallException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String missingEntity(RuntimeException exception) {
        return exception.getMessage();
    }
}
