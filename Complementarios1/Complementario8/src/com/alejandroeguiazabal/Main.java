package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
/*8.	Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indicanos la ciudad en la que vivis");
        String ciudad = scan.nextLine();
        System.out.println("Indicanos tu direccion actual:");
        String direccion = scan.nextLine();
        System.out.println("Que edad tenes?");
        String edad = scan.nextLine();
        System.out.println("Cual es tu nombre completo?");
        String nombreCompleto = scan.nextLine();

        System.out.println(ciudad +" - "+ direccion +" - "+ edad +" - "+ nombreCompleto);
        //hacer el mismo codigo usando bibliotas
    }
}
