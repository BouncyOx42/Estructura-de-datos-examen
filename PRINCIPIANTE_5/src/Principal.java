
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int aRandom[] = new int[15];
     int p;
        for (int i = 0; i < aRandom.length; i++) {
        if(i%2==0){
        while(aRandom[i]==0){
        p = (int)(Math.random() * 100 ) + 1;
        if(p%2==0)
        aRandom[i]=p;
      
             }
         }
        else
            aRandom[i] = (int)(Math.random() *100 ) + 1;
        }
        for (int i = 0; i < aRandom.length; i++) {
            System.out.print("[" + aRandom[i] + "]");
            
            
        }
    }
}
