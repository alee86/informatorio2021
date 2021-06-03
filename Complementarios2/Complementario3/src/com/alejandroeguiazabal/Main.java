package com.alejandroeguiazabal;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
/* 3.	Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa
(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, existe algún método que me permita hacer la
operación sort (mezclar) aleatoriamente? Idem para el reverso.  */
    public static void main(String[] args) {
        ArrayList<String> palo = new ArrayList();
        palo.add("D"); //Diamanete
        palo.add("T"); //Trevoles
        palo.add("P"); //Picas
        palo.add("C"); //Corazones

        ArrayList<String> baraja = new ArrayList<>();


        for (String p : palo) {
            for (int i = 1; i < 11; i++) {
                baraja.add(p+i);
            }
        }
        System.out.println("La baraja sin mezclar");
        System.out.print(baraja);

        System.out.println("La baraja en orden inverso");
        Collections.reverse(baraja);
        System.out.print(baraja);

        System.out.println("La baraja en orden desordenada");
        Collections.shuffle(baraja);
        System.out.print(baraja);


    }
}
