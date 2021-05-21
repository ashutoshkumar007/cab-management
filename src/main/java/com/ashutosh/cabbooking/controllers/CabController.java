package com.ashutosh.cabbooking.controllers;

import com.ashutosh.cabbooking.data.dto.request.CabInfoRequest;
import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.dto.response.CabInfoResponse;
import com.ashutosh.cabbooking.data.entities.Cab;
import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.exception.CabNotFoundException;
import com.ashutosh.cabbooking.services.CabService;
import com.ashutosh.cabbooking.services.CabInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ashutosh.cabbooking.config.Constants;

import java.util.List;

@RestController
@RequestMapping(Constants.API_BASE_PATH + "/cabs")
public class CabController {

    @Autowired
    CabService cabService;

    @Autowired
    CabInfoService cabInfoService;

    @PostMapping
    public ResponseEntity<CabInfoResponse> registerCab(@RequestBody CabRequest cabRequest){
         return new ResponseEntity( cabService.registerCab(cabRequest),HttpStatus.CREATED);
    }

    @PutMapping(path = "/state")
    public ResponseEntity<CabInfo> changeCabState(@RequestBody CabInfoRequest cabInfoRequest) throws CabNotFoundException {
         return new ResponseEntity(cabInfoService
                 .changeCabState(cabInfoRequest.getCabId(),cabInfoRequest.getCabStatus()), HttpStatus.OK);
    }

    @PutMapping(path = "/city")
    public ResponseEntity<CabInfo> changeCabCurrentCity(@RequestBody CabInfoRequest cabInfoRequest) throws CabNotFoundException {
        return new ResponseEntity (cabInfoService
                .changeCabCurrentCity(cabInfoRequest.getCabId(),cabInfoRequest.getCityId()), HttpStatus.OK);
    }

    @GetMapping
    public List<Cab> getAllCabs(){
        return cabService.getAllCabs();
    }


}
