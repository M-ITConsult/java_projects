package technofutur.Java.Exo3;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //EXO2 Test

        //Création d'une banque
        Banque banque = new Banque();
        banque.setNom("TechnoBanque");

        //Création de personnes
        Personne client1 = new Personne("Bazin","Jérémy", LocalDate.of(1990,6,19));
        Personne client2 = new Personne("Miler","Jean-Christophe", LocalDate.of(1984,7,22));

        //Création de comptes
        Courant compte1 = new Courant("BE00001",1000,client1);
        Courant compte2 = new Courant("BE00002",500,client2);

        //Utilisation de la Méthode "ajouter" à la banque
        banque.ajouter(compte1);
        banque.ajouter(compte2);

        //Utilisation de la Méthode "depot"
        compte1.depot(500);
        compte2.depot(1500);


        //Utilisation de la Méthode "retrait"
        compte1.retrait(300);
        compte2.retrait(900);

        //Mise en forme et affichage des informations des comptes

        banque.getComptes().forEach((key,value)->{

            System.out.println(value.getTitulaire().getNom()+" "+value.getTitulaire().getPrenom()+"\n" +
                    "Compte : " + key+"\n" +
                    "Solde : " + value.getSolde() );

            System.out.println("\n---------------------\n");
        });

        // EXO 3 TEST

        // Ajout d'un compte
        Courant compte3 = new Courant("BE00003",200,client2);

        // Ajout du compte dans la banque
        banque.ajouter(compte3);
        System.out.print("Combien voulez-vous déposer: ");
        // Dépot sur le compte
        compte3.depot(sc.nextInt());

        double avoir = banque.avoirDesComptes(client2);

        System.out.println(avoir);

    }
}
