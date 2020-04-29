package com.silenceonthewire;

import java.util.Scanner;

public class OriginalMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.print("Wprowadź numer:");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Zero to liczba parzysta.)");
        } else {

            if (number < 0) {

                System.out.print("Liczba ujemna ");
            } else {
                System.out.print("Liczba dodatnia ");
            }

            int modulo = number % 2;
            if (modulo == 0) {
                System.out.println("i parzysta");
            } else {
                System.out.println("i nieparzysta");
            }
        }
    }
}
