package com.rallende.fundamentos.seccion006_arreglos;

import java.util.Scanner;

public class C006_ValoresDelArreglo {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int largoArreglo;
        int [] enteros;

        System.out.println("Indica el largo del arreglo");
        largoArreglo = Integer.parseInt(scanner.nextLine());
        if (largoArreglo<0){
            System.out.println("El largo del arreglo debe ser mayor a 0");
            return;
        }
        else{
            enteros = new int[largoArreglo];
            System.out.println("¡Arreglo de " + enteros.length + " posiciones creado con éxito!");
        }

        for (int i = 0; i < enteros.length ; i++) {
            System.out.print("Valor del indice [" + i +"]: " );
            enteros[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
        for (int i = 0; i < enteros.length ; i++) {
            System.out.println("Valor del indice [" + i +"] --> " +enteros[i]);
        }
        scanner.close();
    }
}
