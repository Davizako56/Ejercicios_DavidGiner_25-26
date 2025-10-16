package org.example;
import java.util.Scanner;

public class ModeloA {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio1();
    }

    static void Ejercicio1() {

        boolean err = true;
        int num = 0;

        while(err) {
            try {
                System.out.println("Introduce un número...");
                num = entrada.nextInt();
                err = false;
            }catch(Exception e) {
                System.out.println("ERROR: Introduce un valor válido");
                entrada.nextLine();
            }
        }

        if (num < 0) {
            num = num * -1;
        }

        System.out.println("El valor absoluto es " + num);
    }

    static void Ejercicio2() {

        System.out.println("Introduce tu nombre:");
        String nombre = entrada.next();

        System.out.println("Introduce el ancho de la pared");
        double par_ancho = entrada.nextDouble();

        System.out.println("Introduce el largo de la pared");
        double par_largo = entrada.nextDouble();

        System.out.println("Introduce el ancho del azulejo");
        double azu_ancho = entrada.nextDouble();

        System.out.println("Introduce el largo del azulejo");
        double azu_largo = entrada.nextDouble();

        if (azu_ancho == azu_largo) {

        }
    }
}
