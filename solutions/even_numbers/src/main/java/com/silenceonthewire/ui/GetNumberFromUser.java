package com.silenceonthewire.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetNumberFromUser implements GetableNumber {

    @Override
    public int getNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currentNumber = br.readLine();
        return Integer.parseInt(currentNumber);
    }
}
