package com.mycompany.practica_31;

import static com.mycompany.practica_31.MyUtils.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String cadena;

        System.out.println("Escribe una cadena de texto");
        cadena = sc.nextLine();

        System.out.println(inverteix(cadena));

        System.out.println(edat(7, 2, 2003));

        System.out.println("Escribe un numero");
        numero = sc.nextInt();

        System.out.println(factorial(numero));

    }

}
