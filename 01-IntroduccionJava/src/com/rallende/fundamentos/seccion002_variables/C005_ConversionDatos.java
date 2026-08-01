package com.rallende.fundamentos.seccion002_variables;

import java.util.Scanner;

public class C005_ConversionDatos {
    public static void main(String[] args) {
        // Convercion tipo de datos
        Scanner consola = new Scanner(System.in);

        int numero1 = 0;
        while (true) {
            System.out.print("Numero 1: ");
            try {
                numero1 = Integer.parseInt(consola.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número, intenta de nuevo.");
            }
        }

        int numero2 = 0;
        while (true) {
            System.out.print("Numero 2: ");
            try {
                numero2 = Integer.parseInt(consola.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número, intenta de nuevo.");
            }
        }

        int total = numero1+numero2;
        System.out.print("Total es : "  + total);

    }
}
