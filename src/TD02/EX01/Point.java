package TD02.EX01;

public class Point {

        private char nom;
        private double abscisse;

        public Point(char nom,double abscisse){
            this.nom = nom;
            this.abscisse = abscisse;
        }
        public char getNom(){
            return nom;

        }
        public void setNom(char nom){
            this.nom = nom;
        }
        public double getAbscisse(){
            return abscisse;
        }
        public void setAbscisse(double abscisse){
            this.abscisse=abscisse;
        }
        public void afficher(){
            System.out.println("Nom " + nom );
            System.out.println("Abscisse "+ abscisse);
        }

    public void translate(double translationValue) {

        abscisse += translationValue;
    }
}





