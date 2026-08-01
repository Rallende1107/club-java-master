package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;

public class C015_SistemaClasificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        String nota = "";
        System.out.print("Ingresa clasificacion 0 a 10: ");
        valor = Integer.parseInt(sc.nextLine());
        if (valor >= 9 && valor <= 10) {
            nota = "A";
        }
        else if (valor >= 8 && valor < 9) {
            nota = "B";
        }
        else if (valor >= 7 && valor < 8) {
            nota = "C";
        }
        else if (valor >= 6 && valor < 7) {
            nota = "D";
        }
        else if (valor >= 0 && valor < 6) {
            nota = "F";
        }
        else {
            nota = "Desconocida";
        }

        System.out.print("La Persona con " + valor + " de Nota tiene una " + nota + "");

    }
}
