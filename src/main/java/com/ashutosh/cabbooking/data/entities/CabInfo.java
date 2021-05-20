package com.ashutosh.cabbooking.data.entities;

import com.ashutosh.cabbooking.data.enums.CabStatus;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Data
@Accessors(chain = true)
public class CabInfo {
    @Id
    private int cabId;
    private int cityId;
    @Enumerated(EnumType.ORDINAL)
    private CabStatus cabStatus;

}
