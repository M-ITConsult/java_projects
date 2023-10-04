package technofutur.Java.Exo_OO.NewEx.Ex6;

public class Personne {

    String nom;
    String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    void saluer(){
        System.out.printf("Bonjour à tous! Je suis %s %s ", nom, prenom);
    }
}
