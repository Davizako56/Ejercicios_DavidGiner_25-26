package org.example.Tema2;
import java.util.Scanner;

public class BateriasBucles {
    static Scanner entrada = new Scanner(System.in);

    static void ejercicio1() {

        String respuesta = "Hola causas";
        String contraseña;

        do {
            System.out.println("Introduce la contraseña:");
            contraseña = entrada.nextLine();

            if (!contraseña.equals(respuesta)) {
                System.out.println("Contrasña incorrecta.");
            }else{
                System.out.println("Contraseña correcta. Bienvenido usuario.");
            }
        }while (!contraseña.equals(respuesta));
    }

    static void ejercicio2() {

        int num = 0;
        boolean err = true;

        while(err){

            try{
                System.out.println("Introduce un número:");
                num = entrada.nextInt();
                err = false;
            }catch (Exception e){
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        if (num >= 1) {

            for (int i = num; i >= 1; i--) {
                System.out.println(i);
            }
        }else{
            System.out.println("El número no puede ser menor que 1.");
        }


    }

    static void ejercicio3() {

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    static void ejercicio4() {

        System.out.println("Introduce una palabra o frase:");
        String cadena = entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {

            String letra = cadena.substring(i,i + 1);
            System.out.println(letra);
        }
    }

    static void ejercicio5() {

        int num = 0;
        boolean err = true;

        while(err) {

            try {
                System.out.println("Introduce un número:");
                num = entrada.nextInt();
                err = false;
            }catch (Exception e) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        System.out.println("Tabla de multiplicar del " + num);

        for (int i = 1; i <= 10; i++) {

            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }

    static void ejercicio6() {

        int max = 0;
        int num = 0;
        boolean err = true;
        boolean sol = true;
        int resultado = 0;

        while(err){

            try{
                System.out.println("Cuantos números quieres sumar?");
                max = entrada.nextInt();
                err = false;
            }catch(Exception e){
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        for (int i = 1; i <= max; i++) {

            sol = true;
            while (sol) {
                try {
                    System.out.println("Inserta el número " + i);
                    num = entrada.nextInt();
                    sol = false;
                }catch (Exception e) {
                    System.out.println("ERROR: El programa no admite texto.");
                    entrada.nextLine();
                }
            }
            resultado += num;
        }

        System.out.println("El resultado es " + resultado);
    }

    static void ejercicio7(){

        int num = 0;
        int resultado = 1;
        boolean err = true;

        while (err){
            try {
                System.out.println("Introduce un número:");
                num = entrada.nextInt();
                err = false;
            }catch(Exception e){
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        for (int i = num; i > 0; i--) {
            resultado *= i;
        }

        System.out.println("El factorial de " + num + " es " + resultado);
    }

    static void ejercicio8() {

        System.out.println("Introduce una palabra o frase:");
        String cadena = entrada.nextLine();

        System.out.print("Salida: ");

        for (int i = cadena.length(); i > 0; i--) {
            String letra = cadena.substring(i - 1, i);
            System.out.print(letra);
        }
    }
}
