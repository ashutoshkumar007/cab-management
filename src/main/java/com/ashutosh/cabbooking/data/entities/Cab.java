package com.ashutosh.cabbooking.data.entities;

import com.ashutosh.cabbooking.data.enums.CabStatus;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Accessors(chain = true)
public class Cab {
    @Id
    private int cabId;
    private String cabName;
    private CabStatus cabStatus;
}
