package TD02.EX02;

public class main {
    public static void main(String[] args) {
        TD02.EX02.Point p1=new TD02.EX02.Point(2.3,9);
        TD02.EX02.Point p2=new TD02.EX02.Point();

        p1.afficher();
        p2.afficher();

        double Norme=p1.Norme();
        System.out.println("la norme " +Norme);

    }
}

