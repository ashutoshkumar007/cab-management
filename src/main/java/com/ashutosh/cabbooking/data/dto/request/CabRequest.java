package com.ashutosh.cabbooking.data.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class CabRequest {
    private int cabId;
    private String cabName;
    private int cityId;

}
