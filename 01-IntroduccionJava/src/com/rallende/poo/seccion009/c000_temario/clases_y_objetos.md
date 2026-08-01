# Clases y Objetos en Java

Cada subcarpeta de esta sección (`c001`, `c002`, `c003_constructor`, ...) es una "clase" (tema) distinta dentro del curso. Este documento resume la teoría de todas ellas.

## 1. Clases y Objetos

Una **clase** es una plantilla (molde) que define **atributos** (datos) y **métodos** (comportamiento). Un **objeto** es una instancia concreta de esa clase, creada con `new`. Cada objeto tiene su propia copia de los atributos.

```java
public class com.rallende.poo.seccion009.c013_id_persona.Persona {
   String nombre;
   String apellido;

   void mostrarPersona() {
      System.out.println("Nombre: " + nombre + " " + apellido);
   }
}
```

```java
import com.rallende.poo.seccion009.c013_id_persona.Persona;

Persona p1 = new Persona();
p1.nombre ="Rene";
p1.apellido ="Allende";
        p1.

mostrarPersona();

Persona p2 = new Persona(); // objeto independiente, con su propio estado
p2.nombre ="Enrique";
p2.apellido ="Allende";
```

## 2. Constructores

Un **constructor** es un método especial que se ejecuta automáticamente al crear un objeto con `new`. Tiene el **mismo nombre que la clase** y **no** tiene tipo de retorno.

* **Constructor vacío (por defecto):** permite instanciar el objeto sin inicializar valores de inmediato.
* **Constructor con parámetros:** permite crear el objeto y asignar valores en la misma línea.
* **Sobrecarga de constructores:** una clase puede tener varios constructores, siempre que se diferencien en la cantidad o tipo de sus parámetros.

```java
public Aritmetica() {
   // constructor vacío
}

public Aritmetica(int op1, int op2) {
   operando1 = op1;
   operando2 = op2;
}
```

```java
Aritmetica a1 = new Aritmetica(5, 7); // usa el constructor con parámetros
Aritmetica a2 = new Aritmetica();     // usa el constructor vacío
```

## 3. El Operador `this`

`this` hace referencia **al objeto actual** (la instancia sobre la que se está ejecutando el código). Sus usos principales:

1. **Resolver ambigüedad:** cuando un parámetro tiene el mismo nombre que un atributo, `this.atributo` distingue el atributo de la clase del parámetro recibido.
2. **Llamar a otro constructor de la misma clase:** con `this(...)`, para reutilizar lógica de inicialización.
3. **Pasar la instancia actual:** por ejemplo, al imprimir `this`, se obtiene la referencia del objeto en memoria (`NombreClase@hash`).

## 4. Paquetes

Un **paquete** es una colección de clases relacionadas, organizadas en un directorio. Permiten estructurar el proyecto y se declaran con `package` al inicio del archivo.

**¿Por qué son útiles?**

1. **Orden:** evitan tener cientos de archivos `.java` mezclados en una sola carpeta.
2. **Evitan colisiones de nombres:** puedes tener dos clases con el mismo nombre (ej. `Conexion`) siempre que estén en paquetes distintos (`basededatos.Conexion` y `red.Conexion`).
3. **Control de acceso:** ayudan a definir qué clases pueden ser vistas o usadas por otras, mediante modificadores como `public`, `protected` o el acceso *default* (sin modificador).

Para usar una clase de otro paquete, se importa con `import`:

```java
package com.rallende.poo.seccion009.c005_paquetes.prueba;

import com.rallende.poo.seccion009.c005_paquetes.aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica(5, 7);
        aritmetica.sumar();
    }
}
```

## 5. Encapsulamiento

**Encapsular** significa ocultar los atributos internos de una clase (marcándolos `private`) y exponer únicamente **getters** (leer) y **setters** (modificar) públicos para acceder a ellos.

**¿Por qué encapsular?**

* **Protege el estado interno:** nadie fuera de la clase puede modificar los atributos directamente ni dejarlos en un estado inválido.
* **Punto de control único:** un setter puede validar el valor antes de asignarlo (ej. rechazar una edad negativa).
* **Flexibilidad:** la implementación interna de la clase se puede cambiar sin afectar el código que la usa, mientras los getters/setters se mantengan igual.

