package TD03.EX06;

public class main {

        public static void main(String[] args) {
            // Création d'un disque
            Disque disque = new Disque("Mon disque", 5, 3);
            System.out.println(disque);
            System.out.println(disque.getPerimeter());
            System.out.println(disque.getAire());

            // Création d'un rectangle
            Rectangle rectangle = new Rectangle("Mon rectangle", 4, 6);
            System.out.println(rectangle);
            System.out.println(rectangle.getPerimeter());
            System.out.println(rectangle.getAire());
        }
    }


