package com.ashutosh.cabbooking.services;

import com.ashutosh.cabbooking.data.entities.City;
import org.springframework.stereotype.Service;

@Service
public interface CityService {
    City addCity(City city);
}
