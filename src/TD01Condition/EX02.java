package TD01Condition;
import java.util.Scanner;

public class EX02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrez les valeurs de a, b et c pour l'équation ax^2 + bx + c = 0 :");

            System.out.print("a= ");
            double a = scanner.nextDouble();

            System.out.print("b= ");
            double b = scanner.nextDouble();

            System.out.print("c= ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (a == 0) {
                if (b != 0) {
                    double x = -c / b;
                    System.out.println("La solution unique est : x = " + x);
                } else if (c == 0) {
                    System.out.println("Tous les réels sont solutions de l'équation.");
                } else {
                    System.out.println("L'équation n'a pas de solution.");
                }
            } else if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Deux solutions réelles distinctes : x1 = " + x1 + " et x2 = " + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                System.out.println("Une solution réelle double : x = " + x);
            } else {
                System.out.println("L'équation n'a pas de solution réelle.");
            }
        }
    }

