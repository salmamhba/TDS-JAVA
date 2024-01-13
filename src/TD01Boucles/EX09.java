package TD01Boucles;
import java.util.Scanner;

public class EX09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez un nombre entier : ");
            int nombre = scanner.nextInt();

            int somme = 0;
            int chiffre;

            while (nombre != 0) {
                chiffre = nombre % 10;
                somme += chiffre;
                nombre /= 10;
            }

            System.out.println("La somme des chiffres du nombre est : " + somme);
        }
    }



