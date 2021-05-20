package com.ashutosh.cabbooking.controllers;

import com.ashutosh.cabbooking.data.CabState;
import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.entities.Cab;
import com.ashutosh.cabbooking.services.CabService;
import com.ashutosh.cabbooking.services.CabStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ashutosh.cabbooking.config.Constants;

@RestController
@RequestMapping(Constants.API_BASE_PATH + "/cab")
public class CabController {

    @Autowired
    CabService cabService;

    @Autowired
    CabStateService cabStateService;

    @PostMapping
    public Cab registerCab(@RequestBody CabRequest cabRequest){
        return cabService.registerCab(cabRequest);
    }

    @PostMapping(path = "/state")
    public CabState changeCabState(@RequestBody int cabId, CabState cabState){
        return cabStateService.changeCabState(cabId,cabState);
    }

    @PostMapping(path = "/city")
    public Cab changeCabCurrentCity(@RequestBody int cabId, int cityId){
        return cabService.changeCabCurrentCity(cabId);
    }


}
