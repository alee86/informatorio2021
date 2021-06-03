package com.alejandroeguiazabal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/*2.	Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al
principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el
tamaño de la misma (antes y después de agregar a en la primera y última posición).*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> listaNum = new ArrayList();
        listaNum.add(10);
        listaNum.add(20);
        listaNum.add(30);
        listaNum.add(40);
        listaNum.add(50);

        System.out.println(listaNum);

        System.out.println("Ingresa un numero al inicio de la lista");
        listaNum.add(0,scan.nextInt());

        System.out.println("Ingresa un numero al final de la lista");
        listaNum.add(6,scan.nextInt());

        System.out.println(listaNum);
        System.out.println("Esta lista tiene " + listaNum.size() + " elementos. ");





    }
}
