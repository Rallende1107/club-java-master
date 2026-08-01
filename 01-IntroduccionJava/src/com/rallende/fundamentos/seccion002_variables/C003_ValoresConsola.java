package com.rallende.fundamentos.seccion002_variables;

import java.util.Scanner;

public class C003_ValoresConsola {
    // introducir valores por consola
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Ingresa nombre");
        String nombre = scanner.nextLine();
        System.out.println("Nombre ingresado: " + nombre);
    }


}
