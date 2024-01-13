package TD03.EX03;

public class main {

        public static void main(String[] args) {
            Point3 point = new Point3(2,9);
            Point3.Centre centre = new Point3.Centre(2 , 3 , "o");
            Point3.Cercle cercle = new Point3.Cercle(2 , 3 , "c" , 3);
            point.affCoord();
            centre.affCoord();
            centre.affNom();
        }
    }

