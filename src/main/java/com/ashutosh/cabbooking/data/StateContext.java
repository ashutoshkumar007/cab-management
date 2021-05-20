package com.ashutosh.cabbooking.data;

public class StateContext {
    private CabState cabCurrentState;

    StateContext(){
        cabCurrentState = new IdleState();
    }
    void setState(CabState cabState){
        cabCurrentState = cabState;
    }
}
