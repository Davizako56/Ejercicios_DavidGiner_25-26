package org.example.Tema3;

public class Matrices {

    static void main() {

        int[][] matriz = {{0,1,2},{3,4,5},{6,7,8}};

        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();
        }
    }
}
