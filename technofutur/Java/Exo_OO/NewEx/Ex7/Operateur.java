package technofutur.Java.Exo_OO.NewEx.Ex7;

public class Operateur extends Technicien {
    public Operateur(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void saluer() {
        System.out.printf("%s %s bonjour, comment puis-je vous aider?", nom, prenom);
    }
}
