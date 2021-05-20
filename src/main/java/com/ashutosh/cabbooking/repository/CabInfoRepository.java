package com.ashutosh.cabbooking.repository;

import com.ashutosh.cabbooking.data.entities.CabInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabInfoRepository extends JpaRepository<CabInfo,Integer> {
}
