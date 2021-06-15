package com.alejandroeguiazabal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/*
Ejercicio Propuesto #5:
Dado un archivo de texto (.txt) con el siguiente formato:
{nombre},{apellido},{fecha de nacimiento},{sueldo}

Donde:
Nombre, apellido: String
fecha de nacimiento: Fecha con formato (dia-mes-año, ejemplo: 23-05-2021)
Sueldo: es numérico con decimales.

Ejemplo:
Carlos,Sanchez,20-01-1980,45678.08

Cálculos (sobre la lista final):
Método que devuelva todos los empleados que comienzan con una letra dada en el apellido
Método que devuelva el empleado más joven y el más viejo (necesito una funcion para calcular el año basado en una fecha)
El empleado que más gana y el que menos gana.
(Opcional): Imprimir todos los empleados en orden alfabético (por nombre y por apellido).

 */

public class Main {

    public static void main(String[] args) {

        Set<Employee> listaEmployees = null;
        listaEmployees = new HashSet<>();

        String[] employeesData;
        BufferedReader objReader = null;
        try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader(
                    "C:\\Users\\aleja\\Desktop\\java\\informatorio2021\\Practica\\Propuestos" +
                            "\\Propuesto5\\src\\com\\alejandroeguiazabal\\empleados.txt"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                employeesData = strCurrentLine.split(";");
                listaEmployees.add(new Employee(employeesData[0], employeesData[1], employeesData[2], employeesData[3]));
            } for (Employee emp : listaEmployees) { //cargando los datos.
                System.out.println(emp.name.toString());
                System.out.println(emp.lastName.toString());
                System.out.println(emp.birthDate.toString());
                System.out.println("$" + emp.salary.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (objReader!= null) objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }
}
