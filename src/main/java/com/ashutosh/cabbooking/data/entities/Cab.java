package com.ashutosh.cabbooking.data.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Getter
@Setter
public class Cab {
    @Id
    private int cabId;
    private String cabNumber;
}
