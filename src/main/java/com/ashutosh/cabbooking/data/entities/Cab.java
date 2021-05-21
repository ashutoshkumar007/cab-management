package com.ashutosh.cabbooking.data.entities;


import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Data
@Accessors(chain = true)
public class Cab {
    @Id
    private int cabId;
    private String cabName;
}
