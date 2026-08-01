package com.rallende.fundamentos.seccion002_variables;

public class C008_Constante {
    public static void main(String[] args) {
        final int MI_CONSTANTES = 10;

        System.out.println(MI_CONSTANTES);
        // MI_CONSTANTES = 13; no se puede
        var valorPi = Math.PI;
        System.out.println("Constante PI " + valorPi);
        System.out.println("Constante PI " + Math.PI);

        final int SEG_X_MIN = 60;

        System.out.println("Segundos por Minuto " + SEG_X_MIN);

    }
}
