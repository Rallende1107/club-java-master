package com.rallende.poo.seccion009.c003_constructor;

/**
 * Clase que representa operaciones de Aritmética básica.
 */

public class Aritmetica {
    int operando1;
    int operando2;
    /**
     * Constructor vacío (Por defecto).
     * Permite instanciar la clase sin inicializar valores inmediatamente.
     */
    public Aritmetica() {
        // Se define explícitamente para permitir la sobrecarga de constructores
    }
    /**
     * Constructor con parámetros.
     * Ejemplo de sobrecarga: simplifica la creación asignando valores directamente.
     * Ejemplo de uso: Aritmetica a = new Aritmetica(5, 7);
     *
     * @param op1 Primer operando
     * @param op2 Segundo operando
     */

    public Aritmetica(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
    }

    void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("Resultado suma: " +  resultado) ;
    }
    void restar(){
        int resultado = operando1 - operando2;
        System.out.println("Resultado resta: " +  resultado) ;
    }
    void multiplicar(){
        int resultado = operando1 * operando2;
        System.out.println("Resultado multiplicación: " +  resultado) ;
    }
    void dividir(){
        double resultado = (double) operando1 / operando2;
        System.out.println("Resultado divición: " +  resultado) ;
    }

    public static void main(String[] args) {
        // Uso del constructor CON parámetros
        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        System.out.println("--- Objeto 1 ---");
        // ¡Para ver tu constructor con parámetros en acción!
        aritmetica1.sumar();
        aritmetica1.restar();
        aritmetica1.multiplicar();
        aritmetica1.dividir();

        System.out.println("\n--- Objeto 2 ---");
        // Uso del constructor VACÍO
        Aritmetica aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        // Llamada a los métodos
        aritmetica2.sumar();
        aritmetica2.restar();
        aritmetica2.multiplicar();
        aritmetica2.dividir();
    }
}