package com.ashutosh.cabbooking.services;

import com.ashutosh.cabbooking.data.CabState;
import org.springframework.stereotype.Service;

@Service
public interface CabStateService {
    CabState changeCabState(int cabId,CabState cabState);
}
