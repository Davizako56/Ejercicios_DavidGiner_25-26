package org.example.Tema2;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Generaciones {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        int modo = 0;

        do{
            System.out.println("Elige el modo de introducir tu edad");
            System.out.println("Modo [1] - 1");
            System.out.println("Modo [2] - 2");
            System.out.println("------------------------------------");

            if (entrada.hasNextInt()) {
                modo = entrada.nextInt();

                if (modo == 1) {

                    int año = 0;
                    LocalDateTime hoy = LocalDateTime.now();

                    do {
                        boolean err = true;

                        while (err) {
                            try{
                                System.out.println("Introduce tu año de nacimiento");
                                año = entrada.nextInt();
                                err = false;
                            }catch(InputMismatchException e) {
                                System.out.println("ERROR: El programa no admite texto");
                                entrada.nextLine();
                            }
                        }

                        if (año < 1900 || año > hoy.getYear()) {
                            System.out.println("El año se sale de los límites.");
                        }
                    }while (año < 1900 || año > hoy.getYear());

                    if (año >= 1995) {
                        System.out.println("Eres generación Z");
                    }else if (año >= 1982){
                        System.out.println("Eres milenial");
                    }else if (año >= 1965){
                        System.out.println("Eres generación X");
                    }else if (año >= 1945){
                        System.out.println("Eres baby boomer");
                    }else if (año >= 1928){
                        System.out.println("Eres generación silent");
                    }else{
                        System.out.println("Sin generación bautizada");
                    }
                }else if (modo == 2){
                    int edad = 0;
                    LocalDateTime hoy = LocalDateTime.now();

                    do {
                        boolean sol = true;

                        while (sol) {
                            try{
                                System.out.println("Introduce tu edad de nacimiento");
                                edad = entrada.nextInt();
                                sol = false;
                            }catch (InputMismatchException e) {
                                System.out.println("ERROR: El programa no admite texto");
                                entrada.nextLine();
                            }

                            if (edad < 0) {
                                System.out.println("Esta edad no es posible");
                            }
                        }
                    }while (edad < 0);

                    int real = hoy.getYear() - edad;

                    if (real >= 1995) {
                        System.out.println("Eres generación Z");
                    }else if (real >= 1982){
                        System.out.println("Eres milenial");
                    }else if (real >= 1965){
                        System.out.println("Eres generación X");
                    }else if (real >= 1945){
                        System.out.println("Eres baby boomer");
                    }else if (real >= 1928){
                        System.out.println("Eres generación silent");
                    }else{
                        System.out.println("Sin generación bautizada");
                    }

                }else{
                    System.out.println("El modo no es ni 1 ni 2");
                }
            }else{
                System.out.println("ERROR: No puedes introducir texto.");
            }
        }while (modo != 1 && modo != 2);
    }
}
