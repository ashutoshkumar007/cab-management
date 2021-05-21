package com.ashutosh.cabbooking.controllers;

import com.ashutosh.cabbooking.config.Constants;
import com.ashutosh.cabbooking.data.entities.City;
import com.ashutosh.cabbooking.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(Constants.API_BASE_PATH + "/city")
public class CityController {
    @Autowired
    CityService cityService;

    @PostMapping
    public ResponseEntity<City> onboardCity(@RequestBody City city){
        return new ResponseEntity(cityService.addCity(city), HttpStatus.CREATED);
    }
}
