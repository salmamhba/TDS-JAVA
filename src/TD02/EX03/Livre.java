package TD02.EX03;

public class Livre {
        String titre;
        String auteur;
        double prix;
        int annee;
        public Livre(){
            this.titre="no titre";
            this.auteur="no auteur";
            this.prix=0.0;
            this.annee=0;
        }
        public Livre(String titre){
            this.titre=titre;
        }
        public Livre(String titre,String auteur){
            this.titre=titre;
            this.auteur=auteur;
        }
        public Livre(String titre,String auteur,double prix){
            this.titre=titre;
            this.auteur=auteur;
            this.prix=prix;
        }
        public Livre(String titre,String auteur,double prix,int annee){
            this.titre=titre;
            this.auteur=auteur;
            this.prix=prix;
            this.annee=annee;
        }
        public Livre(Livre L1){
            this.titre=L1.titre;
            this.auteur=L1.auteur;
            this.prix=L1.prix;
            this.annee=L1.annee;
        }
        public String gettitre(){
            return titre;
        }
        public void settitre(String titre){
            this.titre=titre;
        }
        public String getauteur(){
            return auteur;
        }
        public void setauteur(String auteur){
            this.auteur=auteur;

        }
        public double getprix(){
            return prix;
        }
        public void setprix(double prix){
            this.prix=prix;


        }
        public double getannee(){
            return annee;
        }
        public void setannee(int annee){
            this.annee=annee;


        }

        @Override
        public String toString() {
            return "Livre{" + "titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", annee=" + annee + '}';
        }
    }
