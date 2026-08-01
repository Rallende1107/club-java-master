package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;
/*
* Mes 1, 2 o 12 = Invierno
* Mes 3, 4 o 5 = Primavera
* Mes 6, 7 o 8 = Verano
* Mes 9, 10 o 11 = Otoño
* Mes X = Desonocnido
* */

public class C011_EstacionMesSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        String estacion = "Desconocida";
        System.out.print("Ingresa el mes: ");
        mes = Integer.parseInt(sc.nextLine());
//
//        if (mes<1 || mes>12){System.out.print("Invalido");}
//        else if (mes==1 || mes==2 || mes==12){System.out.print("Invierno");}
//        else if (mes==3 || mes==4 || mes==5) {System.out.print("Primavera");}
//        else if (mes==6 || mes==7 || mes==8) {System.out.print("Verano");}
//        else if (mes==9 || mes==10 || mes==11) {System.out.print("Otoño");}
        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
        }
        System.out.print("La estacion para el mes " + mes + " es " + estacion);

    }
}
