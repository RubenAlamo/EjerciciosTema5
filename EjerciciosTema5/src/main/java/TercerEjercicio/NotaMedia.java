package TercerEjercicio;
import java.util.ArrayList;
import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<Double>();
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        do {
            System.out.print("Inserta tu nota o -1 para terminar: ");
            nota = teclado.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notas.add(nota);
                System.out.print("Otro valor, por favor o -1 para terminar: ");
            }
        } while (nota != -1);
        for (int i = 0; i < notas.size(); i++) {
            media += notas.get(i) / notas.size();
        }
        System.out.println("la media de las notas es: " + notas + media);
    }
}
