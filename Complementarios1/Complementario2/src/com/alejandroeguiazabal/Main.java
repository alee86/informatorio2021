package com.alejandroeguiazabal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*2.	Realizar un programa que solicite por consola 2 números enteros.
Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo
(resto de la división) de ambos números.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el primer valor:");
        int num1 = scan.nextInt();
        System.out.println("Ingresa el segundo valor:");
        int num2 = scan.nextInt();

        System.out.println("Los resultados de las operaciones son:");

        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2;
        int modulo = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println(num1 + " / " + num2 + " = " + cociente);
        System.out.println(num1 + " % " + num2 + " = " + modulo);

    }
}
