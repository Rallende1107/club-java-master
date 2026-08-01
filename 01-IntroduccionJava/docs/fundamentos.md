# Fundamentos de Java — Resumen de Estudio

Este documento resume, por concepto (no por archivo), los fundamentos de Java cubiertos hasta ahora en el curso. Sirve como material de repaso rápido; para ver el detalle archivo por archivo revisa [ruta.md](./ruta.md).

---

## 1. Estructura básica de un programa (Sección 001)

Todo programa en Java se organiza en **clases**, y el punto de entrada de ejecución es siempre el método `public static void main(String[] args)`. Dentro de él usamos `System.out.println` (o `print`/`printf`) para mostrar información en consola. Antes de poder ejecutar cualquier lógica, hay que entender que Java es un lenguaje **fuertemente tipado** y **orientado a objetos**: incluso el "Hola Mundo" vive dentro de una clase.

## 2. Variables y tipos de datos (Sección 002)

Una **variable** es un espacio con nombre que guarda un valor de un tipo específico. Java tiene 8 **tipos primitivos**: `byte`, `short`, `char`, `int`, `long`, `float`, `double` y `boolean`, cada uno con un tamaño en memoria y un valor por defecto. Además existe `String`, que no es primitivo sino un objeto, pero se usa constantemente para texto.

Puntos clave trabajados:
- **Declaración y reasignación**: una variable puede cambiar de valor (pero no de tipo) después de declarada.
- **`var`**: permite que el compilador infiera el tipo a partir del valor asignado. Solo aplica a variables locales, requiere inicialización en la misma línea, y una vez fijado el tipo no puede cambiar.
- **Constantes (`final`)**: un valor que no puede reasignarse una vez definido (ej. `final int MAX = 18;`). Java también trae constantes predefinidas como `Math.PI`.
- **Nombres de variables**: deben usar `camelCase`, no pueden empezar con dígito, no admiten espacios ni palabras reservadas, y son sensibles a mayúsculas/minúsculas.
- **Entrada por consola**: con la clase `Scanner` (`new Scanner(System.in)`) se leen datos del usuario (`nextLine()`, `nextInt()`), y con `Integer.parseInt` / `Float.parseFloat` / `Boolean.parseBoolean` se convierte el texto ingresado al tipo de dato necesario.
- **Manejo básico de errores**: `try/catch` con `NumberFormatException` para repetir la solicitud de un dato si el usuario ingresa algo inválido.

## 3. Operadores (Sección 003)

Los operadores permiten combinar y comparar valores:

- **Aritméticos** (`+ - * / %`): operan sobre números. La división entre enteros descarta decimales, y `%` (módulo) entrega el resto de una división — muy usado para detectar pares/impares.
- **Unarios** (`+ - ++ -- !`): actúan sobre un solo operando. `++`/`--` incrementan o decrementan en 1, y existe diferencia entre **pre** (`++a`, se aplica antes de usar el valor) y **post** (`a++`, se aplica después).
- **Relacionales** (`== != > < >= <=`): comparan dos valores y siempre devuelven un `boolean`. Importante: comparar `String` con `==` compara referencias en memoria, no contenido; para comparar el contenido real se usa `.equals()` o `.equalsIgnoreCase()`.
- **Lógicos** (`&& || !`): combinan condiciones booleanas. `&&` exige que ambas sean verdaderas, `||` exige que al menos una lo sea, y `!` invierte un valor booleano. Se usan constantemente dentro de `if` y `while` para armar condiciones compuestas (ej. validar que un valor esté dentro de un rango).

## 4. Estructuras de decisión (Sección 004)

Permiten que el programa tome caminos distintos según una condición:

- **`if / else if / else`**: evalúa condiciones en orden hasta encontrar una verdadera. Se usó para clasificar números (positivo/negativo/cero), validar credenciales, comparar dos valores, y asignar estaciones del año según el mes.
- **Comparación de cadenas**: dentro de decisiones es donde más se nota la diferencia entre `==` (referencia) y `.equals()`/`.equalsIgnoreCase()` (contenido).
- **Operador ternario (`condición ? valorSiTrue : valorSiFalse`)**: forma compacta de un `if/else` que retorna un valor, útil por ejemplo para obtener el mayor entre dos números en una sola línea.
- **`switch`**: alternativa a encadenar muchos `else if` cuando se compara una misma variable contra varios valores posibles. Se practicó tanto la sintaxis clásica (`case x: ... break;`, agrupando varios `case` para el mismo resultado) como la sintaxis moderna con flechas (`case x -> resultado;`), que evita el uso de `break` y es menos propensa a errores de "fall-through".

## 5. Ciclos / bucles (Sección 005)

Los ciclos repiten bloques de código mientras se cumpla una condición:

