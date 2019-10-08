
public class FEnElChat {

    static int[] contador;

    static boolean numero(int num) {
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] == num) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arre[] = new int[15];
        contador = new int[arre.length];

        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.print("[");
        for (int i = 0; i < arre.length; i++) {
            if ((i + 1) == arre.length) {
                System.out.println(arre[i] + "]");
            } else {
                System.out.print(arre[i] + ",");
            }
        }
        for (int i = 0; i < arre.length; i++) {
            int cont = 0;
            for (int j = 0; j < arre.length; j++) {
                if (arre[i] == arre[j]) {
                    cont++;
                    if (numero(arre[i])) {
                        contador[i] = arre[i];
                    }
                }
            }
            if (contador[i] != 0) {
                System.out.println("[" + arre[i] + "] [" + cont + "]");
            }
        }
    }

}
