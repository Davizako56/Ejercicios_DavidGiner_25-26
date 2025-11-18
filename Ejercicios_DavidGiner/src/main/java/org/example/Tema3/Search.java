package org.example.Tema3;
import java.util.Scanner;

public class Search {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        int[] vector = {0,3,2,4,5};

        System.out.println("Introduce le número que quieras buscar:");
        int num = entrada.nextInt();

        System.out.println("El número que buscas está en la posición: " + buscar(vector,num));
    }

    static int buscar(int[] vector, int num) {

        for (int i = 0; i < vector.length; i++) {

            if (num == vector[i]) {

                num = i;
                break;
            }
        }

        return num;
    }
}
