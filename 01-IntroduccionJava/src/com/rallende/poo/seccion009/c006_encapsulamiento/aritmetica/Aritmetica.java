package com.rallende.poo.seccion009.c006_encapsulamiento.aritmetica;

public class Aritmetica {
    private int numero1;
    private int numero2;

    public Aritmetica() {  }

    public Aritmetica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return this.numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // metodos
    public void sumar(){
        int resultado = numero1 + numero2;
        System.out.println("Resultado suma: " +  resultado) ;
    }

    public void restar(){
        int resultado = numero1 - numero2;
        System.out.println("Resultado resta: " +  resultado) ;
    }

    public void multiplicar(){
        int resultado = numero1 * numero2;
        System.out.println("Resultado multiplicación: " +  resultado) ;
    }

    public void dividir(){
        double resultado = (double) numero1 / numero2;
        System.out.println("Resultado divición: " +  resultado) ;
    }
}
