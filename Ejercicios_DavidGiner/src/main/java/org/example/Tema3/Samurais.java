package org.example.Tema3;
import java.util.Random;
import java.util.Scanner;

public class Samurais {

    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        //En esta parte del código declaro las variables necesarias.

        String potencia1;
        String[] equipo1;
        int resultado1 = 0;
        String potencia2;
        String[] equipo2;
        int resultado2 = 0;
        int posicion = random.nextInt(1,8);
        int bajas1 = 0;
        int bajas2 = 0;

        //Este do-while lo he creado para hacer el equipo 1.

        do {
            System.out.println("Eqipo 1");
            System.out.println("Introduce potencia de los samurais:");
            potencia1 = entrada.nextLine();

            equipo1 = potencia1.split(" ");

            for (int i = 0; i < equipo1.length; i++) {
                int num = Integer.parseInt(equipo1[i]);

                if (num < 1 || num > 24) {
                    System.out.println("ERROR: El número debe de encajar entre los límites [1-24]");
                    return;
                }
                resultado1 += num;
            }

            if (equipo1.length > 7 || equipo1.length < 1) {
                System.out.println("ERROR: El número de samurais no encaja.");
            }

            if (resultado1 != 30) {
                System.out.println("ERROR: La suma de la potencia del equipo no es 30.");
            }


        }while(equipo1.length > 7 || equipo1.length < 1 || resultado1 != 30);

        System.out.println("Equipo completado.");

        //Este do-while lo he creado para hacer el equipo 2.

        do {
            System.out.println("Eqipo 2");
            System.out.println("Introduce potencia de los samurais:");
            potencia2 = entrada.nextLine();

            equipo2 = potencia2.split(" ");

            for (int i = 0; i < equipo2.length; i++) {
                int num = Integer.parseInt(equipo2[i]);

                if (num < 1 || num > 24) {
                    System.out.println("ERROR: El número debe de encajar entre los límites [1-24]");
                    return;
                }
                resultado2 += num;
            }

            if (equipo2.length > 7 || equipo2.length < 1) {
                System.out.println("ERROR: El número de samurais no encaja.");
            }

            if (resultado2 != 30) {
                System.out.println("ERROR: La suma de la potencia del equipo no es 30.");
            }


        }while(equipo2.length > 8 || equipo2.length < 1 || resultado2 != 30);

        System.out.println("Equipo completado.");

        System.out.println("¡Empieza la batalla!");

        //Este for es para simular la batalla y contar las bajas.

        for (int i = posicion; i <= 7; i++) {

            if (bajas1 > 3 || bajas2 > 3) {
                break;
            }

            System.out.print("Samurai " + i + ".");

            int samurai1 = Integer.parseInt(equipo1[i - 1]);
            int samurai2 = Integer.parseInt(equipo2[i - 1]);

            if (samurai1 > samurai2){
                System.out.println(" Gana equipo 1. " + samurai1 + " vs " + samurai2);
                bajas2++;
            }else if (samurai2 > samurai1){
                System.out.println(" Gana equipo 2. " + samurai1 + " vs " + samurai2);
                bajas1++;
            }else{
                System.out.println(" Ha sido empate. " + samurai1 + " vs " + samurai2);
                bajas1++;
                bajas2++;
            }

            if (i == 7) {
                i = 0;
                continue;
            }

            if (i == posicion - 1) {
                break;
            }
        }

        //Un ternario para indicar quien ha ganado y cuantas baas tiene el equipo contrario

        System.out.println(bajas1 > bajas2 ? "¡Equipo 2 GANA! Equipo 1 ha tenido " + bajas1 + " bajas." : bajas2 > bajas1 ? "¡Equipo 1 GANA! Equipo 2 ha tenido " + bajas2 + " bajas." : "Ha sido empate");
    }

}
