package TD01Boucles;
import java.util.Scanner;

public class EX02 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int n;
            System.out.println("entrer un nombre n");
            n=in.nextInt();
            int sum=0;

            for(int i=0;i<n;i++){
                if(i%2!=0)
                    sum+=i;


            }
            System.out.println("la somme est "+sum);
        }


    }
