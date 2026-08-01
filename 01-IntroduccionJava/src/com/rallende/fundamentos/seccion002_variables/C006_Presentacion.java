package com.rallende.fundamentos.seccion002_variables;

import java.util.Scanner;

public class C006_Presentacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, bebidaFavorita;
        int edad;
        boolean hijoUnico;
        float valorBebidaFavorita = 0f;

        System.out.print("Ingresa Tu Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingresa Tu Edad: ");
        edad = Integer.parseInt(sc.nextLine());

        System.out.print("Ingresa el nombre de tu bebida favorita: ");
        bebidaFavorita = sc.nextLine();

        System.out.print("¿Eres hijo unico? (S/N): ");
        String respuestaHijoUnico = sc.nextLine();
        hijoUnico = respuestaHijoUnico.equalsIgnoreCase("S");

        System.out.print("Valor de tu bebida favorita: ");
        valorBebidaFavorita = Float.parseFloat(sc.nextLine());

        System.out.println("#".repeat(10) + " Saludos " + "#".repeat(10));
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Bebida favorita: " + bebidaFavorita);
        System.out.println("Hijo unico: " + hijoUnico);
        System.out.println("Valor bebida favorita: " + valorBebidaFavorita);

        System.out.println("=".repeat(30));
        System.out.println("=".repeat(30));
    }
}
