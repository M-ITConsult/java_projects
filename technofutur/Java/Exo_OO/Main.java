package technofutur.Java.Exo_OO;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banque banque1 = new Banque("BNP");

        Personne personne1 = new Personne("Test","test1","12/07/2021");
        Courant compte1 = new Courant("",0.0,0.0,personne1);


//        System.out.printf("voici votre compte en détail: %s\n%s\n%s\n de la banque: %s\n Nom: %s\n Prénom: %s\n Date de naissance: %s",
//                compte1.getNumero(),compte1.getSolde(),compte1.getLigneDeCredit(),
//                banque1.getName(),
//                personne1.getNom(),
//                personne1.getPrenom(),
//                personne1.getDatenaissance());


        // Nom de la banque
        System.out.print("Entrez le nom de la banque: ");
        String nomBanque = sc.nextLine();
        // Création d'un compte courant
        System.out.print("Entrez le numéro du compte: " );
        String numero = sc.nextLine();

        System.out.print("Entrez le solde: ");
        double solde = sc.nextDouble();

        System.out.print("Entrez la ligne de crédit: ");
        double lignecredit = sc.nextDouble();

        sc.nextLine(); // Consomme le retour à la ligne

        // Création d'une personne
        System.out.print("Entrez le nom du titulaire: ");
        String nom = sc.nextLine();

        System.out.print("Entrez le prénom du titulaire: ");
        String prenom = sc.nextLine();

        System.out.print("Entrez la date de naissance: dd/mm/yyyy ");
        String dateNaissanceStr = sc.nextLine();

        Banque banque2 = new Banque(nomBanque);

        Personne titulaire = new Personne(nom,prenom,dateNaissanceStr);

        Courant compte2 = new Courant(numero, solde,lignecredit,titulaire);

        System.out.printf("Nom de la banque: %s%n" +
                        "Numéro de compte: %s%n" +
                        "Solde: %.2f€%n" +
                        "Ligne de crédit: %.2f€%n" +
                        "Nom du titulaire: %s%n" +
                        "Prénom du titulaire: %s%n" +
                        "Date de naissance du titulaire: %s",
                banque2.getName(),
                compte2.getNumero(),
                compte2.getSolde(),
                compte2.getLigneDeCredit(),
                titulaire.getNom(),
                titulaire.getPrenom(),
                titulaire.getDatenaissance());
    }
}
