package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
    /*3.	Confeccionar un programa que dado un número entero como dato de entrada imprima la
    secuencia de números (incrementos de 1) de la siguiente forma:*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int numero = scan.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println();
            for (int x = 1; x <= i; x++) {
                System.out.print(x);
            }
        }
    }
}