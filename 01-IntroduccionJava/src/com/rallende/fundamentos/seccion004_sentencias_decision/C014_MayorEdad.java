package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;
public class C014_MayorEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_EDAD = 18;
        int valor;
        String respuesta = "";

        System.out.print("Ingresa tu edad: ");
        valor = Integer.parseInt(sc.nextLine());
        if (valor>=MAX_EDAD){
            respuesta = "mayor";
        }
        else{
            respuesta = "memor";
        }
        System.out.print("La Persona con " + valor + " Años de Edad es " + respuesta + " de edad");

    }
}
