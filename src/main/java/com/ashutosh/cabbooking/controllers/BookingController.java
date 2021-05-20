package com.ashutosh.cabbooking.controllers;

import com.ashutosh.cabbooking.config.Constants;
import com.ashutosh.cabbooking.data.entities.Booking;
import com.ashutosh.cabbooking.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(Constants.API_BASE_PATH +"/booking")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @GetMapping
    public Booking bookCab(@RequestBody int cityId){
        return bookingService.bookCab(cityId);
    }
}
