package org.example.Tema3;
import java.util.Scanner;

public class Anidados {
    static Scanner entrada = new Scanner(System.in);

    static void main() {


        externo:
        for (int i = 0; i < 9; i++) {
            System.out.println("Soy el externo con i = " + i);

            interno:
            for (int j = 10; j >= 0; j--) {
                System.out.println("Soy el interno con j = " + j);

                if (j == 5) {
                    break;
                }
            }
        }
    }

    static void ejercicio2() {

        String ladrillo = "*";
        String fila = "";

        System.out.println("Inserta la altura:");
        int altura = entrada.nextInt();

        for (int i = 1; i <= altura; i++) {

            fila += ladrillo;
            System.out.println(fila);
        }
    }

    static void ejercicio3() {

        System.out.println("Introduce el número máximo:");
        int max = entrada.nextInt();

        bucle1:
        for (int i = 1; i <= 10; i++) {

            System.out.println("Tabla de multiplicar del " + i + ":");

            for (int j = 1; j <= 10; j++) {

                int resultado = i * j;

                System.out.println(i + " x " + j + " = " + resultado);

                if (resultado > max) {
                    break bucle1;
                }
            }
        }
    }

    static void ejercicio4() {

        System.out.println("Introduzca el número máximo:");
        int max = entrada.nextInt();

        for (int i = 2; i <= max; i++) {

            if (i == 2 || i == 3 || i == 5 || i == 7) {

                System.out.print(i + " ");
                continue;
            }

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
