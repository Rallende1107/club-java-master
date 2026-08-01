package com.rallende.fundamentos.seccion004_sentencias_decision;

public class C007_OperadorNot {
    public static void main(String[] args) {
        boolean salirSistema;
//        salirSistema = true;
        salirSistema = false;

        System.out.println("Holas");

        if (!salirSistema){
            System.out.println("Continua en el sistema");
        }
        else {
            System.out.println("Sin sistema");
        }
    }
}
