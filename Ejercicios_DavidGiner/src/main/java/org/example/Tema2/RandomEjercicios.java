package org.example.Tema2;
import java.util.Scanner;
import java.util.Random;

public class RandomEjercicios {
    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

    static void ejercicio1() {

        System.out.println("Lanzando el primer dado...");
        int dado1 = random.nextInt(1,7);
        System.out.println(dado1);
        System.out.println("Lanzando el segundo dado...");
        int dado2 = random.nextInt(1,7);
        System.out.println(dado2);
        int resultado = dado1 + dado2;
        System.out.println("La suma de los dos dados es: " + resultado);

    }

    static void ejercicio2() {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contraseña =  "";

        for (int i = 0; i < 12; i++) {

            int num = random.nextInt(0, 62);

            String caracter = caracteres.substring(num, num + 1);
            contraseña += caracter;
        }

        System.out.println("Contraseña generada de forma aleatoria: " + contraseña);
    }

    static void ejercicio3() {

        int min = 0;
        int max = 0;
        int cantidad = 0;
        boolean err;

        do {

            err = true;

            while(err) {
                try{
                    System.out.println("Introduce el rango mínimo.");
                    min = entrada.nextInt();
                    System.out.println("Introduce el rango máximo.");
                    max = entrada.nextInt();
                    System.out.println("Introduce cuantos números quieres.");
                    cantidad = entrada.nextInt();
                    err = false;
                }catch(Exception e) {
                    System.out.println("ERROR: El programa no admite texto");
                    entrada.nextLine();
                }
            }

            if (min > max) {
                System.out.println("ERROR: El rango mínimo no puede ser mayor que el rango máximo.");
            }else{
                for (int i = 1; i <= cantidad; i++) {

                    int num = random.nextInt(min,max + 1);
                    System.out.println("Imprimir número " + i + ": " + num);
                }
            }

        }while(min > max);
    }

    static void ejercicio4() {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contraseña =  "";
        int rango = random.nextInt(8, 13);

        for (int i = 0; i < rango; i++) {

            if (i == 0) {
                int num = random.nextInt(0, 26);

                String caracter = caracteres.substring(num, num + 1);
                contraseña += caracter;
            }else if (i == 1) {
                int num = random.nextInt(27, 52);

                String caracter = caracteres.substring(num, num + 1);
                contraseña += caracter;
            }else if (i == 2) {
                int num = random.nextInt(53, 62);

                String caracter = caracteres.substring(num, num + 1);
                contraseña += caracter;
            }else{
                int num = random.nextInt(0, 62);

                String caracter = caracteres.substring(num, num + 1);
                contraseña += caracter;
            }

        }

        System.out.println("Contraseña generada de forma aleatoria: " + contraseña);
    }

}
