package TD02.EX02;

public class Point {
        private double abscisse;
        private double ordonnees;
        //conducteur par defaut
        public Point(){
            this.abscisse=0.0;
            this.ordonnees=0.0;
        }
        // initialisation conducteur
        public Point(double abscisse,double ordonnees){
            this.abscisse=abscisse;
            this.ordonnees=ordonnees;
        }
        public double getAbscisse(){
            return abscisse;
        }
        public void setAbscisse(double abscisse){
            this.abscisse=abscisse;
        }
        public double getOrdonnees(){
            return ordonnees;
        }
        public void setOrdonnees(double ordonnees){
            this.ordonnees=ordonnees;
        }
        public double Norme(){
            return Math.sqrt(abscisse*abscisse+ordonnees*ordonnees);
        }
        public void afficher(){
            System.out.println("abscisse " +abscisse);
            System.out.println("ordonnees " +ordonnees);
        }
    }



