package com.rallende.fundamentos.seccion008_funciones;

import java.util.Random;

public class C008_NumeroRamdom {
    public static void main(String[] args) {
        Random random  = new Random();
        int numero, min, max ;
        numero = random.nextInt(10, 20+1);
        System.out.println(numero);
        min = 100;
        max = 200;
        numero = random.nextInt(min, max+1);
        System.out.println(numero);
    }
}
