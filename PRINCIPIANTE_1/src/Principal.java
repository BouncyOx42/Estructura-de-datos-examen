
public class Principal {

    public static void main(String[] args) {
        int aRandom[] = new int[15];
        int p;
        for (int i = 0; i < aRandom.length; i++) {
            while (aRandom[i] == 0) {
                p = (int) (Math.random() * 100) + 1;
                if (p % 2 == 0) {
                    aRandom[i] = p;
                }
            }
        }
        for (int i = 0; i < aRandom.length; i++) {
            for (int j = 0; j < aRandom.length; j++) {
                if (aRandom[i] == aRandom[j]) {
                    p = (int) (Math.random() * 100) + 1;
                    if ((p % 2 == 0)) {
                        aRandom[i] = p;
                    }
                }
            }
        }
        for (int i = 0; i < aRandom.length; i++) {

            System.out.print("[" + aRandom[i] + "]");
        }
    }
}
