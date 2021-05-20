package com.ashutosh.cabbooking.data.dto.request;


import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CabRequest {
    public int cabId;
    public String cabName;
    public int cityId;

}
