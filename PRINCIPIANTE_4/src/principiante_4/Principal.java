package principiante_4;

public class Principal {

    static int[] lista;

    public static void main(String[] args) {

        int arre[] = new int[20];
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) (Math.random() * 20 + 1);
        }
        for (int i = 0; i < arre.length; i++) {
            System.out.print("[" + arre[i] + "]");
        }
        System.out.println("");
        lista = new int[arre.length];
        for (int i = 0; i < arre.length; i++) {
            int cont = 0;
            for (int j = 0; j < arre.length; j++) {
                if (arre[i] == arre[j]) {
                    cont++;
                    if (numero(arre[i])) {
                        lista[i] = arre[i];
                    }
                }
            }
            if (cont == 3) {
                System.out.println(lista[i]+" Se repite: "+cont);
            }
        }
    }

    static boolean numero(int num) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == num) {
                return false;
            }
        }
        return true;
    }

}
