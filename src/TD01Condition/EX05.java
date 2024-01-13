package TD01Condition;
import java.util.Scanner;

public class EX05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez l'heure : ");
            int heure = scanner.nextInt();

            System.out.print("Choisissez la langue ('f' pour français, 'a' pour anglais) : ");
            char langue = scanner.next().charAt(0);

            String message;

            if (langue == 'f') {
                if (heure >= 0 && heure < 18) {
                    message = "Bonjour";
                } else if (heure >= 18 && heure <= 22) {
                    message = "Bonsoir";
                } else {
                    message = "Bonne nuit";
                }
            } else if (langue == 'a') {
                if (heure >= 0 && heure < 18) {
                    message = "Good Morning";
                } else if (heure >= 18 && heure <= 22) {
                    message = "Good Evening";
                } else {
                    message = "Good Night";
                }
            } else {
                System.out.println("Choix de langue invalide.");
                return;
            }

            System.out.println("Message : " + message);
        }
    }
