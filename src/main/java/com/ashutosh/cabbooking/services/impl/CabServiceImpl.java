package com.ashutosh.cabbooking.services.impl;

import com.ashutosh.cabbooking.data.dto.request.CabRequest;
import com.ashutosh.cabbooking.data.dto.response.CabInfoResponse;
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
    public CabInfoResponse registerCab(CabRequest cabRequest) {

        Cab cab = cabRepoService.saveCab(new Cab().setCabId(cabRequest.getCabId())
                .setCabName(cabRequest.getCabName())
                .setCabStatus(CabStatus.IDLE));
        CabInfo cabInfo = cabInfoRepoService.saveCabInfo(new CabInfo().setCabId(cabRequest.getCabId())
                .setCityId(cabRequest.getCityId()));
        return new CabInfoResponse().setCabId(cab.getCabId())
                .setCabName(cab.getCabName())
                .setCityId(cabInfo.getCityId())
                .setCabStatus(cab.getCabStatus());

    }


    @Override
    public List<Cab> getAllCabs() {
        return cabRepoService.getAllCabs();
    }


}
