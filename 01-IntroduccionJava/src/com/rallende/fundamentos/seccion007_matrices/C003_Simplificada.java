package com.rallende.fundamentos.seccion007_matrices;

public class C003_Simplificada {
    public static void main(String[] args) {
        // Definir matriz
        int [][] matriz = {{100,200,300},{500,600,700}};
        // Iterar Matriz
        for (int reg = 0; reg < matriz.length ; reg++) {
            for (int col = 0; col < matriz[reg].length; col++) {
                System.out.println("matriz[" + reg + "][" + col + "] -> " + matriz[reg][col]);
            }
        }
    }
}
