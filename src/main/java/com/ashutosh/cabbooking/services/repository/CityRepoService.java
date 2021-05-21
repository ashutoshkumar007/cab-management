package com.ashutosh.cabbooking.services.repository;


import com.ashutosh.cabbooking.data.entities.City;
import com.ashutosh.cabbooking.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityRepoService {

    @Autowired
    CityRepository cityRepository;

    public City saveCity(City city){
        return cityRepository.save(city);
    }
}
