package com.rallende.poo.seccion009.c012_object;

public class PruebaPersona {
    public static void main(String[] args) {
// OPCIÓN A: Crear 2 personas distintas en memoria (requiere 'new' dos veces)
        System.out.println("--- Creando dos objetos distintos ---");

        // Primer objeto 'Persona' usando el constructor vacío + setters
        Persona p = new Persona();
        p.setNombre("Tonny");
        p.setApellido("Stark");
        p.mostrarPerson();
        System.out.println("Contador: " + Persona.getContadorPersonas());

        // Segundo objeto 'Persona' usando el constructor con parámetros
        Persona p2 = new Persona("Peter", "Parker");
        p2.mostrarPerson();
        System.out.println("Contador: " + Persona.getContadorPersonas());

        // OPCIÓN B: Reutilizar el mismo objeto sin usar 'new' por segunda vez
        System.out.println("\n--- Reutilizando el mismo objeto (p) ---");

        // Modificamos al objeto 'p' directamente usando los setters
        p.setNombre("Clark");
        p.setApellido("Kent");
        p.mostrarPerson(); // Ahora 'p' contiene a Tonny Kent, 'Bruce Stark' ya no existe en 'p'.

        // OPCIÓN A: Llamar directamente a toString()
        System.out.println(p.toString());

        // OPCIÓN B: Imprimir el objeto directamente (Java llama a toString() automáticamente)
        System.out.println(p);

        System.out.println(Persona.contadorPersonas);
    }
}
