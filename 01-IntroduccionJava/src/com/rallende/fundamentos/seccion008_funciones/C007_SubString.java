package com.rallende.fundamentos.seccion008_funciones;

public class C007_SubString {
    public static void main(String[] args) {
        String cadena1, cadena2 ="";
        String texto = "hola mundo";

        cadena1 = texto.substring(0 , 4);
        cadena2 = texto.substring(cadena1.length(), texto.length());
        System.out.println(cadena1);
        System.out.println(cadena2);
        // caracterCadena(texto);

    }
}
