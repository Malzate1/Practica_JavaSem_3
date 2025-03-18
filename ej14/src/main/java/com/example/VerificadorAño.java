package com.example;

public class VerificadorAño {
    public static void main(String[] args) {

        //Definimos la variable que vamos a evaluar//
        int año=2025;

        //Definimos la condición para que sea aplicada a la variable//
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año es bisiesto. ");
            
        }else {
            System.out.println("No es año bisiesto.");
        }
    }
}