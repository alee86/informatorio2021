package com.alejandroeguiazabal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Ingresar un numero: ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (i*num));
        }


    }
}
