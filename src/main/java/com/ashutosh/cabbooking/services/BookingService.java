package com.ashutosh.cabbooking.services;

import com.ashutosh.cabbooking.data.entities.Booking;
import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    Booking bookCab(int startCityId,int destCityId);
}
