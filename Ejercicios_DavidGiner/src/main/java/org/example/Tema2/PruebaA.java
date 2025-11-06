package org.example.Tema2;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Random;

public class PruebaA {
    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

    static void ejercicio1() {

        int num = random.nextInt(0,101);
        boolean err;
        int elec = 0;

        System.out.println("Acabode pensar en un número [0-100]... ¿Puedes adivinarlo? ¡Tienes 10 intentos!");

        for (int i = 1; i <= 10; i++) {

            err = true;

            while(err) {
                try{
                    System.out.println("Intento " + i + ". Introduce un número:");
                    elec = entrada.nextInt();
                    err = false;
                }catch(Exception e) {
                    System.out.println("ERROR: El programa no admite texto.");
                    entrada.nextLine();
                }
            }

            if (elec > num) {
                System.out.println("Tu número es mayor al que he pensado.");
            }else if (elec < num) {
                System.out.println("Tu número es menor al que he pensado.");
            }else{
                System.out.println("¡HAS ACERTADO! El número era " + num);
                break;
            }
        }

        System.out.println("Te has quedado sin intentos.");
    }

    static void ejercicio2() {

        int contador = 0;
        int año = 0;
        LocalDateTime hoy = LocalDateTime.now();
        boolean err;

        do {

            err = true;

            while(err) {
                try{
                    System.out.println("Elige un año:");
                    año = entrada.nextInt();
                    err = false;
                }catch(Exception e) {
                    System.out.println("ERROR: El programa no admite texto.");
                    entrada.nextLine();
                }
            }

            if (año > hoy.getYear() || año < 1900) {
                System.out.println("Año no válido, elige un año " + (año < hoy.getYear() ? "mayor." : "menor."));
            }else{
                for (int i = año; i <= hoy.getYear(); i++) {

                    if (año % 4 == 0) {
                        if (año % 100 != 0){
                            contador++;
                        }else{
                            if (año % 400 == 0) {
                                contador++;
                            }
                        }
                    }
                }

                System.out.println("Han ocurrido " + contador + " años bisiestos.");
            }
        }while(año > hoy.getYear() || año < 1900);
    }
}
