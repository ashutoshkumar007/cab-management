package com.ashutosh.cabbooking.services;

import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.dto.response.CabInfoResponse;
import com.ashutosh.cabbooking.data.entities.Cab;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CabService {
    CabInfoResponse registerCab(CabRequest cabRequest);
    List<Cab> getAllCabs();
}

