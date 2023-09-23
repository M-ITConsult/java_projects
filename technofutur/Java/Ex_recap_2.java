package technofutur.Java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Produit {
    String nom;
    double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

}

public class Ex_recap_2 {
    private static String choice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> produitsAchats = new ArrayList<>();
        Map<Integer, Produit> tableDesProduits = new HashMap<>();

        double[] tabArticle = new double[21];
        tabArticle[1]=0.95;
        tabArticle[2]=4.99;
        tabArticle[3]=5.81;
        tabArticle[4]=17.52;
        tabArticle[5]=6.49;
        tabArticle[6]=10.25;
        tabArticle[7]=1.19;
        tabArticle[8]=2.36;
        tabArticle[9]=14.05;
        tabArticle[10]=16;
        tabArticle[11]=2.99;
        tabArticle[12]=6.75;
        tabArticle[13]=6.45;
        tabArticle[14]=78.12;
        tabArticle[15]=4.55;
        tabArticle[16]=4.95;
        tabArticle[17]=6.96;
        tabArticle[18]=1.70;
        tabArticle[19]=6.96;
        tabArticle[20]=5.96;

        // Initialisation de la table des produits (numéro du produit, produit)
        for (int i = 1; i <= 20; i++) {
            tableDesProduits.put(i, new Produit("Produit " + i, tabArticle[i]));
        }

        double sommeTotale = 0.0;
    do {
        while (true) {
            System.out.print("Entrez le numéro de l'article (ou -1 annulé le dernier article) (-2 pour terminer) : ");
            int numeroProduit = scanner.nextInt();

            if (numeroProduit == -1) {
                continue;
            }

            if (numeroProduit == -2) {
                break;
            }

            if (!tableDesProduits.containsKey(numeroProduit)) {
                System.out.println("Produit inexistant. Veuillez réessayer.");
                continue;
            }

            produitsAchats.add(numeroProduit);
            double prixProduit = tableDesProduits.get(numeroProduit).prix;
            sommeTotale += prixProduit;
        }

        System.out.println("Produits achetés : ");
        for (int numeroProduit : produitsAchats) {
            Produit produit = tableDesProduits.get(numeroProduit);
            System.out.println(produit.nom + " - " + produit.prix);
        }
        System.out.println("Somme totale à payer : " + String.format("%.2f", sommeTotale) + "€");

        // Annulation du dernier article encodé
        if (!produitsAchats.isEmpty()) {
            int dernierProduit = produitsAchats.get(produitsAchats.size() - 1);
            double prixDernierProduit = tableDesProduits.get(dernierProduit).prix;
            sommeTotale -= prixDernierProduit;
            produitsAchats.remove(produitsAchats.size() - 1);
            System.out.println("Dernier article annulé.");
        }

        // Encodage du montant donné par le client
        System.out.print("Montant donné par le client : ");
        double montantDonne = scanner.nextFloat();

        double rendu = montantDonne - sommeTotale;
        System.out.println("Montant à rendre : " + String.format("%.2f", rendu) + "€");

        System.out.print("Avez-vous un autre client? (y/n): ");
        choice = scanner.next();
    } while (choice.equalsIgnoreCase("y"));

        // Fin de journée - chiffre d'affaires et nombre de clients
        double chiffreAffaireTotal = 0.0;
        int nombreClients = produitsAchats.size();

        for (int numeroProduit : produitsAchats) {
            chiffreAffaireTotal += tableDesProduits.get(numeroProduit).prix;
        }

        // Utilisation de DecimalFormat pour formater le chiffre d'affaires
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String chiffreAffaireFormate = decimalFormat.format(chiffreAffaireTotal);

        System.out.printf("Chiffre d'affaire total de la journée : %s€\n", chiffreAffaireFormate);
        System.out.printf("Nombre de clients passés : %s", nombreClients);
        
        scanner.close();
    }
}
