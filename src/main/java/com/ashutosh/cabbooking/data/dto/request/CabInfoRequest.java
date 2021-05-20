package com.ashutosh.cabbooking.data.dto.request;

import com.ashutosh.cabbooking.data.enums.CabStatus;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CabInfoRequest {
    private int cabId;
    private int cityId;
    private CabStatus cabStatus;
}
