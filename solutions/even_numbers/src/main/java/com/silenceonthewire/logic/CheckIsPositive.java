package com.silenceonthewire.logic;

public class CheckIsPositive implements Checkable {

    @Override
    public boolean check(int number) {
        if(number > 0) return true;
        else return false;
    }
}
