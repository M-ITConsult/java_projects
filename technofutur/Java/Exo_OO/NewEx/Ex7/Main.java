package technofutur.Java.Exo_OO.NewEx.Ex7;

public class Main {
    public static void main(String[] args) {
       Personne personne = new Personne("Captain","America") {
           @Override
           public void saluer() {
               System.out.printf("Bonjour à tous! Je suis %s %s%n", nom, prenom);
           }
       };

        personne.saluer();

        System.out.println();

        Technicien technicien = new Technicien("Reporter","Tintin");
        technicien.saluer();

        System.out.println();

        Operateur operateur = new Operateur("Capitaine", "Hadock");
        operateur.saluer();

        System.out.println();


        Employee employee = new Employee("Professeur","Tournesol");
        employee.saluer();


    }
}
