package com.ashutosh.cabbooking.controllers;

import com.ashutosh.cabbooking.data.dto.request.CabInfoRequest;
import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.entities.Cab;
import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.data.enums.CabStatus;
import com.ashutosh.cabbooking.services.CabService;
import com.ashutosh.cabbooking.services.CabStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ashutosh.cabbooking.config.Constants;

import java.util.List;

@RestController
@RequestMapping(Constants.API_BASE_PATH + "/cabs")
public class CabController {

    @Autowired
    CabService cabService;

    @Autowired
    CabStateService cabStateService;

    @PostMapping
    public void registerCab(@RequestBody CabRequest cabRequest){
         cabService.registerCab(cabRequest);
    }

    @PostMapping(path = "/state")
    public void changeCabState(@RequestBody CabInfoRequest cabInfoRequest){
         cabStateService.changeCabState(cabInfoRequest.getCabId(),cabInfoRequest.getCabStatus());
    }

    @PostMapping(path = "/city")
    public void changeCabCurrentCity(@RequestBody CabInfoRequest cabInfoRequest){
         cabService.changeCabCurrentCity(cabInfoRequest.getCabId(),cabInfoRequest.getCityId());
    }

    @GetMapping
    public List<Cab> getAllCabs(){
        return cabService.getAllCabs();
    }


}
