package com.ashutosh.cabbooking.services.repository;

import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.repository.CabInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CabInfoRepoService {
    @Autowired
    CabInfoRepository cabInfoRepository;

   public CabInfo saveCabInfo(CabInfo cabInfo){
        return (CabInfo)cabInfoRepository.save(cabInfo);
    }

    public Optional<CabInfo> getCabInfoByCabId(int cabId){
       return cabInfoRepository.findById(cabId);
    }
}
