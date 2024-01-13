package TD02.EX03;

public class main {
    public static void main(String[] args) {
        Livre L2=new Livre();
        Livre L1=new Livre("it ends with us","collen hover",23.5,2021);
        Livre L4=new Livre("salma");
        Livre L5=new Livre("see","ismo");
        Livre L6=new Livre("ugly love","collen hover",25.3);
        Livre L7=new Livre("sad","ahmed",33.9,2016);
        Livre L8=new Livre(L1);

        System.out.println("Livre 1 : " + L1.toString());
        System.out.println("Livre 2 : " + L2.toString());
        System.out.println("Livre 3 : " + L4.toString());
        System.out.println("Livre 4 : " + L5.toString());
        System.out.println("Livre 5 : " + L6.toString());

        // Modification des attributs
        L1.settitre("Nouveau Titre");
        L2.setauteur("Douglas Adams");
        L4.setprix(12.99);
        L4.setannee(1954);

        System.out.println("\\nAprès modification :");
        System.out.println("Livre 1 : " + L1.toString());
        System.out.println("Livre 2 : " + L2.toString());
        System.out.println("Livre 3 : " + L4.toString());
        System.out.println("Livre 4 : " + L5.toString());
        System.out.println("Livre 5 : " + L6.toString());
    }

}


