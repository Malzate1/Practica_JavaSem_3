package com.example;

public class OperacionesCombinadas {
    public static void main(String[] args) {

        double num1 = 5.0;
        double num2 = 12.0;
        double num3 = 7.0;

        // Realizamos las operaciones//

        double suma = num1 + num2 + num3;
        double multiplicación = num1 * num2 * num3;
        double promedio = (num1 + num2 + num3) / 3.0;

        // Comparamos si el promedio es mayor a la suma//

        if (promedio > suma) {
            System.out.println(" El promedio es mayor que la suma. ");

        } else {
            System.out.println(" La suma es mayor que el promedio. ");
        }

        // Imprimimos los resultados de las operaciones iniciales//

        System.out.printf(" La suma es igual a: %.1f%n ", suma);
        System.out.printf(" La multiplicación es igual a: %.1f%n ", multiplicación);
        System.out.printf(" El promedio  es igual a: %.1f%n ", promedio);

    }
}