package com.rallende.poo.seccion009.c007.pesona;

public class Persona {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String apellido;

    // 1. Constructor sin parámetros (por defecto)
    public Persona() {
    }

    // 2. Constructor con parámetros (sobrecarga de constructor)
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos Getters y Setters para asignar y obtener datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método para imprimir los datos
    public void mostrarPerson() {
        System.out.println("Persona: " + this.nombre + " " + this.apellido);
    }
}
