package com.rallende.fundamentos.seccion008_funciones;

import java.util.Scanner;

public class C011_GeneradorEmail {

    public static void main(String[] args) {
        generadorEmail();
    }


    static void generadorEmail(){
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, user, dominio;
        dominio = "@gmail.com";

        System.out.print("Dame tu Nombre: " );
        nombre = scanner.nextLine().toLowerCase();

        System.out.print("Dame tu Apellido: " );
        apellido = scanner.nextLine().toLowerCase();

        user = nombre + "." + apellido + dominio;

        System.out.println(user);
        scanner.close();
    }
}
