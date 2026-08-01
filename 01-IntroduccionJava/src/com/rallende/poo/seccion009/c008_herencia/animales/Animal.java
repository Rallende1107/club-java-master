package com.rallende.poo.seccion009.c008_herencia.animales;

public class Animal {
    public void comer(){ System.out.println("Come muchas veces al dia.");}

    public void dormir(){ System.out.println("Duerme muchas horas.");}
}

class Perro extends Animal{ public void hacerSonido(){ System.out.println("Ladra!");}}


