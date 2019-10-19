package com.generics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int wybor = 0;
        double x,y;

        while(true) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Wprowadz liczby:");

            x = scanner.nextDouble();
            y = scanner.nextDouble();

            System.out.println("1 - dodaj");
            System.out.println("2 - odejmij");
            System.out.println("3 - pomnoż");
            System.out.println("4 - podziel");

            wybor = scanner.nextInt();
            System.out.println("Wybrano: " + wybor);

            switch (wybor) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }


    }
}
