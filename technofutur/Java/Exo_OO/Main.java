package technofutur.Java.Exo_OO;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Banque banque1 = new Banque("BNP");

        Personne personne1 = new Personne("Miler", "Jean-Christophe",LocalDate.of(1984,7,22));
        Courant compte1 = new Courant("",0.0,0.0,personne1);


        System.out.printf("voici votre compte en détail: %s\n%s\n%s\n de la banque: %s\n Nom: %s\n Prénom: %s\n Date de naissance: %s",
                compte1.getNumero(),compte1.getSolde(),compte1.getLigneDeCredit(),
                banque1.getName(),
                personne1.getNom(),
                personne1.getPrenom(),
                personne1.getDatenaissance());


    }
}
