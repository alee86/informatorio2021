package com.alejandroeguiazabal;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
Método que devuelva el empleado más joven y el más viejo (necesito una funcion para calcular el año
basado en una fecha)
El empleado que más gana y el que menos gana.
(Opcional): Imprimir todos los empleados en orden alfabético (por nombre y por apellido).

 */
public class Main {

    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<Empleado>();

        String[] employeesData;
        BufferedReader objReader = null;
        try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader(
                    "C:\\Users\\aleja\\Desktop\\java\\informatorio2021\\" +
                            "Practica\\Propuestos\\Propuesto5v2\\src\\com\\alejandroeguiazabal\\" +
                            "empleados.txt"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                employeesData = strCurrentLine.split(";");
                listaEmpleados.add(new Empleado(employeesData[0], employeesData[1], employeesData[2], employeesData[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objReader != null) objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        for (Empleado emp : listaEmpleados) {
            emp.printName();
            //emp.printLasNeme();
            //emp.printSalary();
            //emp.printBirthDate();
        }

        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-");
        for (Empleado emp : listaEmpleados) {
            if (emp.getName().startsWith("D")) {
                emp.printName();
            }
        }
        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-");
        ArrayList<Float> sueldo = new ArrayList<Float>();
        for (Empleado emp : listaEmpleados) {
            Float f = Float.parseFloat(emp.getSalary());
            sueldo.add(f);

        }
        Collections.sort(sueldo);
        System.out.println("El sueldo mas BAJO es: $" + sueldo.get(0));
        System.out.println("El sueldo mas ALTO es: $" + sueldo.get(sueldo.size()-1));

        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-");

        ArrayList<LocalDate> antiguedad = new ArrayList<LocalDate>();
        for (Empleado emp : listaEmpleados) {
            LocalDate d = (emp.getBirthDate());
            antiguedad.add(d);

        }
        Collections.sort(antiguedad);
        System.out.println("Mas mayor " + antiguedad.get(0));
        System.out.println("Mas joven " + antiguedad.get(sueldo.size()-1));

    }
}
