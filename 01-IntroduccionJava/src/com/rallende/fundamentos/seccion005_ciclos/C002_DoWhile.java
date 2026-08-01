package com.rallende.fundamentos.seccion005_ciclos;

public class C002_DoWhile {
    public static void main(String[] args) {
        int contador = 0;
        final int LIMITE = 5;
        do {
            System.out.println(contador);
            contador++;
        }
        while (contador<=LIMITE);
    }
}
