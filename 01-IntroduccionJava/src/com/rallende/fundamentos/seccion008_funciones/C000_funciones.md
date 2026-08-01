# Funciones (Métodos) en Java

Una función (en Java, técnicamente un **método**) es un bloque de código reutilizable que realiza una tarea específica. Permite dividir un programa grande en piezas más pequeñas, evitando repetir código.

## 1. Declaración Básica

```java
static void saludar(String mensaje) {
    System.out.println(mensaje);
}
```

* **`static`:** permite llamar al método directamente desde `main` sin crear un objeto.
* **Tipo de retorno:** `void` indica que el método **no devuelve ningún valor**.
* **Parámetros:** valores que recibe el método entre paréntesis (`String mensaje`), opcionales.
* **Llamada:** `saludar("Hola");`

## 2. Métodos con Valor de Retorno

Si el método debe devolver un resultado, se reemplaza `void` por el tipo de dato que se retorna, y se usa `return` dentro del cuerpo.

```java
static int sumar(int a, int b) {
    return a + b;
}

int resultado = sumar(5, 5); // 10
```

## 3. Múltiples `return` (Casos Condicionales)

Un método puede tener más de un `return`; en cuanto se ejecuta uno, el método termina inmediatamente.

```java
static boolean esPar(int num) {
    if (num % 2 == 0) {
        return true;
    }
    return false;
}
```

## 4. Recursividad

Una función **recursiva** es aquella que se llama a **sí misma**. Siempre debe tener un **caso base** (una condición que detiene las llamadas), de lo contrario el programa entra en un bucle infinito.

```java
static void recursiva(int n) {
    if (n == 0) {
        System.out.println(n); // caso base
    } else {
        System.out.println(n);
        recursiva(n - 1); // llamada recursiva
    }
}
```

## 5. Métodos Útiles de `String`

* **`.length()`:** devuelve la cantidad de caracteres de la cadena.
* **`.charAt(i)`:** devuelve el carácter en la posición `i`.
* **`.substring(inicio, fin)`:** devuelve la parte de la cadena entre los índices `inicio` (incluido) y `fin` (excluido).
* **`.toUpperCase()` / `.toLowerCase()`:** convierte la cadena a mayúsculas o minúsculas.

```java
String texto = "hola mundo";
texto.length();               // 10
texto.charAt(0);              // 'h'
texto.substring(0, 4);        // "hola"
```

## 6. Números Aleatorios (`Random`)

La clase `Random` genera números al azar. `nextInt(origen, limite)` devuelve un entero entre `origen` (incluido) y `limite` (excluido).

```java
Random random = new Random();
int numero = random.nextInt(min, max + 1); // incluye max
```

## 7. Formatear / Redondear Decimales (`DecimalFormat`)

* **`Math.round(decimal)`:** redondea un `double` al entero más cercano.
* **`DecimalFormat`:** da control sobre cuántos decimales mostrar, usando un patrón como `"#.##"` (hasta 2 decimales).

```java
DecimalFormat decimalFormat = new DecimalFormat("#.##");
String numeroFormateado = decimalFormat.format(8.545); // "8.55"
```

## 8. Componer Funciones

Es común dividir un problema en varias funciones pequeñas que se combinan dentro de `main` o entre sí (por ejemplo, un generador de ID único que combina un método para obtener caracteres de un texto y otro para generar un número aleatorio).
