package com.rallende.fundamentos.seccion003_operadores;

public class C003_Relacionales {
    public static void main(String[] args) {
        int a, b;
        boolean res;
        String c, d;
        a = 2;
        b = 3;
        c = "R";
        d = "r";

        // Igualdad
        res = a == b;
        System.out.println("Igualdad (==) -> " + a + " == " + b + "  | Resultado: " + res);

        res = c == d;
        System.out.println("Igualdad (==) -> " + c + " == " + d + "  | Resultado: " + res);

        res = a != b;
        System.out.println("Diferente (!=) -> " + a + " != " + b + "  | Resultado: " + res);

        res = a > b;
        System.out.println("Mayor que (>) -> " + a + " > " + b + "  | Resultado: " + res);

        res = a < b;
        System.out.println("Menor que (<) -> " + a + " < " + b + "  | Resultado: " + res);

        res = a >= b;
        System.out.println("Mayor o igual (>=) -> " + a + " >= " + b + "  | Resultado: " + res);

        res = a <= b;
        System.out.println("Menor o igual (<=) -> " + a + " <= " + b + "  | Resultado: " + res);

    }
}
