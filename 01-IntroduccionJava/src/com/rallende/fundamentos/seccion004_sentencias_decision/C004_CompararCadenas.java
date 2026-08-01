package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;

public class C004_CompararCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena1, cadena2, cadena3;

        cadena1 = "rene";
        cadena2 = "allende";

        System.out.println("Ingresa un texto");
        cadena3 = sc.next();
        // en Memoria
        if (cadena1==cadena1){
            System.out.println("iguales");
        }
        else {
            System.out.println("diferentes");
        }

        if (cadena1==cadena2){
            System.out.println("iguales");
        }
        else {
            System.out.println("diferentes");
        }

        // En Contenido

        if (cadena1.equals(cadena3)){
            System.out.println("iguales");
        }
        else {
            System.out.println("diferentes");
        }

        // En Contenido
        if (cadena1.equalsIgnoreCase(cadena3)){
            System.out.println("iguales");
        }
        else {
            System.out.println("diferentes");
        }

    }
}
