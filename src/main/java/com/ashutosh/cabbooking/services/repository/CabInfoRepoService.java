package com.ashutosh.cabbooking.services.repository;

import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.repository.CabInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabInfoRepoService {
    @Autowired
    CabInfoRepository cabInfoRepository;

   public CabInfo saveCabInfo(CabInfo cabInfo){
        return (CabInfo)cabInfoRepository.save(cabInfo);
    }
}
