package exap_prin_7;

import java.util.Scanner;

public class ExaP_Prin_7 {

    public static void main(String[] args) {
        int[] arre = new int[15];
        int x, y;
        int[] Copia = new int[arre.length];
        Scanner Cap = new Scanner(System.in);
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) (Math.random() * 20) + 1;
            System.out.print("[" + arre[i] + "]");
        }
        System.out.println("");
        System.out.println("¿Desde que posicion quieres copiar?");
        x = Cap.nextInt();
        System.out.println("¿Hasta que posicion quieres copiar?");
        y = Cap.nextInt();
        for (int i = (x - 1); i < y; i++) {
            Copia[i] = arre[i];
            if ((Copia[i] % 2) == 0) {
                System.out.print("[" + Copia[i] + "]");
            }
        }
    }

}
