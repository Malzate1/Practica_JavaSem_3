package com.example;

import java.util.Scanner;

public class DiaDeSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        

       

        System.out.println(" Ingrese un número de 1 a 7: " );
        int num1 = scanner.nextInt();

        switch (num1) {
            case 1:
                System.out.println(" Lunes. ");
                break;
            case 2:
                System.out.println(" Martes. ");
                break;
            case 3:
                System.out.println(" Miércoles. ");
                break;
            case 4:
                System.out.println(" Jueves. ");
                break;
            case 5:
                System.out.println(" Viernes. ");
                break;
            case 6:
                System.out.println(" Sábado. ");
                break;
            case 7:
                System.out.println(" Domingo. ");
                break;

            default:
                System.out.println(" No corresponde a un día de la semana. ");
        }

        scanner.close();

    }
}