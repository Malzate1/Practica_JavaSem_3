package com.example;

public class OperadorTernario {
    public static void main(String[] args) {

        //Primera expresión ternaria//

        int edad=18;
        String mensaje= (edad>=18)? "Es mayor de edad."  : "Es menor de edad.";
        System.out.println(mensaje);

        //Segunda expresión ternaria//

        int num=4;
        String resultado= (num>0)? "Es positivo." : (num <0)? "Es negativo." : "es igual a cero.";


        System.out.println(resultado);
    }
}