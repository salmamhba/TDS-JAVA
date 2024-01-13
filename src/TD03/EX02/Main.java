package TD03.EX02;

public class Main {
    public static void main(String[] args) {
        Point9 p2 = new Point9();
        p2.Point(2, 9);
        p2.affCoord();
        Point9.PointNom po = new Point9.PointNom();
        po.setPointNom(1, 7, 'e');
        po.affCoordNom();
        po.deplace(9, 8);
        po.affCoordNom();
    }
}