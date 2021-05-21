package com.ashutosh.cabbooking.services.impl;

import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.data.enums.CabStatus;
import com.ashutosh.cabbooking.exception.CabNotFoundException;
import com.ashutosh.cabbooking.services.CabInfoService;
import com.ashutosh.cabbooking.services.repository.CabInfoRepoService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CabInfoServiceImpl implements CabInfoService {
    @Autowired
    CabInfoRepoService cabInfoRepoService;

    @Override
    public CabInfo changeCabState(int cabId, CabStatus cabStatus) throws CabNotFoundException {
        Optional<CabInfo> cabInfo= cabInfoRepoService.getCabInfoByCabId(cabId);
        if(cabInfo.isPresent()){
            return cabInfoRepoService.saveCabInfo(cabInfo.get().setCabStatus(cabStatus));
        }else{
            throw new CabNotFoundException();
        }

    }

    @Override
    public CabInfo changeCabCurrentCity(int cabId,int cityId) throws CabNotFoundException{
        Optional<CabInfo> cabInfo= cabInfoRepoService.getCabInfoByCabId(cabId);
        if(cabInfo.isPresent()){
            return cabInfoRepoService.saveCabInfo(cabInfo.get().setCityId(cityId));
        }else{
            throw new CabNotFoundException();
        }
    }
}
