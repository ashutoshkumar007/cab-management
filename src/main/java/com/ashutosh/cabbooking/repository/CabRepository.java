package com.ashutosh.cabbooking.repository;

import com.ashutosh.cabbooking.data.entities.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRepository extends JpaRepository<Cab,Integer> {
}
