package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingresa la nota del alumno: ");
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();

        if (nota >= 93 ) {
            System.out.println("Excelente");

        } else  if (nota >= 85) {
            System.out.println("Sobresaliente");

        } else  if (nota >= 75) {
            System.out.println("Distinguido");

        } else  if (nota >= 60) {
            System.out.println("Bueno");

        } else {
            System.out.println("Desaprobado");

        }



    }
}
