package com.rallende.poo.seccion009.c011_poliformismo;

public class Veterinario {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal perro = new Perro();
        Animal gato = new Gato();

        animal.dormir();
        perro.dormir();
        gato.dormir();
    }
}
