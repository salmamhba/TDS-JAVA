package TD01Condition;

import java.util.Scanner;

public class EX01 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int num;
            int max = Integer.MIN_VALUE;

            for(int i=0;i<3;i++){
                System.out.println(" entrer un nombre");
                num=in.nextInt();

                if(num>max)
                    max=num;

            }
            System.out.println("le max est " +max);

        }

    }


