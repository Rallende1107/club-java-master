package com.rallende.fundamentos.seccion003_operadores;

import java.util.Scanner;

public class C006_CalcularAreaRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, altura, perimetro, area;

        System.out.print("Ingresar base : ");
        base = Integer.parseInt(sc.nextLine());

        System.out.print("Ingresar altura : ");
        altura= Integer.parseInt(sc.nextLine());
        
        area = (base * altura);
        System.out.println("Area : " + area);

        perimetro = (base + altura) * 2;
        System.out.println("Perimetro : " + perimetro);

        sc.close();
    }

}
