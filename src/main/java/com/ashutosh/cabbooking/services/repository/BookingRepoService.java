package com.ashutosh.cabbooking.services.repository;

import com.ashutosh.cabbooking.data.entities.Booking;
import com.ashutosh.cabbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingRepoService {
    @Autowired
    BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking){
        return bookingRepository.save(booking);
    }
}
