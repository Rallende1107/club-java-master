# Sentencias de Decisión en Java

Las sentencias de decisión permiten que un programa ejecute distintos bloques de código según se cumpla o no una condición.

## 1. `if` / `else`

* **`if`:** Ejecuta un bloque de código **solo si** la condición entre paréntesis es `true`.
* **`else`:** Ejecuta un bloque alternativo cuando la condición del `if` es `false`.
* **`else if`:** Permite encadenar varias condiciones excluyentes entre sí; se evalúan en orden y se ejecuta la primera que sea `true`.

```java
if (numero > 0) {
    System.out.println("Positivo");
} else if (numero < 0) {
    System.out.println("Negativo");
} else {
    System.out.println("Es Cero");
}
```

## 2. Comparación de Cadenas (`String`)

* **`==`:** Compara si dos referencias apuntan al **mismo objeto en memoria**, no si el contenido es igual. No debe usarse para comparar el contenido de dos `String`.
* **`.equals(...)`:** Compara el **contenido** de dos cadenas, respetando mayúsculas y minúsculas.
* **`.equalsIgnoreCase(...)`:** Compara el **contenido** de dos cadenas, ignorando mayúsculas y minúsculas.

```java
cadena1.equals(cadena2);           // compara contenido (case sensitive)
cadena1.equalsIgnoreCase(cadena2); // compara contenido (ignora mayúsculas/minúsculas)
```

## 3. Combinando Condiciones

Dentro de un `if` se pueden combinar varias condiciones usando los operadores lógicos `&&` (AND), `||` (OR) y `!` (NOT).

```java
if (!usuarioValido.equals(usuario) && passValido.equals(pass)) {
    System.out.println("Usuario Invalido");
}

if (diaDescanso || vacaciones) {
    System.out.println("Carrete");
}
```

## 4. Operador Ternario

Forma abreviada de un `if / else` que **devuelve un valor**. Su sintaxis es `condicion ? valorSiTrue : valorSiFalse`.

```java
int mayor = (num1 > num2) ? num1 : num2;
```

## 5. `switch`

Alternativa al `if / else if` encadenado cuando se compara una misma variable contra varios valores posibles (`int`, `String`, etc.).

### Forma clásica (`case` + `break`)

Cada `case` que coincide con el valor se ejecuta, y continúa ejecutando los siguientes `case` hasta encontrar un `break` (o el final del `switch`). Por eso se pueden agrupar varios valores en un mismo `case` dejándolos "caer" al siguiente.

```java
switch (mes) {
    case 1: case 2: case 12:
        estacion = "Invierno";
        break;
    case 3: case 4: case 5:
        estacion = "Primavera";
        break;
    default:
        estacion = "Desconocida";
}
```

### Forma moderna (`->`)

Sintaxis más nueva (`switch` con flechas): cada `case` ejecuta únicamente su expresión, sin necesidad de `break` y sin caer al siguiente `case`.

```java
switch (mes) {
    case 1, 2, 12 -> estacion = "Invierno";
    case 3, 4, 5 -> estacion = "Primavera";
    default -> estacion = "Desconocida";
}
```

> **Nota:** siempre conviene incluir un `default` para cubrir los valores no contemplados en los `case`.
