package com.ashutosh.cabbooking.services.impl;

import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.entities.Cab;
import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.services.CabService;
import com.ashutosh.cabbooking.services.repository.CabInfoRepoService;
import com.ashutosh.cabbooking.services.repository.CabRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabServiceImpl implements CabService {
    @Autowired
    private CabRepoService cabRepoService;

    @Autowired
    private CabInfoRepoService cabInfoRepoService;

    @Override
    public Cab registerCab(CabRequest cabRequest) {

        cabRepoService.saveCab(new Cab().setCabId(cabRequest.getCabId()).setCabName(cabRequest.getCabName()));
        cabInfoRepoService.saveCabInfo(new CabInfo().setCabId(cabRequest.getCabId()).setCityId(cabRequest.getCityId()));
        return null;
    }

    @Override
    public Cab changeCabCurrentCity(int cityId) {
        return null;
    }

    @Override
    public List<Cab> getAllCabs() {
        return cabRepoService.getAllCabs();
    }


}