```java
Aritmetica aritmetica = new Aritmetica(5, 7);
System.out.println(aritmetica.getNumero1()); // leer vía getter
aritmetica.setNumero1(50);                    // modificar vía setter
```

## 6. Herencia, Sobreescritura y el operador `super`

La **herencia** (`extends`) es un pilar de la Programación Orientada a Objetos que permite crear nuevas clases (hijas) basadas en clases existentes (padres). Esto promueve la reutilización de código.

* **Herencia (`extends`):** La clase hija adquiere todos los métodos y atributos de la clase padre.
* **Sobreescritura de Métodos (`@Override`):** Permite a la clase hija redefinir la implementación de un método heredado. Usar `@Override` es una buena práctica para asegurar que el método realmente se está sobreescribiendo.
* **El método `super`:** Hace referencia a la clase padre inmediata.
   * `super.metodo()`: Ejecuta un método original del padre para aprovechar su funcionalidad dentro de la clase hija.
   * `super()`: Llama al constructor de la clase padre.

### Ejemplo de Implementación (`c010_sobreescritura_super`)

```java
// 1. Clase Padre: Define métodos generales
package com.rallende.poo.seccion009.c010_sobreescritura_super;

public class Animal {
    public void comer() { System.out.println("Come muchas veces al dia."); }
    public void dormir() { System.out.println("Duerme muchas horas."); }
    public void camina() { System.out.println("Camina muchos Kilometros."); }
}
```

```java
// 2. Clase Hija: Hereda de Animal, sobreescribe métodos y usa super
package com.rallende.poo.seccion009.c010_sobreescritura_super;

public class Perro extends Animal {
    
    // Método propio de Perro
    public void hacerSonido() { System.out.println("Ladra!"); }

    // Sobreescritura total del método dormir
    @Override
    public void dormir() { System.out.println("Duerme 15hras al dias"); }

    // Sobreescritura combinada utilizando super
    @Override
    public void comer() {
        System.out.println("Come 10 veces al dia.");
        super.camina(); // Llama al método camina() de la clase padre (Animal)
    }
}
```

```java
// 3. Clase Principal: Demostración del comportamiento
package com.rallende.poo.seccion009.c010_sobreescritura_super;

public class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("#".repeat(3) + " Ejemplo Herencia " + "#".repeat(3));
        
        System.out.println("=".repeat(5) + " Padre ");
        Animal animal = new Animal();
        animal.comer();
        animal.dormir();

        System.out.println("=".repeat(5) + " Hijo ");
        Perro perro = new Perro();
        perro.comer();       // Ejecuta el comer() de Perro y luego el super.camina() de Animal
        perro.dormir();      // Ejecuta el dormir() sobreescrito de Perro
        perro.hacerSonido(); // Ejecuta el método exclusivo de Perro
    }
}
```

## 7. El Método `toString()`

El método **`toString()`** es un método heredado de la clase base `Object` de Java. Su objetivo es devolver una representación en cadena de texto (`String`) con el estado interno (atributos) de un objeto.

* **Propósito:** Convertir la información de un objeto en texto legible para facilitar la depuración y presentación de datos.
* **Invocación implícita:** Java llama automáticamente al método `toString()` cuando pasas un objeto directamente a `System.out.println(objeto)` o cuando lo concatenas con texto (`"Objeto: " + objeto`).
* **Buenas prácticas:** Se debe agregar siempre la anotación `@Override` para indicar que estamos reemplazando el comportamiento por defecto de Java (que imprime la dirección de memoria).

### Ejemplo de Implementación

```java
public class com.rallende.poo.seccion009.c013_id_persona.Persona {
    private String nombre;
    private String apellido;

    public com.rallende.poo.seccion009.c013_id_persona.Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Sobreescritura del método toString()
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido;
    }
}
```

## 8. El Contexto Estático (`static`)

Los miembros marcados con la palabra reservada **`static`** pertenecen a la clase en lugar de pertenecer a una instancia (objeto) específica.

* **Atributos estáticos:** Son variables compartidas entre todas las instancias de la clase. Existe una única copia en memoria.
* **Métodos estáticos:** Se pueden ejecutar directamente mediante la clase sin necesidad de crear un objeto (`NombreClase.metodo()`).
* **Restricción:** Desde un contexto estático no se puede acceder a miembros de instancia directamente ni utilizar la palabra `this`.