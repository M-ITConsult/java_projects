package technofutur.Java;
import java.util.Scanner;
public class Instruction_Base_Ex_1_TVA {

        public static void main(String[] args) {
            final double TAUX_TVA = 21;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez entrez le prix HTVA: ");
            double prixHTVA = scanner.nextDouble();
            double prixTVAC = prixHTVA * (1 + (TAUX_TVA / 100));
            // Format du System.out avec System.out.printf %.2f pour deux chiffres après la virgule>
            System.out.printf("Prix HTVA: %.2f€\nTVA: %.2f%%\nTotal TVAC: %.2f€%n",prixHTVA, TAUX_TVA, prixTVAC);

            // Format du System.out sans System.out.printf >
//            System.out.println("Le prix HTVA est de " + prixHTVA +"€");
//            System.out.println("la TVA est de " + TAUX_TVA +"%");
//            System.out.println("Voici le prix TVAC " + prixTVAC+"€");

            scanner.close();
        }
    }
