package com.alejandroeguiazabal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/*1.	Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
luego imprimir por pantalla el ranking*/
    public static void main(String[] args) {

        ArrayList ciudades = new ArrayList();

        ciudades.add("Bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");

        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i+1) + " - " + ciudades.get(i));
        }

    }
}
