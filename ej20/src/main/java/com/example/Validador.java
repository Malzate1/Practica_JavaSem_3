package com.example;

public class Validador {
    public static void main(String[] args) {

        int a = 9;
        int b = 5;
        int c = 9;

        // Definimos si las condiciones se cumplen para ser un triángulo//
        

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println(" Es un triángulo. ");
        }
        //Definimos las condiciones para clasificar el triángulo//
        
        if (a == b && b == c) {
            System.out.println(" Es un triángulo equilátero. ");
        } else if (a == b || b == c || c == a) {
            System.out.println(" Es un triángulo isósceles. ");
        } else {
            System.out.println(" Es un triángulo escaleno. ");
        }

    }
}
