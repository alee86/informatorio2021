package com.alejandroeguiazabal;

import java.util.Scanner;

/*Ejercicio 6: Debemos realizar un programa que nos realizará una pregunta si
queremos realizar una operación dada o si deseamos salir/terminar el programa.
Utilizaremos en este caso una simple operación que nos pide un número y
luego lo imprime.
*/


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int consulta = 1;

        while (consulta == 1) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Ingresa un numero para imprimir en pantalla: ");
            int num = scan.nextInt();
            System.out.println("El numero ingresado es -----> " + num );

            System.out.println("Ingresa 1 para cualquier u otro numero para finalizar.");

            consulta = scan.nextInt();

        }



    }
}
