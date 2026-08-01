package com.rallende.fundamentos.seccion003_operadores;

public class C001_Aritmeticos {
    public static void main(String[] args) {
        int a, b, resultado;
        a = 3;
        b = 2;
        resultado = 0;
        // suma
        resultado = a + b;
        System.out.println("Resultado Suma (+) de " + a + " y " + b + " es " + resultado);
        // resta
        resultado = a - b;
        System.out.println("Resultado resta (-) de " + a + " y " + b + " es " + resultado);

        resultado = a * b;
        System.out.println("Resultado multiplicacion (*) de " + a + " y " + b + " es " + resultado);

        resultado = a / b;
        System.out.println("Resultado division (/) de " + a + " y " + b + " es " + resultado);

        resultado = a % b;
        System.out.println("Resultado Mopulo  (%) resudio de divicion de " + a + " y " + b + " es " + resultado);
    }
}