- **`while`**: evalúa la condición **antes** de cada iteración; si es falsa desde el inicio, el bloque no se ejecuta nunca.
- **`do-while`**: evalúa la condición **después** de ejecutar el bloque, garantizando al menos una ejecución. Ideal para menús interactivos que deben mostrarse al menos una vez.
- **`for`**: agrupa inicialización, condición e incremento en una sola línea; es el más usado cuando se conoce de antemano cuántas veces se debe iterar (ej. recorrer arreglos, acumular sumas).
- **`continue`**: se usó dentro de un `while` para saltar el resto del bloque y volver a evaluar la condición (ej. rechazar una opción de menú inválida sin salir del ciclo).
- Casos prácticos: menús con `switch` dentro de un ciclo, un cajero automático que mantiene un saldo entre iteraciones, y una calculadora con validación de opciones y de división/módulo por cero.

## 6. Arreglos (Sección 006)

Un **arreglo** (`array`) almacena múltiples valores del mismo tipo en una sola variable, de tamaño fijo:

- Se declara con `tipoDato[] nombre;` y se reserva memoria con `new tipoDato[tamaño]`, o se inicializa directamente con `{valor1, valor2, ...}`.
- Los índices son **base cero**: el primer elemento está en `[0]` y el último en `[length - 1]`.
- Al crearse, cada elemento toma un **valor por defecto** según su tipo (`0` para numéricos, `false` para `boolean`, `null` para objetos).
- La propiedad `.length` entrega el tamaño del arreglo (sin paréntesis, a diferencia de `String.length()`).
- Se recorre con `for` tradicional (cuando se necesita el índice) o `for-each` (cuando solo se necesitan los valores).
- Casos prácticos: llenar un arreglo con datos ingresados por el usuario (tamaño dinámico definido en tiempo de ejecución) y calcular el promedio de una lista de notas.

## 7. Matrices (Sección 007)

Una **matriz** es un arreglo de dos dimensiones (`int[][]`), pensado como filas y columnas: `matriz[fila][columna]`. Se declara y llena de forma similar a un arreglo simple pero requiere **dos bucles `for` anidados** para recorrerla completa (uno para filas, otro para columnas). Se practicó la creación con tamaño fijo y con tamaño dinámico (ingresado por consola), así como un caso típico de matrices cuadradas: sumar los valores de la **diagonal principal** (cuando el índice de fila es igual al de columna).

## 8. Funciones (Sección 008)

Una **función** (método estático en estos ejemplos) encapsula un bloque de lógica reutilizable:

- Puede no retornar nada (`void`, ej. `saludar(String mensaje)`) o retornar un valor de un tipo específico (`int sumar(int a, int b)`, `boolean esPar(int num)`).
- **Parámetros**: permiten pasar datos de entrada a la función; **retorno** (`return`): permite devolver un resultado al código que la invocó.
- **Recursividad**: una función que se llama a sí misma. Siempre necesita un **caso base** que detenga la recursión (de lo contrario cae en un bucle infinito / stack overflow). Se practicó con una cuenta regresiva y con la generación iterativa de la secuencia de Fibonacci.
- **Funciones útiles del lenguaje**: métodos de `String` (`length()`, `charAt()`, `substring()`, `toUpperCase()`, `toLowerCase()`), números aleatorios con `Random.nextInt(min, max)`, y redondeo/formato de decimales con `Math.round` y `DecimalFormat`.
- Casos prácticos que combinan varias funciones propias: un generador de ID de usuario único y un generador de correo electrónico a partir de nombre y apellido.

## 9. Clases y objetos (Sección 009)

Este es el salto a la **Programación Orientada a Objetos (POO)**:

- Una **clase** es una plantilla que define **atributos** (variables de instancia, ej. `nombre`, `operando1`) y **métodos** (comportamiento, ej. `sumar()`, `mostrarPersona()`).
- Un **objeto** es una instancia concreta de una clase, creada con `new NombreClase()`. Cada objeto tiene su propia copia de los atributos.
- **Constructores**: métodos especiales (mismo nombre que la clase, sin tipo de retorno) que se ejecutan al crear un objeto. Java permite **sobrecarga de constructores** (varias versiones con distintos parámetros, ej. un constructor vacío y otro que recibe `operando1` y `operando2`).
- **Operador `this`**: hace referencia al objeto actual. Se usa para (a) diferenciar un atributo de un parámetro con el mismo nombre (`this.operando1 = operando1;`) y (b) para imprimir o pasar la referencia del objeto en memoria.
- **Paquetes**: los paquetes (`package ...`) organizan las clases en carpetas, evitan colisiones de nombres entre clases iguales en distintos paquetes, y permiten controlar qué clases son visibles desde otras partes del proyecto. Cuando una clase necesita usar otra que vive en un paquete distinto, se trae con `import` (ej. `import com.rallende.poo...aritmetica.Aritmetica;`) antes de poder instanciarla con `new`.
- **Encapsulamiento**: consiste en declarar los atributos como `private` para que no puedan modificarse directamente desde fuera de la clase, y exponer el acceso controlado mediante métodos **`get`** (leer el valor) y **`set`** (modificar el valor). Es uno de los cuatro pilares de la POO y protege el estado interno del objeto. Ver [encapsulamiento.md](./encapsulamiento.md) para el detalle y ejemplo.
