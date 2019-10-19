package com.generics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void wyswietlMenu(){
        System.out.println("1 - dodaj");
        System.out.println("2 - odejmij");
        System.out.println("3 - pomnóż");
        System.out.println("4 - podziel");
    }

    static void dodaj(double liczba, double liczba1){
        System.out.println("x: "+liczba);
        System.out.println("y: "+liczba1);
    }

    public static void main(String[] args) {

        int wybor = 0;
        double x=0,y=0;

        while(true) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Wprowadz liczby:");

            try {
                x = scanner.nextDouble();
            } catch(InputMismatchException e){
                System.out.println("Wprowadzono nieprawidłowe dane");
            }

            try {
                y = scanner.nextDouble();
            }catch(InputMismatchException e){
                y = 10;
            }

            wyswietlMenu();

            try {
                wybor = scanner.nextInt();
            }catch(InputMismatchException e){

            }

            System.out.println("Wybrano: " + wybor);

            switch (wybor) {
                case 1:
                    dodaj(x,y);
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
