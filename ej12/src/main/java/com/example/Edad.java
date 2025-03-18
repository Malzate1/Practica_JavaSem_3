package com.example;

public class Edad {
    public static void main(String[] args) {
        int edad= 85;

        if (edad>=0  && edad<=2) {
            System.out.println(" Es un bebé.");   
        } else if (edad>3 && edad<12) {
            System.out.println(" Es un niño. ");
        } else if (edad>13 && edad<19) {
            System.out.println(" Es un adolescente. ");
        } else if (edad>20 && edad<64) {
            System.out.println(" Es un adulto. ");
            
        }else {
            System.out.println(" Es un adulto mayor. ");
        }


    }
}