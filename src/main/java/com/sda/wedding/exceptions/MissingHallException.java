package com.sda.wedding.exceptions;

public class MissingHallException extends RuntimeException {

    public MissingHallException (long hallId) {
        super("Hall with id " + hallId + " is missing");
    }
}
