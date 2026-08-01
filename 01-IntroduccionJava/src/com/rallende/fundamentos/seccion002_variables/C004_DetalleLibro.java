package com.rallende.fundamentos.seccion002_variables;

import java.util.Scanner;

public class C004_DetalleLibro {
    // introducir valores por consola
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Ingresa Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ingresa Libro: ");
        String libro = scanner.nextLine();

        System.out.println("El libro: '" + libro + "' fue escrito por " + autor);
    }


}
