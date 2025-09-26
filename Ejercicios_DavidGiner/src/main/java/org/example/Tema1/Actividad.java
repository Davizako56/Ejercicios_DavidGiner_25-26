package org.example.Tema1;
import java.util.Scanner;

public class Actividad {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso);
        System.out.println("Introduce un número");
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número");
        int num2 = entrada.nextInt();

        int res = num1 + num2;

        System.out.println("El resultado de sumar los dos números es: " + res);
    }
}
