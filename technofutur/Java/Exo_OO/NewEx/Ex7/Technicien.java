package technofutur.Java.Exo_OO.NewEx.Ex7;

public class Technicien extends Personne {
    public Technicien(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void saluer() {
        System.out.printf("Bonjour je suis %s %s votre technicien", nom, prenom);
    }
}
