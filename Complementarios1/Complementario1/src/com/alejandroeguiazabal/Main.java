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

        System.out.print(box(imprimir.length()));
        System.out.println("");
        System.out.println(imprimir);
        System.out.print(box(imprimir.length()));
    }

    public static String greeting(String name) {
        return "* Hola " + name +"!!! *";
    }

    public static String box(int numero){
        for (int i = 0; i < numero; i++){
            System.out.print("*");
        } return "";
    }
}
