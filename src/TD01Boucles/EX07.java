package TD01Boucles;
import java.util.Scanner;

public class EX07 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le nombre de lignes : ");
            int nombreLignes = scanner.nextInt();

            for (int i = 1; i <= nombreLignes; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
