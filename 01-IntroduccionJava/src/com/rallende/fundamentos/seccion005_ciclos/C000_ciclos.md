# Ciclos (Bucles) en Java

Los ciclos permiten repetir un bloque de código mientras se cumpla una condición, evitando repetir código manualmente.

## 1. `while`

Evalúa la condición **antes** de cada iteración. Si la condición es `false` desde el inicio, el bloque nunca se ejecuta.

```java
int contador = 0;
final int LIMITE = 5;
while (contador <= LIMITE) {
    System.out.println(contador);
    contador++;
}
```

## 2. `do-while`

Evalúa la condición **después** de cada iteración, por lo que el bloque se ejecuta **al menos una vez**, aunque la condición sea `false` desde el inicio. Es muy útil para menús interactivos.

```java
int contador = 0;
final int LIMITE = 5;
do {
    System.out.println(contador);
    contador++;
} while (contador <= LIMITE);
```

## 3. `for`

Se usa cuando se conoce de antemano cuántas veces se debe repetir el ciclo. Agrupa en una sola línea la inicialización, la condición y el incremento.

```java
for (int contador = 0; contador <= LIMITE; contador++) {
    System.out.println(contador);
}
```

### Acumuladores

Un patrón común dentro de un `for` es ir acumulando un resultado en una variable externa al ciclo (suma, contador, etc.).

```java
int total = 0;
for (int contador = 1; contador <= LIMITE; contador++) {
    total += contador;
}
```

## 4. Menús con `do-while` + `switch`

Combinar un `do-while` con un `switch` es un patrón típico para mostrar un menú repetidamente hasta que el usuario elija salir.

```java
int opcion;
do {
    System.out.println("1. Opción 1");
    System.out.println("2. Salir");
    opcion = scanner.nextInt();

    switch (opcion) {
        case 1 -> System.out.println("Elegiste la opción 1");
        case 2 -> System.out.println("Saliendo...");
        default -> System.out.println("Opción no válida");
    }
} while (opcion != 2);
```

## 5. `break` y `continue`

* **`break`:** corta la ejecución del ciclo (o del `switch`) por completo.
* **`continue`:** salta directamente a la siguiente iteración del ciclo, sin ejecutar el resto del bloque en la iteración actual.

```java
while (!salir) {
    opcion = scanner.nextInt();

    if (opcion == 6) {
        salir = true;
        continue; // vuelve a evaluar la condición del while
    }

    if (opcion < 1 || opcion > 5) {
        System.out.println("Opción no válida");
        continue; // evita ejecutar el resto del bloque
    }
    // ... resto de la lógica
}
```
