package TD01Condition;
import java.util.Scanner;

public class EX08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le numéro du mois  : ");
            int mois = scanner.nextInt();

            if (mois == 2) {
                System.out.print("Entrez une année  : ");
                int annee = scanner.nextInt();

                if (annee >= 1900 && annee <= 2100) {
                    if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                        System.out.println("Le mois 2 a 29 jours (année bissextile).");
                    } else {
                        System.out.println("Le mois 2 a 28 jours.");
                    }
                } else {
                    System.out.println("Année invalide.");
                }
            } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                System.out.println("Le mois " + mois + " a 30 jours.");
            } else if (mois >= 1 && mois <= 12) {
                System.out.println("Le mois " + mois + " a 31 jours.");
            } else {
                System.out.println("Numéro de mois invalide.");
            }
        }
    }




