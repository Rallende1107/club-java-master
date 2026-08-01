package com.rallende.poo.seccion009.c013_id_persona;

public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;

    static int contadorPersonas = 0;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = ++Persona.contadorPersonas;
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

    public String toString() {
        return "ID: " + this.idPersona + " -> Nombre Completo: " + this.nombre +  "  " + this.apellido;
    }
}
