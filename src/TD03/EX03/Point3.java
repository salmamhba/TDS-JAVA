package TD03.EX03;

public class Point3 {


    public Point3(int x, int y) {
    }

    public void Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord()
    { System.out.println("Coordonnees : " + x + " " + y);
    }
    public void affiche()
    { System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

    public static class Centre extends Point3 {

            String Nom ;
            public Centre(int x, int y , String Nom) {

                super(x, y);
                this.Nom=Nom;
            }

            public String getNom() {
                return Nom;
            }

            public void affNom(){
                System.out.println(" Nom : "+this.getNom());
            }

            public void affiche() {
                System.out.println("Centre{" +
                        "Nom='" + Nom + '\'' +
                        " X = " +this.getX()+
                        " y = " +this.getY()+'}');
            }
        }

    public static class Cercle extends Point3 {

        private final String nom;
        int Rayon;
            public Cercle(int x , int y , String nom , int Rayon ){
                super (x , y );
                this.Rayon=Rayon;
                this.nom=nom;
            }
            public void perimetre(int Rayon){

                System.out.println("le perimetre");
            }
        }
}
