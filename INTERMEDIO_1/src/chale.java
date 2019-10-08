
import java.util.Scanner;


public class chale {

    
    public static void main(String[] args) {
        Scanner cap=new Scanner(System.in);
        int arre[]=new int[15];
        for (int i = 0; i < arre.length; i++) {
            System.out.println("Ingrese un numero");
            arre[i] =cap.nextInt();
            for (int j = (arre.length-1); j >= 0; j--) {
                if (arre[j]==0) {
                    System.out.print("[]");
                }else{
                System.out.print("["+arre[j]+"]");
                
                }
            }
            System.out.println("");
            cap.nextLine();
        }
    }
    
}
