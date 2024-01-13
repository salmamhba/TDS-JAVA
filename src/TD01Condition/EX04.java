package TD01Condition;
import java.util.Scanner;

public class EX04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez la moyenne de l'étudiant : ");
            double moyenne = scanner.nextDouble();

            String mention = "";

            if (moyenne >= 16) {
                mention = "Très Bien";
            } else if (moyenne >= 14) {
                mention = "Bien";
            } else if (moyenne >= 12) {
                mention = "Assez Bien";
            } else if (moyenne >= 10) {
                mention = "Passable";
            } else {
                mention = "Insuffisant";
            }

            System.out.println("La mention correspondante pour une moyenne de " + moyenne + " est : " + mention);
        }
    }


