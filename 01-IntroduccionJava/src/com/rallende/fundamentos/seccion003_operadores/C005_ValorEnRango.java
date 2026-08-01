package com.rallende.fundamentos.seccion003_operadores;

import java.util.Scanner;

public class C005_ValorEnRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean enrango;
        int valor;
        final int MIN = 0;
        final int MAX = 10;

        System.out.print("Ingresa el Valor: ");
        valor = Integer.parseInt(sc.nextLine());

        enrango = valor >= MIN && valor <= MAX;
        System.out.println(enrango);
    }
}
