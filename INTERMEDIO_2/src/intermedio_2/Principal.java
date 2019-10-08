package intermedio_2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int arre[] = new int[15];
        
        System.out.println("Impresion del arreglo");
        
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arre.length; i++) {
            System.out.print("["+arre[i]+"]");
        }
        System.out.println("");
        System.out.print("Ingresa el numero que quieres eliminar: ");
        int datoEliminar = a.nextInt();
        int posicionEliminar = 0;
        for (int i = 0; i < arre.length; i++) {
            if (datoEliminar==arre[i]) {
                posicionEliminar = i;
                arre[i] = 0;
            }
        }
        if (posicionEliminar>=0) {
            System.out.println("El dato en la posicion "+(posicionEliminar+1)+" se elimino con exito");
            
        } else{
            System.out.println("El dato no se encontró");
        }
        for (int i = 0; i < arre.length; i++) {
            System.out.print("["+arre[i]+"]");
        }
    }

}
