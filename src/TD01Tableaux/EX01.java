package TD01Tableaux;
import java.util.Scanner;

public class EX01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez la taille du tableau : ");
            int taille = scanner.nextInt();

            if (taille < 10 || taille > 50) {
                System.out.println("Taille invalide. Veuillez entrer une taille entre 10 et 50.");
            }

            int[] tableau = new int[taille];

            // Remplir le tableau avec les valeurs saisies par l'utilisateur
            for (int i = 0; i < taille; i++) {
                System.out.print("Entrez l'élément " + (i + 1) + " : ");
                tableau[i] = scanner.nextInt();
            }

            // Trouver la valeur maximale et minimale dans le tableau
            int max = tableau[0];
            int min = tableau[0];

            for (int i = 1; i < taille; i++) {
                if (tableau[i] > max) {
                    max = tableau[i];
                }
                if (tableau[i] < min) {
                    min = tableau[i];
                }
            }

            System.out.println("La valeur maximale dans le tableau est : " + max);
            System.out.println("La valeur minimale dans le tableau est : " + min);
        }
    }



