package TD03.EX02;

public class Point9 {
    public void Point(int x, int y) {
        this.x = x; this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx; y += dy;
    }
    public void affCoord() { System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;

    static class PointNom extends Point9 {

   private char nom;
       public void setPointNom(int x, int y, char nom){
           Point(x,y);
           this.nom=nom;
       }
       public void setNom(char nom){
           this.nom=nom;

       }
       public void affCoordNom(){
           System.out.println("Point de nom " +nom+" ");
           affCoord();
       }

   }
}

