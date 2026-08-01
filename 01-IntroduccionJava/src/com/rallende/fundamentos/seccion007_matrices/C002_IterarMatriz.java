package com.rallende.fundamentos.seccion007_matrices;

public class C002_IterarMatriz {
    public static void main(String[] args) {
        // Constantes
        final int REGLONES = 3;
        final int COLUMNAS = 3;
        // Definir matriz
        int [][] matriz = new int[REGLONES][COLUMNAS];
        // llenar matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900;
        // Iterar Matriz
        for (int reg = 0; reg < REGLONES ; reg++) {
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.println("matriz[" + reg + "][" + col + "] -> " + matriz[reg][col]);
            }

        }
    }
}
