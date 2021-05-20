package com.ashutosh.cabbooking.repository;

import com.ashutosh.cabbooking.data.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
}
