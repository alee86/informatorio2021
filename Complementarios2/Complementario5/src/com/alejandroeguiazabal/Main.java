package com.alejandroeguiazabal;

import java.util.ArrayList;

public class Main {
/* 5.	Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del
resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los
totales y luego imprimir el total final a cobrar.  */

    public static void main(String[] args) {

        ArrayList<Integer> horasTrabajadas = new ArrayList();
        ArrayList<Integer> valorHora = new ArrayList();
        ArrayList<Integer> valorTotal = new ArrayList();

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);

        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);

        for (int i = 0; i < 5; i++) {
            valorTotal.add(valorHora.get(i)*horasTrabajadas.get(i));
        }
        System.out.println(valorTotal);

        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += valorTotal.get(i);
        }
        System.out.println("Valor total $" + suma);
    }
}
