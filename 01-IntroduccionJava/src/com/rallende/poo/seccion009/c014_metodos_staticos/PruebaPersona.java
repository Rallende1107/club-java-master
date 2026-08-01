package com.rallende.poo.seccion009.c014_metodos_staticos;

import com.rallende.poo.seccion009.c013_id_persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
// OPCIÓN A: Crear 2 personas distintas en memoria (requiere 'new' dos veces)
        System.out.println("--- Creando dos objetos distintos ---");
        // System.out.println(Persona.contadorPersonas);
        // Primer objeto 'Persona' usando el constructor vacío + setters
        Persona p = new Persona("Tonny", "Stark");
        System.out.println(p.toString());
        // System.out.println(Persona.contadorPersonas);

        // Segundo objeto 'Persona' usando el constructor con parámetros
        Persona p2 = new Persona("Peter", "Parker");
        System.out.println(p2.toString());
        // System.out.println(Persona.contadorPersonas);

        Persona p3 = new Persona("Clark", "Kent");
        System.out.println(p3.toString());

        System.out.println(Persona.getContadorPersonas());
    }
}
