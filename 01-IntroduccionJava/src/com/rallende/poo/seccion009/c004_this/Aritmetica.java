package com.rallende.poo.seccion009.c004_this;

/**
 * OPERADOR 'this': Hace referencia al objeto actual en memoria.
 *
 * Usos principales:
 * 1. Resolver ambigüedad: Diferencia atributos de parámetros con el mismo nombre.
 *    Ejemplo: this.operando1 = operando1;
 *
 * 2. Llamar constructores: Invoca a otro constructor de la misma clase.
 *    Ejemplo: this(0, 0);
 *
 * 3. Pasar la instancia: Permite enviar el objeto actual a otros métodos o clases.
 */

public class Aritmetica {
    int operando1;
    int operando2;

    public Aritmetica() {
    }

    public Aritmetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operador This -->" + this);
    }

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

        Aritmetica aritmetica = new Aritmetica(5, 7);
        System.out.println("\n--- Objeto 1 ---");
        System.out.println("Dir. Memoria -->" + aritmetica);
        aritmetica.sumar();
        aritmetica.restar();
        aritmetica.multiplicar();
        aritmetica.dividir();

        Aritmetica aritmetica2 = new Aritmetica();
        System.out.println("\n--- Objeto 2 ---");
        System.out.println("Dir. Memoria -->" + aritmetica2);

    }
}