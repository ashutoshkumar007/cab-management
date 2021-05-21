package com.ashutosh.cabbooking.data.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SuccessDTO<T> {
    private T body;
    private String message = null;

    public SuccessDTO(T body, String message) {
        this.body = body;
        this.message = message;
    }


    public SuccessDTO(T body) {
        this.body = body;
    }

}
