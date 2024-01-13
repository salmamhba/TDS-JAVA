package TD02.Ex05;

public class Rectangle {
        private double longeur;
        private double largeur;
        public Rectangle(){}
        public Rectangle(double longeur,double largeur){
            this.largeur=largeur;
            this.longeur=longeur;}
        public Rectangle(Rectangle R){
            this.largeur=R.getLargeur();
            this.longeur=R.getLongeur();}
        public double getLongeur() {
            return longeur;}
        public void setLongeur(double l) {
            this.longeur = l > 0 ? l : 0;}
        public double getLargeur() {
            return largeur;}
        public void setLargeur(double l) {
            this.largeur = l > 0 ? l : 0;}
        public double calPerimetre(){
            return 2*(this.largeur+this.longeur);}
        public double calAire(){
            return this.largeur*this.longeur;}
        // v1
        public boolean isCarre(){
            if(this.longeur==this.largeur)
                return true;
            else
                return false;}
        // v2

        @Override
        public String toString() {
            return "Rectangle{" +
                    "longeur=" + longeur +
                    ", largeur=" + largeur +
                    '}';}
    }

