package PrimerEjercicio;
public class DespegueInmediato {

    public static void main(String[] args) {
        int[] tablaCuenta = new int[11];
        for (int i = 0; i < tablaCuenta.length; i++) {
            tablaCuenta[i] = 10 - i;
        }
        for (int i = 0; i < tablaCuenta.length; i++) {
            System.out.println(tablaCuenta[i]);
        }
    }
}
