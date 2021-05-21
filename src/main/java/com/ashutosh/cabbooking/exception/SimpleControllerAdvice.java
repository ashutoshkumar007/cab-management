package com.ashutosh.cabbooking.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice
public class SimpleControllerAdvice {
    public static String CAB_NOT_FOUND_MESSAGE = "No Cab found for this request";

    @ExceptionHandler(CabNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleEmployeeNotFound(CabNotFoundException exception, HttpServletRequest request){
        log.warn("Cab not found for request {} ",request.getRequestURI(),exception);
        return CAB_NOT_FOUND_MESSAGE;
    }
}
