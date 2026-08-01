# Operadores en Java

Los operadores son símbolos que nos permiten realizar distintos tipos de operaciones.

## Tipos de Operadores

| Aritméticos | Relacionales | Lógicos |
| :--- | :--- | :--- |
| `+` (Suma) | `==` (Igual a) | `&&` (AND lógico / Y) |
| `-` (Resta) | `!=` (Diferente de) | `\|\|` (OR lógico / O) |
| `*` (Multiplicación) | `>` (Mayor que) | `!` (NOT / Negación) |
| `/` (División) | `<` (Menor que) | |
| `%` (Módulo / Resto) | `>=` (Mayor o igual a) | |
| | `<=` (Menor o igual a) | |


## Explicación de Operadores en Java

Aquí tienes la explicación detallada de para qué sirve cada uno de los operadores en Java, organizados por su categoría:

---

## 1. Operadores Aritméticos
Se utilizan para realizar **operaciones matemáticas básicas** con números (`int`, `double`, `float`, etc.).

* **`+` (Suma):** Suma dos valores numéricos (`5 + 3` da `8`). También sirve para concatenar texto (`"Hola " + "Mundo"`).
* **`-` (Resta):** Resta el valor de la derecha al de la izquierda (`10 - 4` da `6`).
* **`*` (Multiplicación):** Multiplica dos números (`4 * 3` da `12`).
* **`/` (División):** Divide dos números (`10 / 2` da `5`). *Nota: Si divides dos números enteros, el resultado descarta los decimales (`7 / 2` da `3`).*
* **`%` (Módulo o Resto):** Devuelve el **residuo** sobrante de una división entera (`7 % 2` da `1`). Es muy útil para saber si un número es par o impar.

---

## 2. Operadores Relacionales (Comparación)
Sirven para **comparar dos valores**. El resultado de estas operaciones siempre es un valor booleano: **`true`** (verdadero) o **`false`** (falso).

* **`==` (Igual a):** Compara si dos valores son exactamente iguales (`5 == 5` devuelve `true`).
* **`!=` (Diferente de):** Verifica si dos valores son distintos (`5 != 3` devuelve `true`).
* **`>` (Mayor que):** Compara si el valor de la izquierda es mayor que el de la derecha (`8 > 3` devuelve `true`).
* **`<` (Menor que):** Compara si el valor de la izquierda es menor que el de la derecha (`2 < 5` devuelve `true`).
* **`>=` (Mayor o igual a):** Compara si es mayor o si es igual (`5 >= 5` devuelve `true`).
* **`<=` (Menor o igual a):** Compara si es menor o si es igual (`4 <= 5` devuelve `true`).

---

## 3. Operadores Lógicos
Se utilizan para **combinar varias condiciones** (expresiones relacionales) en las estructuras de control como `if` o `while`.

* **`&&` (AND / Y lógico):** Devuelve `true` **solo si ambas condiciones son verdaderas**.
    * Ej: `(edad >= 18) && (tieneLicencia == true)`
* **`||` (OR / O lógico):** Devuelve `true` si **al menos una** de las condiciones es verdadera.
    * Ej: `(esFinDeSemana == true) || (esFeriado == true)`
* **`!` (NOT / Negación):** Invierte el valor de verdad. Si la condición es `true`, la vuelve `false` y viceversa.
    * Ej: `!(5 > 10)` se convierte en `true` (porque `5 > 10` era `false`).

---

## 4. Operadores Unarios
Sólo necesitan de **un operando** para funcionar.

| Operador | Ejemplo | Descripción |
| :---: | :--- | :--- |
| `+` | `+ miNumero` | Indica un valor positivo (opcional, los números son positivos por defecto). |
| `-` | `- miNumero` | Indica o convierte a un valor negativo. |
| `++` | `++ miNumero` | Operador de **incremento** (le suma 1 al valor de la variable). |
| `--` | `-- miNumero` | Operador de **decremento** (le resta 1 al valor de la variable). |
| `!` | `! miBooleano` | **Negación** (invierte el valor de un booleano: de `true` a `false` o viceversa). |
