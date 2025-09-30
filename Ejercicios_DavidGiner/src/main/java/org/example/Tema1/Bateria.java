package org.example.Tema1;
import java.util.Scanner;

public class Bateria {
    static Scanner entrada = new Scanner(System.in);

    static void ejercicio1() {

        int horas = 0;
        int tarifa = 0;
        boolean err = true;

        while(err) {
            try {
                System.out.println("Introduzca las horas:");
                horas = entrada.nextInt();

                System.out.println("Introduzca la tarifa por horas:");
                tarifa = entrada.nextInt();
                err = false;
            }catch(Exception e) {
                System.out.println("ERROR: El programa no admite texto");
                entrada.nextLine();
            }
        }

        double salario = horas * tarifa;

        System.out.println("Tu salario bruto es: " + salario + "€.");
    }

    static void ejercicio2() {

        int horas = 0;
        int tarifa = 0;
        boolean err = true;

        while(err) {
            try{
                System.out.println("Introduzca las horas:");
                horas = entrada.nextInt();

                System.out.println("Introduzca la tarifa por horas:");
                tarifa = entrada.nextInt();
                err = false;
            }catch(Exception e) {
                System.out.println("Error: El programa no admite texto");
                entrada.nextLine();
            }
        }

        double salario = horas * tarifa;

        if (horas > 40) {
            salario = horas * (tarifa * 1.5);
        }

        System.out.println("Tu salario bruto es: " + salario + "€.");

    }

    static void ejercicio3() {

        System.out.println("Introduzca un número:");
        int num = entrada.nextInt();

        if (num == 0) {
            System.out.println("El número es 0.");
        }else if (num < 0) {
            System.out.println("El número es negativo.");
        }else{
            System.out.println("El número es positivo.");
        }
    }

    static void ejercicio4() {

        int num1;
        int num2;
        int num3;

        do {
            System.out.println("Introduzca el primer número:");
            num1 = entrada.nextInt();

            System.out.println("Introduzca el segundo número:");
            num2 = entrada.nextInt();

            System.out.println("Introduzca el tercer número:");
            num3 = entrada.nextInt();

            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("ERROR: Hay números introducidos que son iguales.");
            }
        }while(num1 == num2 || num1 == num3 || num2 == num3);

        if (num1 < num2 && num1 < num3) {
            System.out.println("El primer número es el menor.");
        }

        if (num2 < num1 && num2 < num3) {
            System.out.println("El segundo número es el menor.");
        }

        if (num3 < num1 && num3 < num2) {
            System.out.println("El tercer número es el menor.");
        }
    }

    static void ejercicio5() {

        int num1 = 0;
        int num2 = 0;

        do {

            boolean err = true;

            while(err) {
                try {
                    System.out.println("Introduzca el primer número:");
                    num1 = entrada.nextInt();

                    System.out.println("Introduzca el segundo número");
                    num2 = entrada.nextInt();
                    err = false;
                }catch(Exception e) {
                    System.out.println("ERROR: El programa no admite texto");
                    entrada.nextLine();
                }
            }

            if (num2 == 0) {
                System.out.println("ERROR: No se puede dividir entre 0.");
            }
        }while(num2 == 0);

        int res = num1 / num2;

        System.out.println("El resultado es: " + res);
    }

    static void ejercicio6() {

        int b;
        int h;

        do {
            System.out.println("Introduzca la b:");
            b = entrada.nextInt();

            if (b < 0) {
                System.out.println("La b tiene que ser positiva");
            }
        }while(b < 0);

        do {
            System.out.println("Introduzca la h:");
            h = entrada.nextInt();

            if (h < 0) {
                System.out.println("La h tiene que ser positiva");
            }
        }while(h < 0);

        int A = (b * h) / 2;

        System.out.println("El área del triángulo es: " + A);
    }

    static void ejercicio7() {

        boolean tomate = true;
        boolean jamon = true;
        boolean aceite = true;
        String respuesta = "Hola";

        while(!respuesta.equalsIgnoreCase("Si") && !respuesta.equalsIgnoreCase("No")) {

            System.out.println("¿Tenemos tomate?");
            respuesta = entrada.next();

            if (respuesta.equalsIgnoreCase("Si")) {
                tomate = true;
            }else if (respuesta.equalsIgnoreCase("No")) {
                tomate = false;
            }else{
                System.out.println("No has respondido si tenemos tomate");
            }

        }

        respuesta = "Hola";

        while(!respuesta.equalsIgnoreCase("Si") && !respuesta.equalsIgnoreCase("No")) {

            System.out.println("¿Tenemos jamón?");
            respuesta = entrada.next();

            if (respuesta.equalsIgnoreCase("Si")) {
                jamon = true;
            }else if(respuesta.equalsIgnoreCase("No")) {
                jamon = false;
            }else{
                System.out.println("No has respondido si tenemos jamón");
            }


        }

        respuesta = "Hola";

        while(!respuesta.equalsIgnoreCase("Si") && !respuesta.equalsIgnoreCase("No")) {

            System.out.println("¿Tenemos aceite?");
            respuesta = entrada.next();

            if (respuesta.equalsIgnoreCase("Si")) {
                aceite = true;
            }else if (respuesta.equalsIgnoreCase("No")) {
                aceite = false;
            }else{
                System.out.println("No has respondido si tenemos aceite");
            }


        }

        if (!tomate || !jamon || !aceite) {
            System.out.println("Tenemos que ir a comprar");
        }else{
            System.out.println("No tenemos que ir a comprar");
        }
    }
}
