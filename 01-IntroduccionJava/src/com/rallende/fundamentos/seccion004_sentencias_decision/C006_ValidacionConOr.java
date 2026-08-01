package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;

public class C006_ValidacionConOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user, pass, user_valido, pass_valido;
        boolean diaDescanso, vacaciones;
        diaDescanso = true;
        vacaciones = false;

        if (diaDescanso || vacaciones){
            System.out.println("Carrete");
        }
        else {
            System.out.println("Sin Carrete");
        }
    }
}
