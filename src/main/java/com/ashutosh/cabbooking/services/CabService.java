package com.ashutosh.cabbooking.services;

import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.entities.Cab;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CabService {
    void registerCab(CabRequest cabRequest);
    void changeCabCurrentCity(int cabId,int cityId);
    List<Cab> getAllCabs();
}

