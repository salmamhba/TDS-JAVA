package TD01Condition;
import java.util.Scanner;

public class EX07 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez un entier de trois chiffres non nuls : ");
            int N = scanner.nextInt();

            if (N < 100 || N > 999) {
                System.out.println("Veuillez saisir un entier de trois chiffres non nuls.");
                return;
            }

            int chiffre1 = N / 100;
            int chiffre2 = (N / 10) % 10;
            int chiffre3 = N % 10;

            System.out.println("Les nombres qui peuvent être formés par les chiffres de " + N + " sont :");

            System.out.println(chiffre1 + "" + chiffre2 + "" + chiffre3);
            System.out.println(chiffre1 + "" + chiffre3 + "" + chiffre2);
            System.out.println(chiffre2 + "" + chiffre1 + "" + chiffre3);
            System.out.println(chiffre2 + "" + chiffre3 + "" + chiffre1);
            System.out.println(chiffre3 + "" + chiffre1 + "" + chiffre2);
            System.out.println(chiffre3 + "" + chiffre2 + "" + chiffre1);
        }
    }


