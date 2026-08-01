# Encapsulamiento

El **encapsulamiento** nos permite controlar el acceso a los atributos de nuestra clase.

---

### 🔒 Modificador de acceso `private`
Para evitar acceder a los atributos directamente, usaremos el modificador de acceso **`private`**.

---

### 🛠️ Métodos `get` y `set`
Para poder leer o modificar los atributos, crearemos métodos conocidos como **`get`** y **`set`**:

* **Métodos `get` (obtener):** Nos permiten **leer** el valor de un atributo.
* **Métodos `set` (poner):** Nos permiten **modificar** el valor de un atributo.

---

### 💡 Ejemplo práctico en Java

```java
public class com.rallende.poo.seccion009.c013_id_persona.Persona {
    // 1. Atributo privado (Acceso restringido)
    private String nombre;

    // 2. Getter: Permite LEER el nombre
    public String getNombre() {
        return this.nombre;
    }

    // 3. Setter: Permite MODIFICAR el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
```