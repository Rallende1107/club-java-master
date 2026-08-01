package com.rallende.fundamentos.seccion006_arreglos;

import java.util.Scanner;

public class C007_PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int cantidadNotas, total;
        total = 0;
        double promedio = 0;

        int [] notas;
        System.out.println("Sistema de clasificaciones");


        System.out.print("Indica la cantidad de notas: ");
        cantidadNotas = Integer.parseInt(scanner.nextLine());
        if (cantidadNotas <0){
            System.out.println("La cantidad de notas no puede ser 0");
            return;
        }
        else{
            notas = new int[cantidadNotas];
        }

        for (int i = 0; i < notas.length ; i++) {
            System.out.print("Indica la nota [" + (i+1) +"]: " );
            notas[i] = Integer.parseInt(scanner.nextLine());
        }
            
        for (int i = 0; i < notas.length ; i++) {
            total += notas[i];
        }
        promedio = ((double) total /cantidadNotas);
        System.out.println(promedio);
        
        scanner.close();
    }
}
