package com.rallende.poo.seccion009.c005_paquetes.prueba;


import com.rallende.poo.seccion009.c005_paquetes.aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // llama al contructor de la clase del paquete aritmetica
        Aritmetica aritmetica = new Aritmetica(5, 7);
        aritmetica.sumar();
        aritmetica.restar();
        aritmetica.multiplicar();
        aritmetica.dividir();
    }
}