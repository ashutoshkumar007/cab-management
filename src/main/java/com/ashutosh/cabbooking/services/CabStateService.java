package com.ashutosh.cabbooking.services;

import com.ashutosh.cabbooking.data.CabState;
import com.ashutosh.cabbooking.data.enums.CabStatus;
import org.springframework.stereotype.Service;

@Service
public interface CabStateService {
    public void changeCabState(int cabId, CabStatus cabStatus);
}
