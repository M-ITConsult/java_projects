package technofutur.Java.Exo_OO.NewEx.Ex7;

public class Employee extends Personne {
    public Employee(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void saluer() {
        System.out.printf("Bonjour à tous! Je suis %s %s%n", nom, prenom);
    }
}
