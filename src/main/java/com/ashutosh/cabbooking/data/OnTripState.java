package com.ashutosh.cabbooking.data;

public class OnTripState implements CabState {
    @Override
    public void changeState(StateContext stateContext) {
        stateContext.setState(this);
    }
}
