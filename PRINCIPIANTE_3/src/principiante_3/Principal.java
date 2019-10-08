package principiante_3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int arre1[] = new int[10];
        int arre2[] = new int[10];
        Scanner a = new Scanner(System.in);

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

        int cont = 0;
        for (int i = 0; i < arre1.length; i++) {
            for (int j = 0; j < arre1.length; j++) {
                if (arre1[i] == arre2[j]) {
                    cont++;
                }
            }
        }
        if (cont == arre1.length) {
            System.out.println("son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }

}
