package com.rallende.fundamentos.seccion008_funciones;

public class C005_Fibonacci {
    static void fibonacci (int n) {
        long a = 0, b = 1, total = 0, siguiente = 0;
        System.out.print("Valores: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            total += a;
            siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
        System.out.println("Suma total = " + total);
    }

    public static void main(String[] args) {
        System.out.println();
        fibonacci(5);
    }
}
