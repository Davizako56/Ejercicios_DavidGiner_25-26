package org.example;
import java.util.Random;

public class Ruleta {

    public static void main(String[] args) {
        Random random = new Random();

        int[] tambor = {0,0,0,0,0,0};
        int contador = 0;

        while (contador == 0 || contador == 6) {
            for(int i = 0; i < 6; i++) {

                int bala = random.nextInt(0,2);
                tambor[i] = bala;

                if (tambor[i] == 1) {
                    contador++;
                }
            }
        }

        System.out.println("Hay " + contador + " balas en el tambór.");
        int posicion = random.nextInt(0,6);

        if (tambor[posicion] == 1) {
            System.out.println("Has perdido");
        }else{
            System.out.println("Has ganado");
        }
    }
}
