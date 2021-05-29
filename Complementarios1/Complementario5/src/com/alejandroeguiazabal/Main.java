package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
/* 5.	Se desea una aplicación que solicite 2 números enteros y realice la operación de
multiplicación por sumas sucesivas (sin uso de librerías).*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingresa el primer valor");
        int num1 = scan.nextInt();
        System.out.println("Ingresa el segundo valor");
        int num2 = scan.nextInt();

        for (int i = 1; i <= num1; i++) {
            suma += num2;
            //System.out.println(suma);
            if (i == num1) {
                System.out.println("El resultado de " + num1 + " x " + num2 + " = "+ suma);
            }
        }

    }
}
