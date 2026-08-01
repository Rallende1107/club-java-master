package com.rallende.fundamentos.seccion004_sentencias_decision;

public class C002_Sino {
    public static void main(String[] args) {
        boolean rain = false;
        boolean nublado = false;
        boolean soleado = true;
        if (rain){
            System.out.println("Esta lloviendo\nLa ROPA CTM");
        } else if (nublado) {
            System.out.println("Wellcome to Sillent Hill");
        } else if (soleado) {
            System.out.println(" a tomar solcito");
        } else {
            System.out.println("No Esta lloviendo\nASAO CTM");
        }
        // Todo lo que escribas aquí abajo se ejecutará SIEMPRE
        System.out.println("\nReporte del clima finalizado.");
    }
}
