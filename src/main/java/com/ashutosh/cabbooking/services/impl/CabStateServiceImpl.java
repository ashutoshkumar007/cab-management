package com.ashutosh.cabbooking.services.impl;

import com.ashutosh.cabbooking.data.CabState;
import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.data.enums.CabStatus;
import com.ashutosh.cabbooking.services.CabStateService;
import com.ashutosh.cabbooking.services.repository.CabInfoRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabStateServiceImpl implements CabStateService {
    @Autowired
    CabInfoRepoService cabInfoRepoService;

    @Override
    public void changeCabState(int cabId, CabStatus cabStatus) {
        cabInfoRepoService.saveCabInfo(new CabInfo()
                .setCabId(cabId)
                .setCabStatus(cabStatus));
    }
}
