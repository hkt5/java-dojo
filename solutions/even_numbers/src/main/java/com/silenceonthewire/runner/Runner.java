package com.silenceonthewire.runner;

import com.silenceonthewire.logic.CheckValue;
import com.silenceonthewire.logic.NumberDecidable;
import com.silenceonthewire.ui.GetNumberFromUser;
import com.silenceonthewire.ui.GetableNumber;
import com.silenceonthewire.ui.PrinatbleMessage;
import com.silenceonthewire.ui.PrintMessage;

import java.io.IOException;

public class Runner implements Runable, NumberDecidable, GetableNumber, PrinatbleMessage {

    private GetNumberFromUser getNumberFromUser = new GetNumberFromUser();
    private CheckValue checkValue = new CheckValue();
    private PrintMessage printMessage = new PrintMessage();


    public void run(){

        try {
            this.print();
            int value = this.getNumber();
            System.out.println(this.decision(value) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String decision(int number) {

        return checkValue.decision(number);
    }

    @Override
    public int getNumber() throws IOException {
        return this.getNumberFromUser.getNumber();
    }

    @Override
    public void print() {

        this.printMessage.print();
    }
}
