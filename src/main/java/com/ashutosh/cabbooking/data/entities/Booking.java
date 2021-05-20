package com.ashutosh.cabbooking.data.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int bookingId;

}
