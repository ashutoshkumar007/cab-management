package com.ashutosh.cabbooking.data.entities;


import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Accessors(chain = true)
public class Booking {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int bookingId;
    private int cabId;
    private int startCityId;
    private int destCityId;

}
