package org.example.Tema3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaArrays {
    static Random random = new Random();
    static Scanner entrada = new Scanner(System.in);

    static void ejercicio1() {

        int[] vector = new int[8];
        int resultado = 0;

        for (int i = 0; i < vector.length; i++) {

            int num = random.nextInt(501);
            vector[i] = num;
            resultado += vector[i];
        }

        System.out.println("Vector: " + Arrays.toString(vector));
        System.out.println("La suma de los elementos es: " + resultado);


    }

    static void ejercicio2() {

        int[] vector = {1,2,3,4,5};
        int[] invertido = new int[5];
        int j = 0;

        System.out.println("Array original: " + Arrays.toString(vector));

        for (int i = vector.length - 1; i >= 0; i--) {

            invertido[j] = vector[i];
            j++;
        }

        System.out.println("Array invertido: " + Arrays.toString(invertido));
    }

    static void ejercicio3() {


        int[] vector = new int[25];
        int num = 0;
        int contador = 0;
        boolean err;

        for (int i = 0; i < vector.length; i++) {

            vector[i] = random.nextInt(101);;
        }

        do {

            err = true;

            while(err) {
                System.out.println("Ingresa un número [0-100]:");

                if (entrada.hasNextInt()) {
                    num = entrada.nextInt();
                    err = false;
                }else{
                    System.out.println("ERROR: El programa no admite texto.");
                    entrada.nextLine();
                }
            }

            if (num < 0 || num > 100) {
                System.out.println("El número no encaja con el rango señalado");
            }
        }while (num < 0 || num > 100);

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == num) {
                contador++;
            }
        }

        System.out.println("Vector: " + Arrays.toString(vector));
        System.out.println("El número " + num + " aparece " + (contador == 1 ? "una vez" : contador + " veces") + " en el array");
    }

    static void ejercicio4() {


        int[] vector = {1,3,5,7,9};
        int indice = 0;
        boolean err;

        System.out.println("Array original: " + Arrays.toString(vector));

        do {

            err = true;

            while(err) {
                System.out.println("Ingresa el índice a eliminar:");

                if (entrada.hasNextInt()) {
                    indice = entrada.nextInt();
                    err = false;
                }else{
                    System.out.println("ERROR: El programa no admite texto.");
                    entrada.nextLine();
                }
            }

            if (indice < 0 || indice >= vector.length) {
                System.out.println("El ídice no existe");
            }
        }while (indice < 0 || indice >= vector.length);

        int[] recorte = new int[vector.length - 1];

        for (int i = 0; i < recorte.length; i++) {

            if (i >= indice) {
                recorte[i] = vector[i + 1];
            }else{
                recorte[i] = vector[i];
            }
        }

        System.out.println("Array resultante: " + Arrays.toString(recorte));
    }

    static void ejercicio5() {


        int[] vector = {1,2,3,4,5};
        int[] rotado = new int[5];

        System.out.println("Array original: " + Arrays.toString(vector));

        for (int i = 1; i < vector.length; i++) {

            rotado[i] = vector[i - 1];

            if (i == vector.length - 1) {

                rotado[0] = vector[vector.length - 1];
            }else{
                rotado[i + 1] = vector[i];
            }



        }

        System.out.println("Array rotado: " + Arrays.toString(rotado));
    }

    static void ejercicio6() {

        int[] vector = {1,5,3,4,3,5,1};
        boolean simetrico;
        int contador = vector.length - 1;

        System.out.println("Array: " + Arrays.toString(vector));

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == vector[contador]){
                contador--;
            }else{
                System.out.println("Es simétrico: No");
                return;
            }
        }

        System.out.println("Es simétrico: Si");
    }

    static void ejercicio7() {

        int[] vector1 = {1,2,3,4,5,6};
        int[] vector2 = {7,8,9,10};
        int[] fusion = new int[vector1.length + vector2.length];
        int i;


        System.out.println("Array 1: " + Arrays.toString(vector1));
        System.out.println("Array 2: " + Arrays.toString(vector2));

        for (i = 0; i < vector1.length; i++) {
            fusion[i] = vector1[i];
        }

        i = 0;

        for (int j = vector1.length; j < fusion.length; j++) {
            fusion[j] = vector2[i];
            i++;
        }

        System.out.println("Array combinado: " + Arrays.toString(fusion));
    }

    static void ejercicio8() {

        int[] vector = {1,2,3,5,6,7,9};
        int[] resultante = new int[vector.length + 1];
        boolean err;
        int num = 0;
        int posicion = 0;

        System.out.println("Array original: " + Arrays.toString(vector));

        do{
            err = true;

            while (err) {
                try{
                    System.out.println("Que número quieres insertar?");
                    num = entrada.nextInt();
                    System.out.println("En que poscición?");
                    posicion = entrada.nextInt();
                    err = false;
                }catch (Exception e) {
                    System.out.println("ERROR: El programa no admite texto.");
                    entrada.nextLine();
                }
            }

            if (posicion < 0 || posicion >= resultante.length) {
                System.out.println("La posición no encaja.");
            }
        }while (posicion < 0 || posicion >= resultante.length);

        for (int i = 0; i < resultante.length; i++) {

            if (i == posicion) {
                resultante[i] = num;
            }else if (i == vector.length || resultante[posicion] == num){
                resultante[i] = vector[i - 1];
            }else{
                resultante[i] = vector[i];
            }
        }

        System.out.println("Array resultante: " + Arrays.toString(resultante));

    }
}
