package com.alejandroeguiazabal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    /*
    Ejercicio 3:
    Dado un archivo de texto (alumnos.txt), crear una función que lea todos los nombres de los
    alumnos y los imprima por pantalla.
    Observación: Cada línea del archivo representa un nombre de alumno.
     */
    public static void main(String[] args) {

        //Se cargaron dos formas para poder leer el archivo con las excepciones.
        System.out.println("meotodo1 *****************************");

       Path path = Paths.get("C:\\Users\\aleja\\Desktop\\java\\informatorio2021\\Practica\\Propuestos\\Propuesto3\\src\\com\\alejandroeguiazabal\\empleados.txt");
        try {
            String content = Files.readString(path);
            System.out.println(content);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("meotodo2 *****************************");
        try {
            File myFile = new File("C:\\Users\\aleja\\Desktop\\java\\informatorio2021\\Practica\\Propuestos\\Propuesto3\\src\\com\\alejandroeguiazabal\\empleados.txt");
            Scanner scan = new Scanner(myFile);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("La mokeaste vieji.");
            e.printStackTrace();


        }
    }
}
