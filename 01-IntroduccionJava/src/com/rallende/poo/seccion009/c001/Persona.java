package com.rallende.poo.seccion009.c001;

public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Datos  persona");
        System.out.println("Nombre: " + nombre + " " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("Creación de persona");
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.nombre = "Rene";
        p1.apellido = "Allende";
        p1.mostrarPersona();

        p2.nombre = "Enrique";
        p2.apellido = "Allende";
        p2.mostrarPersona();
    }
}