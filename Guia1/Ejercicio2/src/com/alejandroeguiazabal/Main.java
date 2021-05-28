package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*Realizar un programa que al ejecutar se pueda ingresar 3 numeros enteros, para luego imprimirlos
por pantalla de la siguiente manera:*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros");


        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println("El primer nro ingresado es: " + num1);
        System.out.println("El segundo nro ingresado es: " + num2);
        System.out.println("El tercer nro ingresado es: " + num3);

    }
}
