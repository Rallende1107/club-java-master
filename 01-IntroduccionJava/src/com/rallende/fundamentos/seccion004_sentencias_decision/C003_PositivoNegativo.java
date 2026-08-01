package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;

public class C003_PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero:");
        num = Integer.parseInt(sc.nextLine());
        if (num > 0){
            System.out.println(num + " Positivo");
        } else if (num < 0) {
            System.out.println(num + " Negativo");
        } else {
            System.out.println(num + " es Cero");
        }
        // Todo lo que escribas aquí abajo se ejecutará SIEMPRE
        System.out.println("\nAdios.");
    }
}
