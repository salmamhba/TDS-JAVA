package TD01Boucles;
import java.util.Scanner;

public class EX04 {
    public static int calculerPGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le premier entier positif non nul : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le deuxième entier positif non nul : ");
            int b = scanner.nextInt();

            int pgcd = calculerPGCD(a, b);
            System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
        }
    }


