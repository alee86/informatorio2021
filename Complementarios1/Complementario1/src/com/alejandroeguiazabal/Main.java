package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
/*1.	Solicitar por consola el nombre del usuario e imprimir por pantalla el
siguiente mensaje “HOLA {USUARIO}!!!”*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre?");
        String nombre = scan.nextLine();

        String imprimir = greeting(nombre);

        for (int i = 0; i < imprimir.length(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println(imprimir);

        for (int i = 0; i < imprimir.length(); i++) {
            System.out.print("*");
        }

    }

    public static String greeting(String name) {
        return "* Hola " + name +"!!! *";
    }

}
