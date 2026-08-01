# Ruta del Curso: Introducción a Java

Este documento resume, sección por sección, los temas y ejercicios trabajados en el curso, con una breve descripción de qué demuestra cada archivo.

---

## Sección 001: Introducción

- **C001_HolaMundo.java** — Primer programa en Java: estructura de una clase, el método `main` y `System.out.println`.
- **C002_Presentacion.java** — Declaración de variables (`String`, `int`) y concatenación de texto para imprimir una presentación simple.

---

## Sección 002: Variables

- **C001_Variables.java** — Declaración y reasignación de variables (`int`, `double`, `String`).
- **C002_tipos_primitivos.md** — Tabla de referencia de los tipos primitivos de Java (`byte`, `short`, `char`, `int`, `long`, `float`, `double`, `boolean`): tamaño y valor por defecto.
- **C003_tipo_var.md** — Explicación del uso de `var` para inferencia de tipos y sus restricciones (solo variables locales, inicialización obligatoria, tipado fuerte).
- **C004_nombres_variables.md** — Reglas y buenas prácticas para nombrar variables (camelCase, caracteres permitidos, sensibilidad a mayúsculas).
- **C005_Concatenacion.java** — Concatenación de cadenas con `+` e impresión con `printf`.
- **C006_ValoresConsola.java** — Lectura de datos desde consola con `Scanner` (`nextLine`).
- **C007_DetalleLibro.java** — Lectura de dos cadenas por consola (autor y libro) y armado de un mensaje.
- **C008_ConversionDatos.java** — Conversión de texto a número (`Integer.parseInt`) con manejo de errores (`try/catch` + `NumberFormatException`) en un bucle de reintento.
- **C009_Presentacion.java** — Formulario de datos por consola combinando `String`, `int`, `boolean` y `float`, con `equalsIgnoreCase` y `String.repeat`.
- **C010_RegistroEmpleados.java** — Igual al anterior pero usando `var` para inferencia de tipos en todas las variables.
- **C011_Constante.java** — Uso de `final` para constantes y de la constante predefinida `Math.PI`.

---

## Sección 003: Operadores

- **C001_Operadores.md** — Resumen de los operadores aritméticos, relacionales y lógicos de Java.
- **C002_Aritmeticos.java** — Operadores aritméticos: suma, resta, multiplicación, división y módulo.
- **C003_OperadoresUnarios.md** — Tabla de operadores unarios: `+`, `-`, `++`, `--`, `!`.
- **C004_Unarios.java** — Demostración de negativo unario, pre/post incremento, pre/post decremento y negación booleana.
- **C005_Relacionales.java** — Comparaciones con `==`, `!=`, `>`, `<`, `>=`, `<=` sobre números y cadenas (evidenciando la comparación de referencias en `String`).
- **C006_Logicos.java** — Operadores lógicos `&&`, `||` y `!` con combinaciones de valores booleanos.
- **C007_ValorEnRango.java** — Combina operadores relacionales y lógicos para validar si un valor está dentro de un rango.
- **C008_CalcularAreaRectangulo.java** — Cálculo de área y perímetro de un rectángulo a partir de datos ingresados por consola.

---

## Sección 004: Sentencias de Decisión

- **C001_Si.java** — Estructura `if / else` básica.
- **C002_Sino.java** — Estructura `if / else if / else` con varias condiciones encadenadas.
- **C003_PositivoNegativo.java** — Clasifica un número ingresado como positivo, negativo o cero.
- **C004_CompararCadenas.java** — Diferencia entre comparar cadenas con `==` (referencia) y con `.equals()` / `.equalsIgnoreCase()` (contenido).
- **C005_ValidacionUserPass.java** — Validación de usuario y contraseña combinando `!` y `&&`.
- **C006_ValidacionConOr.java** — Validación de una condición combinada con `||`.
- **C007_OperadorNot.java** — Uso del operador de negación `!` en una condición de salida de sistema.
- **C008_ComparaDosNumeros.java** — Compara dos números ingresados por consola e indica cuál es mayor.
- **C009_OperadorTernario.java** — Igual al anterior, agregando el operador ternario `?:` para obtener el mayor de dos números.
- **C010_EstacionMes.java** — Determina la estación del año según el mes, usando `if / else if`.
- **C011_EstacionMesSwitch.java** — Mismo ejercicio de estaciones del año, resuelto con `switch` clásico (`case` con `break`).
- **C012_EstacionMesSwitch2.java** — Mismo ejercicio, usando la sintaxis moderna de `switch` con flechas (`->`).
- **C013_DiaSemana.java** — Traduce un número (1-7) al nombre del día de la semana usando `switch` con flechas.
- **C014_MayorEdad.java** — Determina si una persona es mayor o menor de edad comparando con una constante (`MAX_EDAD`).
- **C015_SistemaClasificaciones.java** — Sistema de notas (A-F) según un valor numérico de 0 a 10, usando condiciones combinadas con rangos.

---

## Sección 005: Ciclos

- **C001_While.java** — Bucle `while`: cuenta de 0 a 5.
- **C002_DoWhile.java** — Bucle `do-while`: misma cuenta, pero verificando la condición al final (se ejecuta al menos una vez).
- **C003_For.java** — Bucle `for`: misma cuenta usando la estructura de inicialización/condición/incremento en una sola línea.
- **C004_SumaAcumulativa.java** — Uso de `for` para acumular una suma total (`total += contador`).
- **C005_Menu.java** — Menú interactivo con `do-while` + `switch`, repite hasta elegir "Salir".
- **C006_Cajero.java** — Simulación de cajero automático: consultar saldo, retirar y depositar, usando `do-while` + `switch` sobre un saldo acumulado.
- **C007_Calculadora.java** — Calculadora con menú (`while` + `switch` con flechas), incluye `continue`, validación de opciones y división/módulo con manejo de división entre cero.

