package com.example;
import java.util.Scanner;

public class NotasPonderadas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Definimos los datos de entrada en la consola//

        System.out.println("Ingrese la nota de sus exámenes: ");
        double notaExam = scanner.nextDouble();
        System.out.println("Ingrese la nota d)e sus proyectos: ");
        double notaProy = scanner.nextDouble();
        System.out.println("Ingrese la nota de sus tareas: ");
        double notaTarea = scanner.nextDouble();
        System.out.println("Ingrese la nota de su participación: ");
        double notaPart = scanner.nextDouble();

        //Formulamos la operación de los datos capturados con los porcentajes dados para cada tipo de nota//

        double notaFinal = (notaExam*0.4)+ (notaProy*0.3)+(notaTarea*0.2)+(notaPart*0.1);

        //Imprimimos los resultados//

        System.out.printf(" La nota final es : %.2f%n.",notaFinal);

        scanner.close();


        
    }
}