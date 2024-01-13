package TD01Condition;
import java.util.Scanner;

public class EX06 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez la valeur de A : ");
            int A = scanner.nextInt();

            System.out.print("Entrez la valeur de B : ");
            int B = scanner.nextInt();

            int produit;

            if (A > 0 && B > 0 || A < 0 && B < 0) {
                produit = 1;
            } else if (A == 0 || B == 0) {
                produit = 0;
            } else {
                produit = -1;
            }

            if (produit == 1) {
                System.out.println("Le produit de A et B est positif ");
            } else if (produit == -1) {
                System.out.println("Le produit de A et B est négatif ");
            } else {
                System.out.println("Le produit de A et B est nul ");
            }
        }
    }

