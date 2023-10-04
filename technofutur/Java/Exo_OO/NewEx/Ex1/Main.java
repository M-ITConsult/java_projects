package technofutur.Java.Exo_OO.NewEx.Ex1;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Personne();

        personne1.setPrenom("Jean-Christophe");
        personne1.setNom("Miler");
        personne1.setDateNaiss(LocalDate.of(1984,7,22));

        personne1.sePresenter();


    }
}
