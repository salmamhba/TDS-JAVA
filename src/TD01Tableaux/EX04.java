package TD01Tableaux;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez la taille des matrices carrées  : ");
            int taille = scanner.nextInt();

            double[][] matrice1 = new double[taille][taille];
            double[][] matrice2 = new double[taille][taille];
            double[][] sommeMatrices = new double[taille][taille];

            System.out.println("Saisie de la première matrice : ");
            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    System.out.print("Entrez l'élément [" + (i + 1) + "][" + (j + 1) + "] : ");
                    matrice1[i][j] = scanner.nextDouble();
                }
            }

            System.out.println("Saisie de la deuxième matrice : ");
            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    System.out.print("Entrez l'élément [" + (i + 1) + "][" + (j + 1) + "] : ");
                    matrice2[i][j] = scanner.nextDouble();
                }
            }

            System.out.println("La somme des deux matrices est : ");
            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    sommeMatrices[i][j] = matrice1[i][j] + matrice2[i][j];
                    System.out.print(sommeMatrices[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

