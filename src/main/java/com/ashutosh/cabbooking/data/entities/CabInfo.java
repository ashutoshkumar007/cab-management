package com.ashutosh.cabbooking.data.entities;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Accessors(chain = true)
public class CabInfo {
    @Id
    private int id;
    private int cabId;
    private int cityId;

}
