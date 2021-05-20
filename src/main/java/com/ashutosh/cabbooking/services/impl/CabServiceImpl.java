package com.ashutosh.cabbooking.services.impl;

import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.entities.Cab;
import com.ashutosh.cabbooking.services.CabService;
import com.ashutosh.cabbooking.services.repository.CabRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabServiceImpl implements CabService {
    @Autowired
    CabRepoService cabRepoService;

    @Override
    public Cab registerCab(CabRequest cabRequest) {
        return null;
    }

    @Override
    public Cab changeCabCurrentCity(int cityId) {
        return null;
    }
}
