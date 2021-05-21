package com.ashutosh.cabbooking.exception;

public class CabNotFoundException extends RuntimeException {
    public CabNotFoundException() {
        super();
    }
    public CabNotFoundException(Exception ex) {
        super(ex);
    }
}
