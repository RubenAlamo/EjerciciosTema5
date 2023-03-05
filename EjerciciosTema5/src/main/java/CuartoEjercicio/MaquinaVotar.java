package CuartoEjercicio;
import java.util.ArrayList;
import java.util.Scanner;
public class MaquinaVotar {
    public static void main(String[] args) {
        int voto = 0;
        final int VOTO = 1;
        ArrayList<Integer> votosEmilia = new ArrayList<Integer>();
        ArrayList<Integer> votosGerardo = new ArrayList<Integer>();
        ArrayList<Integer> votosMaria = new ArrayList<Integer>();
        ArrayList<Integer> votosNadia = new ArrayList<Integer>();
        ArrayList<Integer> votosTotal = new ArrayList<Integer>();
        double porcentajeEmilia = 0;
        double porcentajeGerardo = 0;
        double porcentajeMaria = 0;
        double porcentajeNadia = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Inserta tu voto: ");
            System.out.println("1. Emilia TERREROS");
            System.out.println("2. Gerardo ESCODAR");
            System.out.println("3. Maria AGUAVIVA");
            System.out.println("4. Nadia LETUX");
            voto = teclado.nextInt();

            if ( voto == 1) {
                votosEmilia.add(VOTO);
                votosTotal.add(VOTO);
                System.out.println("Ha votado");
            } else if ( voto == 2) {
                votosGerardo.add(VOTO);
                votosTotal.add(VOTO);
                System.out.println("Ha votado");
            } else if (voto == 3) {
                votosMaria.add(VOTO);
                votosTotal.add(VOTO);
                System.out.println("Ha votado");
            } else if (voto == 4) {
                votosNadia.add(VOTO);
                votosTotal.add(VOTO);
                System.out.println("Ha votado");
            } else {
                System.out.println("Voto no valido");
            }
        } while (voto != 68753421);
        for (int i = 0; i < votosEmilia.size(); i++) {
            porcentajeEmilia += votosEmilia.get(i) / votosTotal.size();
        }
        for (int i = 0; i < votosGerardo.size(); i++) {
            porcentajeGerardo += votosGerardo.get(i) / votosTotal.size() ;
        }
        for (int i = 0; i < votosMaria.size(); i++) {
            porcentajeMaria += votosMaria.get(i) / votosTotal.size();
        }
        for (int i = 0; i < votosNadia.size(); i++) {
            porcentajeNadia += votosNadia.get(i) / votosTotal.size();
        }
        System.out.println("resultados: " );
        System.out.println("Emilia TERREROS: " + porcentajeEmilia + " %");
        System.out.println("Gerardo ESCODAR: " + porcentajeGerardo + " %");
        System.out.println("Maria AGUAVIVA: " + porcentajeMaria + " %");
        System.out.println("Nadia LETUX: " + porcentajeNadia + " %");
    }
}

