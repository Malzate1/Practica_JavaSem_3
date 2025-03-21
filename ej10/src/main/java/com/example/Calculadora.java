package com.example;

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculadora simple Switch//
        int a = 10;
        int b = 5;
        int resultado = 0;

        System.out.println("Ingrese un operador matemático: + - * / ");
        String operadorMat = scanner.nextLine();

        switch (operadorMat) {
            case "+":
                resultado = a + b;
                System.out.println(" El resultado de la suma es: " + resultado);
                break;
            case "-":
                resultado = a - b;
                System.out.println(" El resultado de la resta es: " + resultado);
                break;
            case "*":
                resultado = a * b;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case "/":
                resultado = a / b;
                System.out.println(" El resultado de la división es: " + resultado);
                break;
            default:
                System.out.println("Operación no válida");
        }

        scanner.close();
    }

}
