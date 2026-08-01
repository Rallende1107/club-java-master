package com.rallende.fundamentos.seccion007_matrices;

import java.util.Scanner;

public class C004_PoblarMatriz {
    public static void main(String[] args) {
        int reglones, columna;
        int [][] matriz;
        Scanner scanner = new Scanner(System.in);

        System.out.print("reglones: ");
        reglones = Integer.parseInt(scanner.nextLine());

        System.out.print("columna: ");
        columna = Integer.parseInt(scanner.nextLine());
        matriz = new int[reglones][columna];
        for (int i = 0; i < reglones ; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int reg = 0; reg < reglones ; reg++) {
            for (int col= 0; col < columna; col++) {
                System.out.println("matriz[" + reg + "][" + col + "] -> " + matriz[reg][col]);
            }
        }

    }
}
