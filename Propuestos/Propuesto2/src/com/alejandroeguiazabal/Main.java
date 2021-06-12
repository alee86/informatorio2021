package com.alejandroeguiazabal;

public class Main {
/*
Ejercicio 3:
Dado un archivo de texto (alumnos.txt), crear una función que lea todos los nombres de los
alumnos y los imprima por pantalla.
Observación: Cada línea del archivo representa un nombre de alumno.
 */
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

        private static int factorial(int num) {
            int reductor = num;
            if (reductor !=1){
                reductor = reductor * factorial(num-1);
            }
            return reductor;
        }

    }
