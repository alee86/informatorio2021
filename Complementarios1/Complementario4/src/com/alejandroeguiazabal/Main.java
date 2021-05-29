package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
/*4.	Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un numero para hacer el factorial");
        int numero = scan.nextInt();

        int factorial = 1;

        for (int i = 1; i<= numero; i++) {
            factorial = i * factorial;
            if (i == numero) {
                System.out.println(" El factorial de " + numero + " es: "+ factorial);
            }
        }
    }
}
