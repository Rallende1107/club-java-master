package com.rallende.fundamentos.seccion005_ciclos;

import java.util.Scanner;

public class C006_Cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cajero Automatico");
        int opcion;
        double saldo, monto;
        saldo = 1000000; //inicial
        do {
            System.out.println("Menú");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu Saldo Actual es: " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar");
                    monto = scanner.nextInt();
                    if (monto > saldo) {
                        System.out.println("Fondos insuficientes. Tu saldo es: " + saldo);
                    } else {
                        saldo = saldo - monto;
                        System.out.println("Retiro exitoso. Tu nuevo saldo es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar");
                    monto = scanner.nextInt();
                    saldo += monto;
                    System.out.println("Depósito exitoso. Tu nuevo saldo es: " + saldo);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            System.out.println("=".repeat(30));
        }
        while (opcion != 4);

        scanner.close();
    }
}
