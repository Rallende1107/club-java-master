package com.rallende.fundamentos.seccion005_ciclos;

public class C001_While {
    public static void main(String[] args) {
        int contador = 0;
        final int LIMITE = 5;
        while (contador<=LIMITE){
            System.out.println(contador);
            contador++;
        }
    }
}
