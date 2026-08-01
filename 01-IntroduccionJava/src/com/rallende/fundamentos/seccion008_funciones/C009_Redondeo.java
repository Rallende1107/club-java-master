package com.rallende.fundamentos.seccion008_funciones;

import java.text.DecimalFormat;

public class C009_Redondeo {
    public static void main(String[] args) {
        // > .5 Redondea al siguiente
        double decimal;
        int numero;

        var patron = "#.#";
        var decimalFormat = new DecimalFormat(patron);
        decimal = 8.49555;

        var numFormat = decimalFormat.format(decimal);
        numero = (int) Math.round(decimal);
        System.out.println("Valor inicial ->" +  decimal + " Redondeo " + numero);
        System.out.println("Valor inicial ->" +  decimal + " decimalFormat " + numFormat);

        var patron2 = "#.##";

        decimal = 8.545;
        var decimalFormatv2 = new DecimalFormat(patron2);
        var numFormat2 = decimalFormatv2.format(decimal);
        numero = (int) Math.round(decimal);
        System.out.println("Valor inicial ->" +  decimal + " Redondeo " + numero);
        System.out.println("Valor inicial ->" +  decimal + " decimalFormat " + numFormat2);


    }
}
