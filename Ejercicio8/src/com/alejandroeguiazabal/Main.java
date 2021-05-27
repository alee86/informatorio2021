package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
    /*Tendremos un sistema que debe clasificar el resultado de una evaluación. Como dato de entrada
     tendremos un entero y como resultado un String de la clasificación de la siguiente forma:*/
    public static void main(String[] args) {

        System.out.println("Ingresa la nota del alumno: ");
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        String resultado = calificacion(nota);

        System.out.println("La calificacion del alumno es " + resultado);
    }

        public static String calificacion(int valorNota) {

            if (valorNota >= 93 ) {
                return "Excelente";
            } else  if (valorNota >= 85) {
                return "Sobresaliente";
            } else  if (valorNota >= 75) {
                return "Distinguido";
            } else  if (valorNota >= 60) {
                return "Bueno";
            } else {
                return "Desaprobado";
            }

        }
}
