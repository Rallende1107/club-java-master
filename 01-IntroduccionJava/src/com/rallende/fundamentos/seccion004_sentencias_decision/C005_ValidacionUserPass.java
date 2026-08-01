package com.rallende.fundamentos.seccion004_sentencias_decision;

import java.util.Scanner;

public class C005_ValidacionUserPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user, pass, user_valido, pass_valido;

        user_valido = "admin";
        pass_valido= "1234";

        System.out.print("Ingresa el usuario: ");
        user = sc.next();
        System.out.print("Ingresa la contraseña: ");
        pass = sc.next();

        if (!user_valido.equals(user) && pass_valido.equals(pass)){
            System.out.println("Usuario Invalido");
        }
        else if (user_valido.equals(user) && !pass_valido.equals(pass)){
            System.out.println("Contraseña Invalida");
        }
        else if (!user_valido.equals(user) && !pass_valido.equals(pass)){
            System.out.println("Credenciales Invalidas");
        }
        else {
            System.out.println("Credenciales invalidas");
        }


    }
}
