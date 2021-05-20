package com.ashutosh.cabbooking.data;

public class IdleState implements CabState{
    @Override
    public void changeState(StateContext stateContext) {
        stateContext.setState(this);
    }
}
