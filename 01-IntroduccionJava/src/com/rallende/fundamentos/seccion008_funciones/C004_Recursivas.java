package com.rallende.fundamentos.seccion008_funciones;

/*
* funciones recursivas: se llaman a si mismas - debe llegar a un caso base o se cae e buble
* */
public class C004_Recursivas {
    // recursiva
    static void recursiva (int n) {
        if (n==0)
            System.out.println(n);
        else{
            System.out.println(n);
            recursiva(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println();
        recursiva(5);
    }
}

