package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;
/*
* Mes 1, 2 o 12 = Invierno
* Mes 3, 4 o 5 = Primavera
* Mes 6, 7 o 8 = Verano
* Mes 9, 10 o 11 = Otoño
* Mes X = Desonocnido
* */

public class C012_EstacionMesSwitch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        String estacion = "Desconocida";
        System.out.print("Ingresa el mes: ");
        mes = Integer.parseInt(sc.nextLine());
        switch (mes){
            case 1 -> estacion = "Invierno";
            case 2 -> estacion = "Invierno";
            case 12 -> estacion = "Invierno";
            case 3 -> estacion = "Primavera";
            case 4 -> estacion = "Primavera";
            case 5 -> estacion = "Primavera";
            case 6 -> estacion = "Verano";
            case 7 -> estacion = "Verano";
            case 8 -> estacion = "Verano";
            case 9 -> estacion = "Otoño";
            case 10 -> estacion = "Otoño";
            case 11 -> estacion = "Otoño";
        }
        System.out.print("La estacion para el mes " + mes + " es " + estacion);

    }
}
