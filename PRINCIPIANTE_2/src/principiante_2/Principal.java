package principiante_2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int arre1[] = new int[10];
        int arre2[] = new int[10];
        Scanner a = new Scanner(System.in);

        //Impresion arreglo 1
        System.out.println("Ingresa el valor del arreglo 1");
        for (int i = 0; i < arre1.length; i++) {
            int f = a.nextInt();
            arre1[i] = f;
        }

        //Impresion arreglo 2
        System.out.println("Ingresa el valor de arreglo 2");
        for (int i = 0; i < arre2.length; i++) {
            int g = a.nextInt();
            arre2[i] = g;
        }
        System.out.print("1: ");
        for (int i = 0; i < arre1.length; i++) {
            System.out.print("[" + arre1[i] + "]");
        }
        System.out.println("");
        System.out.print("2: ");
        for (int i = 0; i < arre2.length; i++) {
            System.out.print("[" + arre2[i] + "]");
        }
        System.out.println("");

        //Comparacion
        boolean iguales = true;
        for (int i = 0; i < arre1.length && iguales; i++) {
            if (arre1[i] != arre2[i]) {
                iguales = false;
            }
        }
        if (iguales) {
            System.out.println("Ambos arreglos son iguales");
        } else{
            System.out.println("Ambos arreglos no son iguales");
        }
    }

}
