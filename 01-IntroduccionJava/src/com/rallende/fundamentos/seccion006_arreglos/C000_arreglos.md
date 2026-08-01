# Arreglos en Java

## ¿Qué es un arreglo?
Un **arreglo** (o *array*) nos permite almacenar múltiples valores en una sola variable. Es una estructura de datos estática que guarda una colección de elementos del mismo tipo de forma contigua en la memoria.

---

## Sintaxis Básica

Para trabajar con arreglos en Java, generalmente seguimos estos pasos:

### 1. Declaración
Se especifica el tipo de dato, seguido de corchetes `[]` y el nombre de la variable.
```java
tipoDato[] nombreArreglo;
```

### 2. Creación (Reservar espacio en memoria)
Se utiliza la palabra reservada `new` indicando el tamaño exacto del arreglo.
```java
// Reservamos espacio de memoria para 5 elementos
nombreArreglo = new int[5];
```

> 💡 **Mejora:** Puedes hacer la declaración y la instanciación en una sola línea (es la forma más común):
> ```java
> int[] nombreArreglo = new int[5];
> ```

---

## Representación en Memoria e Índices

Como se observa en el diagrama, cuando creas un arreglo como `new int[5]`:

* **Índices:** Los arreglos en Java siempre tienen base cero. Es decir, el primer elemento está en el índice `0`, y el último en el índice `n-1` (donde `n` es el tamaño del arreglo). Para un arreglo de 5 elementos, los índices válidos son **0, 1, 2, 3 y 4**.
* **Valores Iniciales por Defecto:** Al reservar memoria, Java inicializa automáticamente los elementos del arreglo con valores por defecto según su tipo de dato:
    * `int`, `byte`, `short`, `long`: `0`
    * `float`, `double`: `0.0`
    * `boolean`: `false`
    * `char`: `' '` (carácter nulo)
    * Objetos (ej. `String`): `null`

---

## 🚀 Mejoras y Agregados: Operaciones Comunes

Para que este apunte esté completo, aquí tienes cómo interactuar con el arreglo una vez creado.

### Inicialización directa (Sintaxis literal)
Si ya conoces los valores que vas a guardar, puedes declarar e inicializar el arreglo en una sola línea sin usar `new` de forma explícita:
```java
int[] numeros = {10, 20, 30, 40, 50}; // Crea un arreglo de tamaño 5 automáticamente
```

### Acceder y Modificar Elementos
Para leer o cambiar un valor, usamos el nombre del arreglo seguido del índice entre corchetes `[]`:
```java
// Asignar un valor
nombreArreglo[0] = 15;  // Cambia el valor del índice 0 a 15

// Leer un valor
int primerValor = nombreArreglo[0]; 
System.out.println(primerValor); // Imprime: 15
```

### Conocer el tamaño del arreglo (`length`)
Todos los arreglos en Java tienen una propiedad llamada `length` (sin paréntesis) que devuelve la cantidad total de elementos que puede almacenar.
```java
int tamanio = nombreArreglo.length; // Para new int[5], esto devuelve 5
```

### Recorrer un Arreglo (Iteración)

**1. Usando un ciclo `for` tradicional:**
Ideal si necesitas conocer el índice actual.
```java
for (int i = 0; i < nombreArreglo.length; i++) {
    System.out.println("Posición " + i + ": " + nombreArreglo[i]);
}
```

**2. Usando un ciclo `for-each` (for mejorado):**
Ideal si solo necesitas leer los valores de principio a fin sin importar su posición.
```java
for (int numero : nombreArreglo) {
    System.out.println("Valor: " + numero);
}
```

## Resumen de Características
* **Tamaño fijo:** Una vez que se crea un arreglo (ej. `new int[5]`), su tamaño no puede cambiar (no puedes agregar un 6to elemento directamente). Si necesitas estructuras dinámicas, deberías usar `ArrayList`.
* **Homogéneos:** Todos los elementos dentro del arreglo deben ser del mismo tipo de dato (`tipoDato[]`).