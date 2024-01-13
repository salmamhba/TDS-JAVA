package TD03.EX04;

public class main {
    public static void main(String[] args) {
        Batiment b = new Batiment();
        Maison m = new Maison("Rabat ",5);
        Immeuble i = new Immeuble("EL kelaa" , 10);
        System.out.println(b.toString());
        System.out.println(m.toString());
        System.out.println(i.toString());
        b.setAdresse("safi");
        System.out.println(b.toString());
        m.setAdresse("essaouira");
        System.out.println(m.toString());
        i.setAdresse("khouribgha");
        System.out.println(i.toString());
    }
}
