package com.rallende.poo.seccion009.c009_sobreescritura;

public class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("#".repeat(3) + " Ejemplo Herencia " + "#".repeat(3));
        System.out.println("=".repeat(5) + " Padre ");
        Animal animal = new Animal();
        animal.comer();
        animal.dormir();
        System.out.println("=".repeat(5) + " Hijo ");
        Perro perro = new Perro();
        perro.comer();
        perro.dormir();
        perro.hacerSonido();



    }
}
