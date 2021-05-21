package com.ashutosh.cabbooking.data.dto.response;


public class SuccessResponse<T> {
    private SuccessDTO<T> response;

    public SuccessDTO<T> getResponse() {
        return response;
    }

    public void setResponse(SuccessDTO<T> response) {
        this.response = response;
    }

    public SuccessResponse(T object) {
        this.response = new SuccessDTO<>(object);
    }

    public SuccessResponse(T object, String message) {
        this.response = new SuccessDTO<>(object, message);
    }

}

