package org.example.Tema3;
import java.util.Random;
import java.util.Scanner;

public class Matrices {
    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

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

    static void ejercicio1() {

        int[][] matriz = new int[3][3];

        System.out.println("Rellena una matriz (3x3):");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                System.out.println("Inserte el número de la posición (" + i + ", " + j + ")");
                int num = entrada.nextInt();
                matriz[i][j] = num;
            }
        }

        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Número a buscar:");
        int buscar = entrada.nextInt();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] == buscar) {

                    System.out.println("El número " + buscar + " se encuentra en la posición (" + i + ", " + j + ")");
                    return;
                }
            }
        }

        System.out.println("El número a buscar no existe.");
    }

    static void ejercicio2() {

        int filas = random.nextInt(1,6);
        int columnas = random.nextInt(1,6);
        int[][] matriz = new int[filas][columnas];
        int resultado = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                int num = random.nextInt(10);
                matriz[i][j] = num;
            }
        }

        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Suma de filas:");

        for (int i = 1; i <= matriz.length; i++) {

            System.out.print("Fila " + i + ": ");

            for (int j = 0; j < matriz[i - 1].length; j++) {

                resultado += matriz[i - 1][j];

            }

            System.out.println(resultado);
            resultado = 0;
        }

        System.out.println();
        System.out.println("Suma de columnas: ");

        for (int i = 1; i <= columnas; i++) {

            System.out.print("Columna " + i + ": ");

            for (int j = 0; j < filas; j++) {

                resultado += matriz[j][i - 1];
            }

            System.out.println(resultado);
            resultado = 0;
        }
    }

    static void ejercicio3() {

        System.out.println("Cuantos alumnos tienes?");
        int alumnos = entrada.nextInt();

        System.out.println("Y cuantas asignaturas?");
        int asignaturas = entrada.nextInt();
    }
}
