package TD02.EX06;

public class main {
    public static void main(String[] args) {
        Banque compte = new Banque(1, 5000.75f, "AB1200");
        System.out.println(compte.avoirInf());
        System.out.println("Solde : " + compte.avoirSolde());
        compte.deposer(500);
        System.out.println(compte.avoirInf());
        System.out.println("Solde : " + compte.avoirSolde());
        compte.retirer(200);
        System.out.println(compte.avoirInf());
        System.out.println("Solde : " + compte.avoirSolde());
    }
}
