package com.ashutosh.cabbooking.data.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CabResponse {
    private int cabId;
    private String cabName;
    private int cityId;
}
