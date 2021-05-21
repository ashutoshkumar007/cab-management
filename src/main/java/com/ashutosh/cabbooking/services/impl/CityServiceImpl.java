package com.ashutosh.cabbooking.services.impl;

import com.ashutosh.cabbooking.data.entities.City;
import com.ashutosh.cabbooking.services.CityService;
import com.ashutosh.cabbooking.services.repository.CityRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepoService cityRepoService;

    @Override
    public City addCity(City city) {
        return cityRepoService.saveCity(city);
    }
}
