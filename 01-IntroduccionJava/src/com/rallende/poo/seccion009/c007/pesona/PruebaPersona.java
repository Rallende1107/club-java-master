package com.rallende.poo.seccion009.c007.pesona;

public class PruebaPersona {
    public static void main(String[] args) {
// OPCIÓN A: Crear 2 personas distintas en memoria (requiere 'new' dos veces)
        System.out.println("--- Creando dos objetos distintos ---");

        // Primer objeto 'Persona' usando el constructor vacío + setters
        Persona p = new Persona();
        p.setNombre("Tonny");
        p.setApellido("Stark");
        p.mostrarPerson();

        // Segundo objeto 'Persona' usando el constructor con parámetros
        Persona p2 = new Persona("Peter", "Parker");
        p2.mostrarPerson();

        // OPCIÓN B: Reutilizar el mismo objeto sin usar 'new' por segunda vez
        System.out.println("\n--- Reutilizando el mismo objeto (p) ---");

        // Modificamos al objeto 'p' directamente usando los setters
        p.setNombre("Clark");
        p.setApellido("Kent");
        p.mostrarPerson(); // Ahora 'p' contiene a Clark Kent, 'Bruce Wayne' ya no existe en 'p'.
    }
}
