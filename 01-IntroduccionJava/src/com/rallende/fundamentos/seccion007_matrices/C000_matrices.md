# Matrices (Arreglos Bidimensionales) en Java

Una **matriz** es un arreglo de arreglos: una estructura de datos organizada en **filas (renglones)** y **columnas**, ideal para representar tablas o cuadrículas.

## 1. Declaración y Creación

Se declara igual que un arreglo normal, pero agregando un segundo par de corchetes `[][]`. Al crearla con `new`, se indica el número de renglones y columnas.

```java
final int RENGLONES = 2;
final int COLUMNAS = 3;
int[][] matriz = new int[RENGLONES][COLUMNAS];
```

## 2. Acceder y Modificar Elementos

Cada elemento se accede con dos índices: `matriz[renglon][columna]`, ambos con base cero.

```java
matriz[0][0] = 100; // primer renglón, primera columna
matriz[1][2] = 600; // segundo renglón, tercera columna

System.out.println(matriz[0][0]); // lee el valor
```

## 3. Inicialización Directa (Sintaxis Literal)

Al igual que los arreglos simples, se puede declarar e inicializar en una sola línea usando llaves anidadas: cada `{}` interno representa un renglón.

```java
int[][] matriz = {
    {100, 200, 300},
    {500, 600, 700}
};
```

## 4. Recorrer una Matriz

Se necesitan **dos ciclos `for` anidados**: el externo recorre los renglones y el interno recorre las columnas de ese renglón.

```java
for (int reg = 0; reg < matriz.length; reg++) {
    for (int col = 0; col < matriz[reg].length; col++) {
        System.out.println("matriz[" + reg + "][" + col + "] -> " + matriz[reg][col]);
    }
}
```

> `matriz.length` da el número de renglones; `matriz[reg].length` da el número de columnas de ese renglón en particular.

## 5. Poblar una Matriz desde Consola

Usando el mismo doble `for`, se puede pedir cada valor al usuario en vez de asignarlo manualmente.

```java
matriz = new int[reglones][columnas];
for (int i = 0; i < reglones; i++) {
    for (int j = 0; j < columnas; j++) {
        matriz[i][j] = Integer.parseInt(scanner.nextLine());
    }
}
```

## 6. Ejemplo: Suma de la Diagonal Principal

En una matriz cuadrada (mismo número de renglones y columnas), la diagonal principal son los elementos donde el índice de renglón es igual al de columna (`i == j`).

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (i == j) {
            suma += matriz[i][j];
        }
    }
}
```
