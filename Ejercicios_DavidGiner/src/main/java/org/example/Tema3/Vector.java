package org.example.Tema3;
import java.util.Arrays;
import java.util.Scanner;

public class Vector {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        int[] vector = new int[8];

        System.out.println("Vector: " + Arrays.toString(vector));

        for (int i = 1; i <= vector.length; i++) {

            System.out.println("Inserta el número " + i + ":");
            int num = entrada.nextInt();
            vector[i - 1] = num;
        }

        int[] vector2 = vector.clone();

        System.out.println("Clon de vector: " + Arrays.toString(vector2));

        for (int i = 0; i < vector.length; i++) {

            System.out.print(vector[i] + ", ");
        }
        System.out.println();

        for (int i = vector.length - 1; i >= 0; i--) {

            System.out.print(vector[i]);
        }
    }
}
