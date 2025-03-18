package com.example;

import java.util.Scanner;

public class VerificadorMultiplos {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print(" Ingrese un número:");
        int num= scanner.nextInt();

        if (num% 2 == 0) {
            System.out.println("Es múltiplo de 2.");
            
        }else if (num% 3 == 0) {
            System.out.println("Es múltiplo de 3. ");
            
        }else if (num % 5 == 0) {
            System.out.println(" Es múltiplo de 5. ");
        }else{
            System.out.println("No es múltiplo de 2,3 o 5.");
        }

        scanner.close();
    }
}