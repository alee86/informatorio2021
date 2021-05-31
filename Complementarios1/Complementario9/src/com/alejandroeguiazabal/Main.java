package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
    /*9.	Dado un String de entrada (frase, texto, etc) calcular la cantidad
    de veces que aparece una letra dada.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escribi una frase: ");
        String frase = scan.nextLine();

        System.out.println("Letra queres saber si se repite?");
        char letra = scan.next().charAt(0); //no hay un nextChar
        scan.close();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}