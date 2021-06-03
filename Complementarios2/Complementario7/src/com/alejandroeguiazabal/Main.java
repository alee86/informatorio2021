package com.alejandroeguiazabal;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/*
7.	Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva
un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es
multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos
 colocara “FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor
debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4

 */
    public static void main(String[] args) {

        System.out.println("Ingrese dos números enteros (el primero menor que el segundo): ");
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        System.out.print(frase(numero1, numero2));
        scan.close();
    }

    public static List frase(int num1, int num2) {

        List numeros = new List();
        for(int i = num1;i < num2; i++) {
            if((i % 2 == 0) && (i % 3 == 0)) {
                numeros.add("FizzBuzz");
            }
            else if(i % 2 == 0) {
                numeros.add("Fizz");
            }
            else if(i % 3 == 0) {
                numeros.add("Buzz");
            }
            else {
                String b = String.valueOf(i);
                numeros.add(b);
            }
        }
        return numeros;
    }
}