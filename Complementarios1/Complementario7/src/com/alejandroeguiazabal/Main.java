package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {
    /*7.	Realizar un Programa que dado un String de entrada en minúsculas lo
    convierta por completo a mayúsculas. Sin uso de métodos o librerías que
    realicen toUppercase().*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa la palabra o frase en minuscula");
        String frase = "informatorio"; //scan.nextLine();

        // System.out.println(upper(frase));

        for (int i = 0; i < frase.length(); i++) {
            System.out.print("#" + upper(frase.charAt(i)));
            //System.out.println(upper(frase.charAt(i)));
        }
    }

    public static String upper(char lowerCase) {
        if (lowerCase.equals("a")) {
            return "A";
        } else if (lowerCase.equals("b")) {
            return "B";
        } else if (lowerCase.equals("c")) {
            return "C";
        } else if (lowerCase.equals("d")) {
            return "D";
        } else if (lowerCase.equals("e")) {
            return "E";
        } else if (lowerCase.equals("f")) {
            return "F";
        } else if (lowerCase.equals("g")) {
            return "G";
        } else if (lowerCase.equals("h")) {
            return "H";
        } else if (lowerCase.equals("i")) {
            return "I";
        } else if (lowerCase.equals("j")) {
            return "J";
        } else if (lowerCase.equals("k")) {
            return "K";
        } else if (lowerCase.equals("l")) {
            return "L";
        } else if (lowerCase.equals("m")) {
            return "M";
        } else if (lowerCase.equals("n")) {
            return "N";
        } else if (lowerCase.equals("ñ")) {
            return "Ñ";
        } else if (lowerCase.equals("o")) {
            return "O";
        } else if (lowerCase.equals("p")) {
            return "P";
        } else if (lowerCase.equals("q")) {
            return "Q";
        } else if (lowerCase.equals("r")) {
            return "R";
        } else if (lowerCase.equals("s")) {
            return "S";
        } else if (lowerCase.equals("t")) {
            return "T";
        } else if (lowerCase.equals("u")) {
            return "U";
        } else if (lowerCase.equals("v")) {
            return "V";
        } else if (lowerCase.equals("w")) {
            return "W";
        } else if (lowerCase.equals("x")) {
            return "X";
        } else if (lowerCase.equals("y")) {
            return "Y";
        } else if (lowerCase.equals("z")) {
            return "Z";
        } else {
            return "";
        /*return switch (lowerCase) {
            case "a" -> "A";
            case "b" -> "B";
            case "c" -> "C";
            case "d" -> "D";
            case "e" -> "E";
            case "f" -> "F";
            case "g" -> "G";
            case "h" -> "H";
            case "i" -> "I";
            case "j" -> "J";
            case "k" -> "K";
            case "l" -> "L";
            case "m" -> "M";
            case "n" -> "N";
            case "ñ" -> "Ñ";
            case "o" -> "O";
            case "p" -> "P";
            case "q" -> "Q";
            case "r" -> "R";
            case "s" -> "S";
            case "t" -> "T";
            case "u" -> "U";
            case "v" -> "V";
            case "w" -> "W";
            case "x" -> "X";
            case "y" -> "Y";
            case "z" -> "Z";
        };*/
        }
    }
}
