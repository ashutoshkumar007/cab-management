package com.ashutosh.cabbooking.controllers;

import com.ashutosh.cabbooking.config.Constants;
import com.ashutosh.cabbooking.data.entities.Booking;
import com.ashutosh.cabbooking.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(Constants.API_BASE_PATH +"/bookings/alpha")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> bookCab(@RequestBody int startCityId, int destCityId){
        return new ResponseEntity(bookingService.bookCab(startCityId,destCityId), HttpStatus.CREATED);
    }
}
