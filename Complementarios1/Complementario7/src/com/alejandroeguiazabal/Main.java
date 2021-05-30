package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
    /*7.	Realizar un Programa que dado un String de entrada en minúsculas lo
    convierta por completo a mayúsculas. Sin uso de métodos o librerías que
    realicen toUppercase().*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa la palabra o frase en minuscula");
        String frase = scan.nextLine();

        char letras[] = frase.toCharArray();

        for (int i = 0; i < letras.length; i++) {

            if (letras[i] <= 122 && letras[i] >=97 ) { //solo voy a tener en cuenta letras
                System.out.print((char) (letras[i]-32));
            } else {
                System.out.print((char) (letras[i]));
            }
        }
    }
}