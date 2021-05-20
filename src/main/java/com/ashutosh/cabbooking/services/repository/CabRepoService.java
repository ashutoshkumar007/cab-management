package com.ashutosh.cabbooking.services.repository;

import com.ashutosh.cabbooking.data.entities.Cab;
import com.ashutosh.cabbooking.repository.CabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabRepoService {
    @Autowired
    CabRepository cabRepository;

    public void saveCab(Cab cab){
        cabRepository.save(cab);
    }

    public List<Cab> getAllCabs(){
        return cabRepository.findAll();
    }
}
