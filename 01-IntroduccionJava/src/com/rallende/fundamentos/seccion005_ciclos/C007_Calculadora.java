package com.rallende.fundamentos.seccion005_ciclos;

import java.util.Scanner;

public class C007_Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        int opcion, num1, num2;
        double res;
        boolean salir = false;

        while (salir == false) {
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Modulo");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 6) {
                System.out.println("Saliendo...");
                salir = true;
                continue;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción no válida");
                continue;
            }

            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    res = num1 + num2;
                    System.out.println("Resultado: " + res);
                }
                case 2 -> {
                    res = num1 - num2;
                    System.out.println("Resultado: " + res);
                }
                case 3 -> {
                    res = num1 * num2;
                    System.out.println("Resultado: " + res);
                }
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error: no se puede dividir entre 0");
                    } else {
                        res = (double) num1 / num2;
                        System.out.println("Resultado: " + res);
                    }
                }
                case 5 -> {
                    if (num2 == 0) {
                        System.out.println("Error: no se puede calcular el módulo entre 0");
                    } else {
                        res = num1 % num2;
                        System.out.println("Resultado: " + res);
                    }
                }
            }
        }
        scanner.close();
    }
}
