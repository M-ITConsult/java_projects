package technofutur.Java.Exo_OO.NewEx.Ex1;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Personne();

        personne1.setPrenom("Thor");
        personne1.setNom("Avengers");
        personne1.setDateNaiss(LocalDate.of(1000,11,11));

        personne1.sePresenter();


    }
}
