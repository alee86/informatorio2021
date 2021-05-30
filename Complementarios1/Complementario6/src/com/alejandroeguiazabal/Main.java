package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
/* 6.	Se desea una aplicación que solicite 2 números enteros y
realice la operación de potencia (sin uso de librerías).*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el primer valor (base):");
        int base = scan.nextInt();
        System.out.println("Ingresa el segundo valor (exponente):");
        int exponente = scan.nextInt();

        System.out.println("El resultado de " + base + " elvado a "
                + exponente + " es: " + result(base, exponente));
    }

    public static int result(int base, int exponent) {
        int resultado = 1;

        for (int i = 1; i <= exponent; i++) {
            resultado *= base;
        } return resultado;
    }
}
