package com.alejandroeguiazabal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
/* 6.	Se dispone de una lista de Empleados, de cada empleado se conoce:
○	Nombre y Apellido
○	DNI
○	horasTrabajadas
○	valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario)
donde la clave (key) es el dni y el valor (value) es el sueldo calculado. */

    public static void main(String[] args) {
        HashMap<Integer, Integer> Diccionario; //Definiendo el tipo de dato que va a contener la variable diccionario (def de la variable)
        Diccionario = new HashMap<>(); //investigar los tipos de datos

        Set<Empleado> lista ; //definimos lista como una  collection Set que contiene empleados
        lista = new HashSet<>(); // al ser set una interfase, la instanciamos como HasSet
        lista.add(new Empleado("Lola", "Mento", 12457845, 8, 340));
        //instanciar un nuevo objeto empleado, al cual le asigne los valores a sus propiedades, para agregar a la colection lista.
        lista.add(new Empleado("Luz", "Roja", 98653298, 4, 332));
        lista.add(new Empleado("Armando Esteban", "Quito", 54876532, 5, 310));
        lista.add(new Empleado("Paca", "Garte", 56238945, 6, 456));
        lista.add(new Empleado("Elena", "Nito", 32216554, 8, 440));

        for (Empleado emp : lista) {
            int sueldo = Empleado.calcularSueldo(emp.horasTrabajadas, emp.valoPorHora);
            Diccionario.put(emp.dni, sueldo);
        }
        System.out.print(Diccionario);
    }
}
