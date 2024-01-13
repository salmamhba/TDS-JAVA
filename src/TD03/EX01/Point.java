package TD03.EX01;

public class Point {
    public void PointE(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void deplace(int dx,int dy){
        x=+dx;
        y=+dy;

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    private int x;
    private int y;

    static class PointA extends Point {
        void affiche()
        { System.out.println ("Coordonnees : " + getX() + " " + getY()) ;}
        }
}


