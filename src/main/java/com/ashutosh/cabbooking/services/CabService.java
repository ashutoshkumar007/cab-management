package com.ashutosh.cabbooking.services;

import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.entities.Cab;
import org.springframework.stereotype.Service;

@Service
public interface CabService {
    Cab registerCab(CabRequest cabRequest);
    Cab changeCabCurrentCity(int cityId);
}

