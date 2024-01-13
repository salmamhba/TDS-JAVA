package TD03.EX05;

public class main {
        public static void main(String[] args) {

            Vehicule vehicule = new Vehicule(10);
            System.out.println("Véhicule : " + vehicule);


            Moto moto = new Moto(2, 2);
            System.out.println("Moto : " + moto);


            Avion avion = new Avion(100, 4);
            System.out.println("Avion : " + avion);


            Triporteur triporteur = new Triporteur(1, 3, 1);
            System.out.println("Triporteur : " + triporteur);
        }
    }


