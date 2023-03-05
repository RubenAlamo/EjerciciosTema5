package SextoEjercicio;
public class QueHace {
    public static void main(String[] args) {
        final int TAMAÑO = 3;
        int[][] tab = new int[TAMAÑO][TAMAÑO];
        int val = 1;

        for (int j = 0; j < TAMAÑO; j++) {
            for (int i = 0; i < TAMAÑO; i++) {
                tab[j][i] = val;
                val++;
            }
        }

        for (int j = 0; j < TAMAÑO; j++) {
            for (int i = 0; i < TAMAÑO; i++) {
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        }
    }
}
