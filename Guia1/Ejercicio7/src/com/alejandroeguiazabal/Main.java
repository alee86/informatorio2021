package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("*****************");
        System.out.println("Ingresa 3 numeros");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        imprimir(num1, num2, num3);
    }

    public static void imprimir(int numero1, int numero2, int numero3){
        System.out.println("********************************");
        System.out.println("El primer nro ingresado es: " + numero1);
        System.out.println("El segundo nro ingresado es: " + numero2);
        System.out.println("El tercer nro ingresado es: " + numero3);
        System.out.println("********************************");

    }
}
