package com.alejandroeguiazabal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class WriteFile {

  public static void writeNewFile(ArrayList<Employees> listaEmpleados) {

    try {
      FileWriter myWriter = new FileWriter(
              "C:\\Users\\aleja\\Desktop\\java\\informatorio2021\\Practica\\Propuestos\\" +
                      "Propuesto4\\src\\com\\alejandroeguiazabal\\empleados.txt");
      PrintWriter printWriter = new PrintWriter(myWriter);

      for (Employees employee : listaEmpleados) {
        printWriter.println(employee.getEmpleado());
        System.out.println(employee.getEmpleado());
      }

      System.out.println("Se cargo de manera correcta el archivo");
    } catch (IOException e){
      System.out.println("Rompiste algo...siempre triunfando.");
      e.printStackTrace();
    }
  }
}
