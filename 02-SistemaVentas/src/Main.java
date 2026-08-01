import ventas.Orden;
import ventas.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
        List<Orden> ordenes = new ArrayList<>();
        Orden ordenActual = null;

        int opcion;
        do {
            System.out.println("\n=== Sistema de Ventas ===");
            System.out.println("1. Nueva orden");
            System.out.println("2. Agregar producto a la orden actual");
            System.out.println("3. Listar productos creados");
            System.out.println("4. Mostrar orden actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1 -> {
                    ordenActual = new Orden();
                    ordenes.add(ordenActual);
                    System.out.println("Orden creada.");
                }
                case 2 -> {
                    if (ordenActual == null) {
                        ordenActual = new Orden();
                        ordenes.add(ordenActual);
                        System.out.println("No habia una orden activa, se creo una nueva.");
                    }
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = leerDouble(scanner);
                    Producto producto = new Producto(nombre, precio);
                    productos.add(producto);
                    ordenActual.agregarProducto(producto);
                    System.out.println("Producto agregado a la orden.");
                }
                case 3 -> {
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        productos.forEach(System.out::println);
                    }
                }
                case 4 -> {
                    if (ordenActual == null) {
                        System.out.println("Primero cree una orden (opcion 1).");
                    } else {
                        ordenActual.mostrarOrden();
                    }
                }
                case 0 -> System.out.println("Hasta luego!");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static int leerEntero(Scanner scanner) {
        while (true) {
            String linea = scanner.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero entero valido: ");
            }
        }
    }

    private static double leerDouble(Scanner scanner) {
        while (true) {
            String linea = scanner.nextLine().trim();
            try {
                return Double.parseDouble(linea);
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero valido (use punto decimal, ej. 20.99): ");
            }
        }
    }
}
