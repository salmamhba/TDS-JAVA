package TD01Tableaux;
import java.util.Scanner;

public class EX03 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le nombre d'étudiants : ");
            int nombreEtudiants = scanner.nextInt();

            double[] moyennes = new double[nombreEtudiants];

            // Saisie des moyennes des étudiants
            for (int i = 0; i < nombreEtudiants; i++) {
                System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
                moyennes[i] = scanner.nextDouble();
            }

            System.out.print("Entrez le seuil de moyenne : ");
            double seuil = scanner.nextDouble();

            int nombreSupSeuil = 0;

            // Compter le nombre d'étudiants avec une moyenne supérieure ou égale au seuil
            for (double moyenne : moyennes) {
                if (moyenne >= seuil) {
                    nombreSupSeuil++;
                }
            }

            System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil est : " + nombreSupSeuil);
        }
    }



