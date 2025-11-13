package org.example.Tema3;
import java.util.Arrays;

public class Duplicados {

    static void main() {

        int[] vector = {1,2,2,3,4,4,5};
        int[] vector2 = new int[vector.length];
        int tam = 0;

        for (int i = 0; i < vector.length; i++) {

            if (i == vector.length - 1) {
                vector2[i] = vector[i];
            }else if (vector[i] != vector[i+1]) {
                vector2[i] = vector[i];
                tam++;
            }
        }

        System.out.println(Arrays.toString(vector2));
        System.out.println(tam);

        int[] limpio = new int[tam];
        int j = 0;

        for (int i = 0; i < vector2.length; i++) {

            if (vector2[i] <= 0) {
                limpio[i] = vector2[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(limpio));

    }
}
