package com.rallende.poo.seccion009.c006_encapsulamiento.prueba;

import com.rallende.poo.seccion009.c006_encapsulamiento.aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("Ejemplo Aritmetica");
        Aritmetica aritmetica = new Aritmetica(5, 7);

        System.out.println("Aritmetica Numero 1: " + aritmetica.getNumero1());
        System.out.println("Aritmetica Numero 2: " + aritmetica.getNumero2());
        aritmetica.setNumero1(50);
        aritmetica.setNumero2(70);
        System.out.println("Aritmetica Numero 1: " + aritmetica.getNumero1());
        System.out.println("Aritmetica Numero 2: " + aritmetica.getNumero2());

        aritmetica.sumar();
    }
}
