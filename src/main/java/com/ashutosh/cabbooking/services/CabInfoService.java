package com.ashutosh.cabbooking.services;

import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.data.enums.CabStatus;
import com.ashutosh.cabbooking.exception.CabNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface CabInfoService {
     CabInfo saveCabInfo(CabInfo cabInfo);
     CabInfo changeCabState(int cabId, CabStatus cabStatus) throws CabNotFoundException;
     CabInfo changeCabCurrentCity(int cabId,int cityId) throws CabNotFoundException;
     public int searchCab(int startCityId);
}
