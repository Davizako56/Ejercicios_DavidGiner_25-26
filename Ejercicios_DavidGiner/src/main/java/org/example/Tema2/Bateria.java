package org.example.Tema2;
import java.util.Scanner;

public class Bateria {
    static Scanner entrada = new Scanner(System.in);

    static void ejercicio1() {

        String frase = "Hola me llamo David";
        int longitud = frase.length();
        String sinespacio = frase.replace(" ", "");
        String mitad1 = frase.substring(0,7);
        String mitad2 = frase.substring(7,19);
        String mayus = frase.toUpperCase();

        System.out.println("a: " + frase);
        System.out.println("b: " + longitud);
        System.out.println("c: " + sinespacio);
        System.out.println("d: " + mitad1.concat(mitad2));
        System.out.println("e: " + mayus);
    }

    static void ejercicio2() {

        System.out.println("Introduzca la primera frase");
        String frase1 = entrada.nextLine();

        System.out.println("Introduzca la segunda frase");
        String frase2 = entrada.nextLine();

        if (frase1.length() > frase2.length()) {
            System.out.println("La primera frase es mayor que la segunda");
        }else{
            System.out.println("La segunda frase es mayor que la primera");
        }
    }
}
