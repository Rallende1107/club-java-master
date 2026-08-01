# Tipos Datos

## Tipos Primitivos en Java

| Tipo | Tamaño (bits) | Valor por Default | Ejemplos / Notas |
| :--- | :--- | :--- | :--- |
| `byte` | 8 bits | `0` | Ej. `-10`, `25`, etc. |
| `short` | 16 bits | `0` | Ej. `-15`, `60`, etc. |
| `char` | 16 bits | `' '` | Valor Unicode. Ej. `'a'`, `'@'`, etc. |
| `int` | 32 bits | `0` | Ej. `-50`, `200`, etc. |
| `long` | 64 bits | `0L` | Ej. `-60L`, `80l`, etc. |
| `float` | 32 bits | `0.0F` | Ej. `-11.2F`, `50.30f` |
| `double` | 64 bits | `0.0` | Ej. `-15.1`, `34.6` |
| `boolean`| 1 bit | `false` | Ej. `true`, `false` |

## Uso de `var` en Java

`var` sirve para inferir el tipo de dato al definir variables en Java.

---

### Ejemplo Comparativo
| Sin `var` | Con `var` |
| :--- | :--- |
| `int edad = 10;` | `var edad = 10;` |

> **¿Cómo funciona?**
> En `var edad = 10;`, el compilador **infiere** automáticamente que el tipo es `int` observando el valor asignado (`10`).

---

### Notas y Restricciones

Podemos usar `var` para cualquier tipo de dato, pero se deben considerar algunas reglas clave:

1. **Variables locales únicamente:** Solo se puede usar dentro de métodos o bloques de código (no para atributos de clase/campos).
2. **Inicialización obligatoria:** Se debe asignar un valor en la misma línea donde se declara (ej. `var x = 5;`), ya que si se declara vacía (`var x;`), Java no sabrá qué tipo inferir.
3. **Tipado fuerte:** Una vez asignado el valor inicial, la variable **no puede cambiar de tipo**.


## Reglas para Nombres de Variables en Java

El nombre de una variable debe seguir las siguientes reglas:

1. **Caracteres permitidos:** Puede tener letras (mayúsculas o minúsculas), dígitos (`0` a `9`), o los símbolos de guión bajo (`_`) o signo de dólar (`$`).
2. **Inicio del nombre:** El primer carácter **NO** debe ser un dígito (no puede empezar con un número).
3. **Sin espacios:** No se permiten espacios entre los caracteres del nombre.
4. **Palabras reservadas:** No se pueden usar palabras clave del sistema (keywords, Ej. `int`, `for`, `new`, etc.).
5. **Sensibilidad (Case Sensitive):** Los nombres son sensibles a mayúsculas y minúsculas (por ejemplo, `Variable` y `variable` se consideran diferentes).

---

## Ejemplos de Nombres de Variables

| Ejemplo | Válido / Buenas Prácticas | Observación |
| :--- | :---: | :--- |
| `miVariable` | ✅ | Cumple con las reglas y con las buenas prácticas (**camelCase**). |
| `numeroentero` | ❌ | Aunque cumple con las reglas, no aplica las buenas prácticas (dificulta la lectura al no separar palabras). |
| `$nombreUsuario` | ✅ | Cumple con las reglas y las buenas prácticas. |
| `mi_variable` | ❌ | Aunque cumple con las reglas, no aplica las buenas prácticas (en Java la convención estándar es **camelCase** y no **snake_case**). |