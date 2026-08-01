package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;
/*
* Mes 1, 2 o 12 = Invierno
* Mes 3, 4 o 5 = Primavera
* Mes 6, 7 o 8 = Verano
* Mes 9, 10 o 11 = Otoño
* Mes X = Desonocnido
* */

public class C013_DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        String dia = "Desconocido";
        System.out.print("Ingresa el dia: ");
        valor = Integer.parseInt(sc.nextLine());
        switch (valor){
            case 1 -> dia = "Lunes";
            case 2 -> dia = "Martes";
            case 3 -> dia = "Miercoles";
            case 4 -> dia = "Jueves";
            case 5 -> dia = "Viernes";
            case 6 -> dia = "Sabado";
            case 7 -> dia = "Doming";
        }
        System.out.print("Ei Dia " + valor + " es " + dia);

    }
}
