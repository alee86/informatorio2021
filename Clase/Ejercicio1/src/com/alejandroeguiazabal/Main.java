package com.alejandroeguiazabal;

public class Main {

    public static void main(String[] args) {

        int resultado = factorial(134);
        System.out.println(resultado);

    }

    private static int factorial(int valor) {
        for (int i = 1; i <= valor; i++) {
            int producto = 1;
            producto = i * producto;

        }
    }
}