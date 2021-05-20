package com.ashutosh.cabbooking.data.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class City {
    @Id
    private int cityId;
    private int cityName;

}
