package org.example.Tema2;
import java.util.Scanner;

public class Practica1 {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        //Creamos las variables necesarias para el programa y las inicializamos.

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        String dia = "dd";
        String mes = "mm";
        String año = "aaaa";

        //Un do-while creado para introducir la fecha de nacimiento y asegurarse de que no de ningún error, si es el caso el do-while hará su trabajo.

        do {

            boolean sol = true;

            while (sol) {
                try{
                    boolean err = true;
                    while (err) {
                        try{

                            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
                            String fecha = entrada.next();

                            dia = fecha.substring(0,2);
                            mes = fecha.substring(3,5);
                            año = fecha.substring(6,10);
                            err = false;
                        }catch(Exception e) {
                            System.out.println("ERROR: La fecha de nacimiento no cuadra con el formato");
                            entrada.nextLine();
                        }
                    }


                    num1 = Integer.parseInt(dia);
                    num2 = Integer.parseInt(mes);
                    num3 = Integer.parseInt(año);
                    sol = false;
                }catch(NumberFormatException e) {
                    System.out.println("ERROR: No hay valores numericos en la fecha");
                    entrada.nextLine();
                }
            }

            if (num3 > 2025 || num3 < 1000) {
                System.out.println("El año no cuadra");
            }

            if (num2 > 12 || num2 < 1) {
                System.out.println("El mes no cuadra");
            }

            if (num1 > 31 || num1 < 1) {
                System.out.println("El dia no cuadra");
            }
        }while(num3 > 2025 || num3 < 1000 || num2 > 12 || num2 < 1 || num1 > 31 || num1 < 1);

        //El siguiente bloque esta para realizar e imprimir las operaciones que nos llevarán hacia el número de la suerte.

        int resultado = num1 + num2 + num3;

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + resultado);

        String res = Integer.toString(resultado);
        String a = res.substring(0,1);
        String b = res.substring(1,2);
        String c = res.substring(2,3);
        String d = res.substring(3,4);

        int numa = Integer.parseInt(a);
        int numb = Integer.parseInt(b);
        int numc = Integer.parseInt(c);
        int numd = Integer.parseInt(d);

        int suerte = numa + numb + numc + numd;
        System.out.println(numa + " + " + numb + " + " + numc + " + " + numd + " = " + suerte);
        System.out.println("Tu número de la suerte es " + suerte);
    }
}
