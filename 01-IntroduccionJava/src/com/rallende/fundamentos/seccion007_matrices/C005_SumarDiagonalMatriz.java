package com.rallende.fundamentos.seccion007_matrices;

import java.util.Scanner;

public class C005_SumarDiagonalMatriz {
    public static void main(String[] args) {
        int reglones, columna, suma, total;
        int [][] matriz;
        suma = 0;
        total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("reglones y columnas: ");
        reglones = Integer.parseInt(scanner.nextLine());
        columna = reglones;

        matriz = new int[reglones][columna];
        for (int i = 0; i < reglones ; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
                if (i == j){
                    suma += matriz[i][j];
                }
            }
        }
        System.out.println("Suma  Diagonal -> " + suma);
        for (int reg = 0; reg < reglones ; reg++) {
            for (int col= 0; col < columna; col++) {
                if (reg == col ){
                    System.out.println("matriz[" + reg + "][" + col + "] -> " + matriz[reg][col]);
                    total += matriz[reg][col];
                }
            }
        }
        System.out.println("Total Diagonal -> " + total);

    }
}
