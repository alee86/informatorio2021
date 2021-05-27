package com.alejandroeguiazabal;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Ingresa el dia de la semana con numero: ");
        Scanner scan = new Scanner(System.in);
        int numDia = scan.nextInt();
        scan.close();

        String dia = dias(numDia);
        System.out.println(dia);
    }

    public static String dias(int numDay) {
        return switch (numDay) {
            case 1 -> "Domingo";
            case 2 -> "Lunes";
            case 3 -> "Martes";
            case 4 -> "Miercoles";
            case 5 -> "Jueves";
            case 6 -> "Viernes";
            case 7 -> "Sabado";
            default -> "Error en la carga";
        };
    }
}
