package com.rallende.fundamentos.seccion008_funciones;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class C010_GeneradorIdUnico {
    static String valorRamdom(){
        Random random  = new Random();
        String formarNumber, patron;
        patron = "####";
        DecimalFormat formato = new DecimalFormat(patron);
        int numero = random.nextInt(1000, 9999);
        formarNumber = formato.format(numero);
        return formarNumber;
    }

    static String caracteres( int inicio, int fin, String texto){
        String caracteres;
        caracteres = texto.substring(inicio, fin);
        return caracteres.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, user, anio, aleatorio;
        System.out.print("Dame tu Nombre: " );
        aleatorio = valorRamdom();
        nombre = scanner.nextLine().toUpperCase();

        System.out.print("Dame tu Apellido: " );
        apellido = scanner.nextLine();

        System.out.print("Dame tu Año Nacimientos: " );
        anio = scanner.nextLine();

        nombre = caracteres(0,2, nombre);
        apellido = caracteres(0,2, apellido);
        anio = caracteres(2, 4, anio);

        user = nombre + apellido + anio + aleatorio;

        System.out.println(user);
        scanner.close();
    }
}
