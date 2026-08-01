# Introducción a Java

## Estructura Básica de un Programa

Todo programa en Java se organiza dentro de una **clase**, y la ejecución siempre comienza en el método `main`.

```java
package com.rallende.fundamentos.seccion001_introduccion;

public class C001_HolaMundo {
    public static void main(String[] args) {
        System.out.println("Holas");
    }
}
```

* **`package`:** indica en qué paquete (carpeta) vive la clase; debe coincidir con la ubicación del archivo.
* **`public class NombreClase`:** el nombre de la clase debe ser **idéntico** al nombre del archivo (`C001_HolaMundo.java` → `class C001_HolaMundo`).
* **`public static void main(String[] args)`:** es el **punto de entrada** del programa; la JVM empieza a ejecutar el código a partir de aquí.

## Comentarios

Los comentarios no se ejecutan; sirven para documentar o dejar notas en el código.

```java
// Comentario de una sola línea

/*
 Comentario
 de varias líneas
*/
```

## Mostrar Información en Consola

`System.out.println(...)` imprime un valor en la consola y agrega un salto de línea al final.

```java
String nombre = "Rene Allende";
int edad = 10;
String pais = "Chile";

System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
System.out.println("Pais: " + pais);
```

> El operador `+` entre un texto (`String`) y otro valor (como `int`) concatena, convirtiendo automáticamente el valor a texto.
