package com.sda.wedding.exceptions;



public class MissingBandException extends RuntimeException {

    public MissingBandException (long bandId) {
        super("Band with id " + bandId + " is missing");
    }
}
