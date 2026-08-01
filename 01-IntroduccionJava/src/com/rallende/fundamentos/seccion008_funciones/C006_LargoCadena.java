package com.rallende.fundamentos.seccion008_funciones;

public class C006_LargoCadena {
    static long largoCadena (String texto) {
        long largo;
        largo = texto.length();
        return largo;
    }

    static void caracterCadena (String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(i + " = " + texto.charAt(i));
        }


    }
    public static void main(String[] args) {
        System.out.println();
        long x;
        String texto = "hola mundo";
        x = largoCadena(texto);
        System.out.println(x);
        caracterCadena(texto);

    }
}
