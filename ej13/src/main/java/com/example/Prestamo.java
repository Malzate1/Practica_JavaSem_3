package com.example;

import java.util.Scanner;

public class Prestamo {

    public static void main(String[] args) {
       Scanner scanner= new Scanner (System.in);

       System.out.print(" Introduce el monto del préstamo (L):  ");
       double L= scanner.nextDouble();

       System.out.print("Introduzca la tasa de interés anual (%): ");
       double tasaIntAño= scanner.nextDouble();

       System.out.print("Introduzca el número de años con el que tomará el préstamo: ");
       int años= scanner.nextInt();

       //Definimos fórmula para cálculo de tasas de intereses mensual//

       double tasaIntMes= (tasaIntAño/100)/12;

       //Definimos fórmula para el # de pagos//

       int n= años*12;

       // Utilizamos la fórmula para obtener el pago mensual//

       double P =L* (tasaIntMes *Math.pow(1+tasaIntMes , n))/( Math.pow(1 + tasaIntMes , n )-1);

       //Ponemos el resultado con base a la fórmula anterior//

       System.out.printf("El pago mensual es: %.2f\n ",P);

       scanner.close();







    }
} 