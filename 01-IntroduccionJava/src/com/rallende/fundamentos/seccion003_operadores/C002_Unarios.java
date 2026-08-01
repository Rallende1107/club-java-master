package com.rallende.fundamentos.seccion003_operadores;

public class C002_Unarios {
    public static void main(String[] args) {
        final int INICIAL = 10;
        final boolean BOL_INICIAL = true;
        int a, resultado;
        boolean c, resultadoBol;

        c = BOL_INICIAL;
        // 1. Unario negativo
        a = INICIAL;
        resultado = -a;
        System.out.println("Negativo (-) -> Inicial: " + INICIAL + " | Resultado asignado (-a): " + resultado);

        // 2. Pre-incremento (++a)
        a = INICIAL;
        resultado = ++a;
        System.out.println("Pre-incremento -> Inicial: " + INICIAL + " | Resultado asignado (++a): " + resultado + " | Valor final de a: " + a);

        // 3. Post-incremento (a++)
        a = INICIAL;
        resultado = a++;
        System.out.println("Post-incremento -> Inicial: " + INICIAL + " | Resultado asignado (a++): " + resultado + " | Valor final de a: " + a);

        // 4. Pre-decremento (--a)
        a = INICIAL;
        resultado = --a;
        System.out.println("Pre-decremento -> Inicial: " + INICIAL + " | Resultado asignado (--a): " + resultado + " | Valor final de a: " + a);

        // 4. Post-decremento a(--)
        a = INICIAL;
        resultado = a--;
        System.out.println("Post-decremento -> Inicial: " + INICIAL + " | Resultado asignado a(--): " + resultado + " | Valor final de a: " + a);

        c = BOL_INICIAL;
        resultadoBol = !c;
        System.out.println("Negación (!) -> Inicial: " + BOL_INICIAL + " | Resultado asignado (!c): " + resultadoBol + " | Valor final de c: " + c);

    }
}
