package com.rallende.fundamentos.seccion007_matrices;

public class C001_EjemploMatriz {
    public static void main(String[] args) {
        // Constantes
        final int REGLONES = 2;
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
        // Acceder Matriz
        System.out.println("matriz[0][0] -> " + matriz[0][0]);
        System.out.println("matriz[0][2] -> " + matriz[1][2]);

    }
}
