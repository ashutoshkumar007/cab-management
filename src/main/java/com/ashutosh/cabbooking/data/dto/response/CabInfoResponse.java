package com.ashutosh.cabbooking.data.dto.response;

import com.ashutosh.cabbooking.data.enums.CabStatus;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CabInfoResponse {
    private int cabId;
    private String cabName;
    private int cityId;
    private CabStatus cabStatus;
}
