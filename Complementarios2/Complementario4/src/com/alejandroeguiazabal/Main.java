package com.alejandroeguiazabal;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
/* 4.	Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3
cursos (3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?
 */
    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<String>();
        estudiantes.add("Paloma");
        estudiantes.add("Almendra");
        estudiantes.add("Camilo");
        estudiantes.add("Alejandro");
        estudiantes.add("Cecilia");
        estudiantes.add("Agusto");
        estudiantes.add("Damian");
        estudiantes.add("Claudia");
        estudiantes.add("Cintia");
        estudiantes.add("Cristian");
        estudiantes.add("Homero");
        estudiantes.add("Lisa");
        estudiantes.add("Bart");

        ArrayList<String> estudiantes1 = new ArrayList<String>(estudiantes.subList(0,3));
        ArrayList<String> estudiantes2 = new ArrayList<String>(estudiantes.subList(4,7));
        ArrayList<String> estudiantes3 = new ArrayList<String>(estudiantes.subList(8,11));

        System.out.println("Lista total de Alumnos");
        System.out.print(estudiantes);
        System.out.println("");
        System.out.println("");

        System.out.println("Lista curso 1");
        System.out.println(estudiantes1);

        System.out.println("Lista curso 2");
        System.out.println(estudiantes2);

        System.out.println("Lista curso 3");
        System.out.println(estudiantes3);
    }
}
