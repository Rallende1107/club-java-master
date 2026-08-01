package com.rallende.fundamentos.seccion008_funciones;

import java.util.Scanner;

public class C003_NumeroPar {
    static boolean esPar(int num){
        // boolean par = false;

        if (num % 2 ==0){ return true; }
        return false;
    }

    public static void main(String[] args) {
        boolean res;
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        num = Integer.parseInt(scanner.nextLine());
        res = esPar(num);
        if (res){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }


    }
}

