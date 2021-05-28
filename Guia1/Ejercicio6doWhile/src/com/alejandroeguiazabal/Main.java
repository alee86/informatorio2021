package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int deNuevo = 1;
        int num;

        do {

            System.out.println("----------------------------------------------");
            System.out.println("Ingresa un numero para imprimirlo por pantalla");
            num = scan.nextInt();
            System.out.println("El numero es -----> " + num);

            System.out.println("Ingresa 1 si queres volver a cagar un numero:");
            deNuevo = scan.nextInt();

        }while (deNuevo == 1);
        scan.close();


    }
}
