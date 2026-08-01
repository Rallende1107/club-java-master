package com.rallende.poo.seccion009.c005_paquetes.aritmetica;

public class Aritmetica {
    int operando1;
    int operando2;

    public Aritmetica() { }

    public Aritmetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    // metodos
    public void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("Resultado suma: " +  resultado) ;
    }

    public void restar(){
        int resultado = operando1 - operando2;
        System.out.println("Resultado resta: " +  resultado) ;
    }

    public void multiplicar(){
        int resultado = operando1 * operando2;
        System.out.println("Resultado multiplicación: " +  resultado) ;
    }

    public void dividir(){
        double resultado = (double) operando1 / operando2;
        System.out.println("Resultado divición: " +  resultado) ;
    }
}
