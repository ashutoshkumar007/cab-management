package com.ashutosh.cabbooking.services.impl;

import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.entities.Cab;
import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.data.enums.CabStatus;
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
    public void registerCab(CabRequest cabRequest) {

        cabRepoService.saveCab(new Cab().setCabId(cabRequest.getCabId())
                .setCabName(cabRequest.getCabName())
                .setCabStatus(CabStatus.IDLE));
        cabInfoRepoService.saveCabInfo(new CabInfo().setCabId(cabRequest.getCabId())
                .setCityId(cabRequest.getCityId()));
    }

    @Override
    public void changeCabCurrentCity(int cabId,int cityId) {
        cabInfoRepoService.saveCabInfo(new CabInfo()
        .setCabId(cabId)
        .setCityId(cityId));
    }

    @Override
    public List<Cab> getAllCabs() {
        return cabRepoService.getAllCabs();
    }


}
