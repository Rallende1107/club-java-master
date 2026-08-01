package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;

public class C009_OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingresa un numero: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Segundo numero: ");
        num2 = Integer.parseInt(sc.nextLine());

        if (num1<num2){
            System.out.print("Segundo numero es mayor");

        } else if (num1>num2) {
            System.out.print("Primer numero es mayor");
        } else {
            System.out.println("Iguales");
        }

        System.out.println(num1>num2?num1:num2);


    }
}
