package com.silenceonthewire.logic;

public class CheckIsEven implements Checkable {

    @Override
    public boolean check(int number) {
        if(number % 2 == 0) return true;
        else return false;
    }
}
