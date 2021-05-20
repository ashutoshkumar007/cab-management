package com.ashutosh.cabbooking.services.repository;

import com.ashutosh.cabbooking.data.entities.Cab;
import com.ashutosh.cabbooking.repository.CabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabRepoService {
    @Autowired
    CabRepository cabRepository;

    public void saveCab(Cab cab){
        cabRepository.save(cab);
    }
}
