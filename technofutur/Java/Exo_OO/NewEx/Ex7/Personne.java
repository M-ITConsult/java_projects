package technofutur.Java.Exo_OO.NewEx.Ex7;

public abstract class Personne {

    String nom;
    String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract void saluer();

    }
