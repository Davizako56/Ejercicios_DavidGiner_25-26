package org.example.Tema1;
import java.util.Scanner;

public class Practica3 {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        int alt;

        //El do-while sirve para volver a pedir la altura mientras la altura esté por encima de 230 o en caso de que sea negativa.

        do {
            System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");
            System.out.println("Leyendo altura (cm)...");
            alt = entrada.nextInt();

            if (alt > 230 || alt < 0) {
                System.out.println("ERROR DE LECTURA. BAJA DE LA VÁSCULA Y VUELVE A SUBIR.");
            }
        }while (alt > 230 || alt < 0);

        //El if sirve para que si la altura es menor que 140 que diga que no puedes subirte a la atracción y pare el programa pero, que si llega a ser mayor, con el else seguira el programa y pedira el peso

        if (alt < 140) {
            int res = 140 - alt;
            System.out.println("LO SIENTO. NO PUEDES SUBIR A LA ATRACCIÓN. Te faltan " + res + "cm de altura.");
        }else{

            //A partir del else habrá un if seguido con un else-if y acabado con un else, todos estos para diseñar que ocurrirá si el peso es el adecuado respecto al mínimo, si se pasa del peso máximo permitido o si no llega al mínimo.

            System.out.println("Leyendo peso (kg)...");
            int pes = entrada.nextInt();
            int min = (alt * 2) / 8;

            if (pes >= min && pes <= 120) {
                System.out.println("Pesas " + pes + "kg, peso mínimo calculado: " + min + "kg, ¡¡SUBE A LA ATRACCIÓN!!");

            }else if (pes < min) {
                int resto = min - pes;
                System.out.println("LO SIENTO. NO PUEDES SUBIR A LA ATRACCIÓN. Te faltan " + resto + "kg de peso.");
            }else{
                int max = pes - 120;
                System.out.println("LO SIENTO. Sobrepasas por " + max + "kg el límite de la atración.");
            }
        }
    }
}
