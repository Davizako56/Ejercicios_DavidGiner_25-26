package org.example.Tema1;
import java.util.Scanner;

public class Practica4 {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        //El do-while lo he implementado para que si los números no son de tres cifras o son negativos que de error y vuelva a pedir.

        do {

            boolean err = true;

            while (err) {
                try {
                    System.out.println("Introduce el multiplicando (3 cifras)...");
                    num1 = entrada.nextInt();

                    System.out.println("Introduce el multiplicador (3 cifras)...");
                    num2 = entrada.nextInt();
                    err = false;
                }catch(Exception e) {
                    System.out.println("ERROR: El programa no admite texto...");
                    entrada.nextLine();
                }
            }

            if (num1 < 100 || num1 > 999 || num2 < 100 || num2 > 999){
                System.out.println("ERROR: El número ha de ser de 3 cifras");
            }
        }while (num1 < 100 || num1 > 999 || num2 < 100 || num2 > 999);

        //Todas las variables de abajo son para sacar las unidades, decenas y centenas del multiplicador y multiplicarlos por el multiplicando cada uno para sacar los números a sumar.

        int res = num1 * num2;
        String numy = Integer.toString(num2);
        String num_uni = numy.substring(2,3);
        String num_dec = numy.substring(1,2);
        String num_cen = numy.substring(0,1);
        int uni = Integer.parseInt(num_uni);
        int dec = Integer.parseInt(num_dec);
        int cen = Integer.parseInt(num_cen);
        int sum1 = uni * num1;
        int sum2 = dec * num1;
        int sum3 = cen * num1;

        //Aqui simplemente he imprimido toda la operación a base de espacios.

        System.out.println("El resultado es: " + res);
        System.out.println("El proceso es:");
        System.out.println("    " + num1);
        System.out.println("  x " + num2);
        System.out.println("----------");
        System.out.println("    " + sum1);
        System.out.println("   " + sum2 + "x");
        System.out.println("  " + sum3 + "xx");
        System.out.println("----------");
        System.out.println("  " + res);

    }
}
