package QuintoEjercicio;
import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra = "";
        String palabraInvertida = "";
        System.out.print("Inserta una palabra: ");
        palabra = teclado.nextLine();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        if (palabra.equals(palabraInvertida)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}
