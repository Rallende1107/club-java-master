package com.rallende.poo.seccion009.c012_object;

public class Persona {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String apellido;
    // Atributo estático compartido por toda la clase
    static int contadorPersonas = 0;

    // 1. Constructor sin parámetros (por defecto)
    public Persona() {
        // Llamamos al constructor con parámetros usando 'this()'
        // Esto garantiza que el contador SIEMPRE se incremente y asigna valores por defecto
        this("Sin Nombre", "Sin Apellido");
    }

    // 2. Constructor con parámetros (sobrecarga de constructor)
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Aumento de variable estatica
        contadorPersonas ++;
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

    public static int getContadorPersonas() { return Persona.contadorPersonas; }

    // Método para imprimir los datos
    public void mostrarPerson() {
        System.out.println("Persona: " + this.nombre + " " + this.apellido);
    }

    // Método para imprimir los datos usando to String
    public String toString() {
        return "Nombre " + this.nombre +  " Apellido " + this.apellido;
    }

}
