package technofutur.Java.Exo_OO.NewEx.Ex6;

public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Captain", "America");
        personne1.saluer();

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
