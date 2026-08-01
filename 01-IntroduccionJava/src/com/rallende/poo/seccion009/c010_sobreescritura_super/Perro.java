package com.rallende.poo.seccion009.c010_sobreescritura_super;

public class Perro extends Animal {
    public void hacerSonido(){
        System.out.println("Ladra!");
    }

    public void dormir(){
        System.out.println("Duerme 15hras al dias");
    }

    @Override
    public void comer(){
        System.out.println("Come 10 veces al dia.");
        super.camina();
    }
}
