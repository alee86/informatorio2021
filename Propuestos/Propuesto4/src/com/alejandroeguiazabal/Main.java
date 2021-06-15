package com.alejandroeguiazabal;


import java.util.ArrayList;

public class Main {
/*
Ejercicio 4: Teniendo una lista de objetos Empleado, cargar la misma en un archivo empleado.txt.
Observación: Cada empleado se almacena en una sola líne con el formato que uds definan.
 */
    public static void main(String[] args) {

        //CreateFile.createNewFile();

        ArrayList<Employees> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new Employees("GABRIELA DE LUJAN;41000;12:00 a 18:00;32000001;WAHA;6x6"));
        listaEmpleados.add(new Employees("JUDITH;41001;09:00 a 15:00;32000002;WAHA;6x5"));
        listaEmpleados.add(new Employees("NOEMI;41002;09:00 a 15:00;32000003;WAHA;6x5"));
        listaEmpleados.add(new Employees("LORENA;41003;09:00 a 15:00;32000004;Presencial;6x5"));
        listaEmpleados.add(new Employees( "41004;14:00 a 20:00 ;32000005;WAHA;6x5"));
        listaEmpleados.add(new Employees("BELEN;41005;09:00 a 15:00 ;32000006;Presencial;6x5"));

        WriteFile.writeNewFile(listaEmpleados);

    }
}
