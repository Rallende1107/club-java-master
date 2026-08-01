package com.rallende.fundamentos.seccion005_ciclos;

public class C004_SumaAcumulativa {
    public static void main(String[] args) {
        int total = 0;
        int contador = 0;
        final int LIMITE = 5;
        for (contador=1; contador<=LIMITE; contador++){
            System.out.println("total + numero -> " + total + " + " + contador);
            total += contador;
           System.out.println("Acumulado -> " + total);
        }
        System.out.println("total " + total);
    }
}
