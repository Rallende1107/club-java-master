package com.rallende.poo.seccion009.c002;

public class Aritmetica {
    int operando1;
    int operando2;

    void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("Resultado suma: " +  resultado) ;
    }
    void restar(){
        int resultado = operando1 - operando2;
        System.out.println("Resultado resta: " +  resultado) ;
    }
    void multiplicar(){
        int resultado = operando1 * operando2;
        System.out.println("Resultado multiplicación: " +  resultado) ;
    }
    void dividir(){
        double resultado = (double) operando1 / operando2;
        System.out.println("Resultado divición: " +  resultado) ;
    }




    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.operando1 = 5;
        aritmetica.operando2 = 7;
        aritmetica.sumar();
        aritmetica.restar();
        aritmetica.multiplicar();
        aritmetica.dividir();

        Aritmetica aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();
        aritmetica2.multiplicar();
        aritmetica2.dividir();

    }
}