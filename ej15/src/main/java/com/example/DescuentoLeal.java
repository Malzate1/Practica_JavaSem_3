package com.example;

import java.util.Scanner;

public class DescuentoLeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desc = 0.0;
        double montoCompra = 700;

        System.out.print(" Introduce tus años de antigüedad. ");
        double antig = scanner.nextDouble();

        // Definimos los descuentos de acuerdo a la antigüedad con condicional if-else//

        if (antig >= 1 && antig < 2) {
            desc = 0.05;
        } else if (antig > 3 && antig < 5) {
            desc = 0.10;

        } else {
            desc = 0.15;
        }

        // Definimos descuento adicional por monto de compra//

        double descAdic = 0.0;

        if (montoCompra >= 500) {
            descAdic = 0.05;

        } else {
            descAdic = 0.0;
        }

        // Calculamos los descuentos//

        double descTotal = desc + descAdic;
        double montoDesc = montoCompra * descTotal;
        double precioFin = montoCompra - montoDesc;

        System.out.printf("Descuento por antigüedad: %.2f%n ", desc);
        System.out.printf("Descuento adicional por monto de compra: %.2f%n ", descAdic);
        System.out.printf("Descuento total: %.2f%n ", descTotal);
        System.out.printf("Precio final: %.2f%n", precioFin);

        scanner.close();

    }
}