package com.rallende.fundamentos.seccion006_arreglos;

public class C005_RecorrerArreglo {
    public static void main(String[] args) {
        // declarar arreglo
        int [] enteros = {100,200,300,400,500};

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Indice " + i + " -> "+ enteros[i]);
        }
    }
}
