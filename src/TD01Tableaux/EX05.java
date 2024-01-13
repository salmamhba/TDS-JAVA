package TD01Tableaux;

public class EX05 {

        public static void main(String[] args) {
            char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};
            int taille = tableau.length;

            System.out.print("Tableau initial : ");
            for (char element : tableau) {
                System.out.print(element + " ");
            }
            System.out.println();


            char premierElement = tableau[0];
            for (int i = 1; i < taille; i++) {
                tableau[i - 1] = tableau[i];
            }
            tableau[taille - 1] = premierElement;

            System.out.print("Tableau modifié : ");
            for (char element : tableau) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }



