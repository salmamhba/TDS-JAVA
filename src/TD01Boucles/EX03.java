package TD01Boucles;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

            int max = Integer.MIN_VALUE, n, p = 0, j = 1;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("un  nombre:");
                n = scanner.nextInt();
                if (n > max) {
                    max = n;
                    p = j;

                }
                j++;
            } while (n != 0);


//        for (int i = 1; i <= 20; i++) {
//            n = scanner.nextInt();
//            if (n>max) {
//                max = n;
//                p =i;
//            }
//        }
            System.out.println("Max = " + max + " P = " + p);

        }
    }



