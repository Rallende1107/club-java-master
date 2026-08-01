package com.rallende.fundamentos.seccion008_funciones;

public class C002_Sumar {
    static int sumar(int a, int b){
        int total = 0;
        total = a + b;
        return total;
    }

    public static void main(String[] args) {
        int c, d, res;
        c = 5;
        d = 5;
        res = 0;

        res = sumar(c,d);
        System.out.println(res);

        res = sumar(8,9);
        System.out.println(res);
    }
}

