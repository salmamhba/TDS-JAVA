package TD01Condition;
import java.util.Scanner;

public class EX09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le premier nombre : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le deuxième nombre : ");
            int b = scanner.nextInt();

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            System.out.println("Les nombres dans l'ordre croissant sont : " + a + ", " + b);
        }
    }
