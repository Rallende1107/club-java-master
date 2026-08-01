package com.rallende.fundamentos.seccion003_operadores;

public class C004_Logicos {
    public static void main(String[] args) {

        final boolean a = true;
        final boolean b = false;
        boolean resultado;

        System.out.println("AND = && : Regresa True si ambos se cumplen");
        resultado = a && b;
        System.out.println("Resultado de a && b : " + resultado + "| a ("+ a + ") | b ("+ b + ")");

        resultado = a && a;
        System.out.println("Resultado de a && a : " + resultado + "| a ("+ a + ") | b ("+ b + ")");

        resultado = b && b;
        System.out.println("Resultado de b && b : " + resultado + "| a ("+ a + ") | b ("+ b + ")");

        System.out.println("Or = || : Regresa True si cualquiera de los 2 casos se cumple");
        resultado = a || b;
        System.out.println("Resultado de a || b : " + resultado + "| a ("+ a + ") | b ("+ b + ")");

        resultado = a || a;
        System.out.println("Resultado de a || a : " + resultado + "| a ("+ a + ") | b ("+ b + ")");

        resultado = b || b;
        System.out.println("Resultado de b || b : " + resultado + "| a ("+ a + ") | b ("+ b + ")");

        System.out.println("Not (!) : invierte el valor logico");
        resultado = !a;
        System.out.println("Resultado de !a: " + resultado + " | a Inicial ("+ a + ")");
        resultado = !b;
        System.out.println("Resultado de !b: " + resultado + " | b Inicial ("+ b + ")");

    }
}
