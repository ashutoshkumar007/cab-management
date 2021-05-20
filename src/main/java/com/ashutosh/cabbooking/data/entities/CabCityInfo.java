package com.ashutosh.cabbooking.data.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CabCityInfo {
    @Id
    private int id;
    private int cabId;
    private int cityId;

}