---

## Sección 006: Arreglos

- **C001_Arreglos.md** — Apunte completo sobre arreglos: declaración, creación con `new`, índices base cero, valores por defecto, inicialización literal, `length` y formas de recorrerlos (`for` y `for-each`).
- **C002_CrearArreglo.java** — Declaración e inicialización de un arreglo (`new int[5]`).
- **C003_ModificarArreglo.java** — Asignación de valores a posiciones específicas de un arreglo.
- **C004_LeerArreglo.java** — Lectura e impresión de valores de un arreglo por índice.
- **C005_SimplificarArreglo.java** — Inicialización literal de un arreglo (`{100,200,300,400,500}`).
- **C006_RecorrerArreglo.java** — Recorrido de un arreglo con `for` tradicional usando `length`.
- **C007_ValoresDelArreglo.java** — Arreglo de tamaño dinámico (ingresado por el usuario), llenado y luego mostrado con dos bucles `for`.
- **C008_PromedioNotas.java** — Calcula el promedio de un conjunto de notas ingresadas por consola, almacenadas en un arreglo.

---

## Sección 007: Matrices

- **C001_EjemploMatriz.java** — Declaración de una matriz (`int[][]`) con filas y columnas fijas, llenado manual y acceso a posiciones puntuales.
- **C002_IterarMatriz.java** — Recorrido completo de una matriz 3x3 con dos bucles `for` anidados.
- **C003_Simplificada.java** — Declaración literal de una matriz e iteración usando `matriz.length` y `matriz[reg].length`.
- **C004_PoblarMatriz.java** — Matriz de tamaño dinámico (filas/columnas ingresadas por consola), llenada y luego impresa.
- **C004_SumarDiagonalMatriz.java** — Matriz cuadrada dinámica: calcula la suma de la diagonal principal mientras se llena y nuevamente al recorrerla.

---

## Sección 008: Funciones

- **C001_Saludar.java** — Función `void` con un parámetro (`saludar(String mensaje)`).
- **C002_Sumar.java** — Función que retorna un valor (`int sumar(int a, int b)`).
- **C003_NumeroPar.java** — Función que retorna `boolean` para determinar si un número es par.
- **C004_Recursivas.java** — Función recursiva que cuenta regresivamente hasta el caso base (`n == 0`).
- **C005_Fibonacci.java** — Genera y suma los primeros `n` números de la secuencia de Fibonacci (versión iterativa, no recursiva).
- **C006_LargoCadena.java** — Funciones sobre `String`: obtener el largo (`length()`) y recorrer caracteres (`charAt`).
- **C007_SubString.java** — Uso de `substring` para dividir una cadena en dos partes.
- **C008_NumeroRamdom.java** — Generación de números aleatorios en un rango con `Random.nextInt(min, max)`.
- **C009_Redondeo.java** — Redondeo de decimales con `Math.round` y formateo con `DecimalFormat`.
- **C010_GeneradorIdUnico.java** — Combina funciones propias (generación de número aleatorio, extracción de caracteres) para construir un identificador único de usuario.
- **C011_GeneradorEmail.java** — Función que arma un correo electrónico a partir del nombre y apellido ingresados.

---

## Sección 009: Clases y Objetos

> Nota: a partir de esta sección el código vive en el paquete `com.rallende.poo.seccion009` (en lugar de `fundamentos`), marcando el paso a Programación Orientada a Objetos. Los subpaquetes de esta sección se renombraron a minúsculas siguiendo la convención de nombres de paquetes de Java (todo en minúsculas, sin mayúsculas).

- **c001/com.rallende.poo.seccion009.c013_id_persona.Persona.java** — Primera clase propia: atributos (`nombre`, `apellido`), un método de instancia (`mostrarPersona`) y creación de varios objetos (`new com.rallende.poo.seccion009.c013_id_persona.Persona()`).
- **c002/Aritmetica.java** — Clase con atributos y métodos (`sumar`, `restar`, `multiplicar`, `dividir`) que operan sobre el estado del objeto, sin constructor propio.
- **c003_constructor/Aritmetica.java** — Misma clase, agregando constructor vacío y constructor con parámetros (sobrecarga de constructores).
- **c004_this/Aritmetica.java** — Uso del operador `this` para resolver la ambigüedad entre atributos y parámetros del mismo nombre, y para referenciar la instancia actual.
- **c005_paquetes/paquetes_java.md** — Explicación de qué es un paquete en Java, para qué sirve (orden, evitar colisiones de nombres, control de acceso) y cómo se ve reflejado en la estructura de carpetas, ilustrado con el ejemplo de esta misma sección.
- **c005_paquetes/aritmetica/Aritmetica.java** — Clase `Aritmetica` (con constructor vacío y con parámetros) ubicada en su propio paquete `...c005_paquetes.aritmetica`.
- **c005_paquetes/prueba/PruebaAritmetica.java** — Clase en un paquete distinto (`...c005_paquetes.prueba`) que usa `import` para traer la clase `Aritmetica` del paquete `aritmetica` y probar sus métodos.
- **c006_encapsulamiento/Aritmetica.java** — Encapsulamiento: atributos `private` (`numero1`, `numero2`) más métodos `get`/`set` para leer y modificar su valor de forma controlada, manteniendo `sumar`, `restar`, `multiplicar`, `dividir`. Ver también [encapsulamiento.md](./encapsulamiento.md).
