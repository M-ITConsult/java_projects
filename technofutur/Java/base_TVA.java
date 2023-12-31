package technofutur.Java;
import java.util.Scanner;
public class base_TVA {
    static final private Scanner sc = new Scanner(System.in);
        public static void calculTVA6() {
        final double TAUX_TVA6 = 6;
        String autresCalcul;

        do {
            System.out.print("Veuillez entrez le prix HTVA: ");
            double prixHTVA = sc.nextDouble();
            double prixTVAC = prixHTVA * (1 + (TAUX_TVA6 / 100));
            double prixTVA = prixHTVA * TAUX_TVA6 / 100;
            // Format du System.out avec System.out.printf %.2f pour deux chiffres après la virgule>
            System.out.printf("Prix HTVA: %.2f€\nTVA: %.2f%%\nTVA: %.2f€\nTotal TVAC: %.2f€%n", prixHTVA, TAUX_TVA6, prixTVA, prixTVAC);

            System.out.print("Autre calcul? y/n ");
            autresCalcul = sc.next();
        } while(autresCalcul.equalsIgnoreCase("y"));
    }
        public static void calculTVA21() {
            final double TAUX_TVA21 = 21;
            String autresCalcul;

            do {
                System.out.print("Veuillez entrez le prix HTVA: ");
                double prixHTVA = sc.nextDouble();
                double prixTVAC = prixHTVA * (1 + (TAUX_TVA21 / 100));
                double prixTVA = prixHTVA * TAUX_TVA21 / 100;
                // Format du System.out avec System.out.printf %.2f pour deux chiffres après la virgule>
                System.out.printf("Prix HTVA: %.2f€\nTVA: %.2f%%\nTVA: %.2f€\nTotal TVAC: %.2f€%n", prixHTVA, TAUX_TVA21, prixTVA, prixTVAC);

                System.out.print("Autre calcul? y/n ");
                autresCalcul = sc.next();
            } while(autresCalcul.equalsIgnoreCase("y"));
        }
        public static void calculPrixTVA21() {
            final double TAUX_TVA21 = 21;
            String autresCalcul;

            do {
                System.out.print("Veuillez entrez le prix TVAC: ");
                double prixTVAC = sc.nextDouble();
                double prixTVA = prixTVAC * TAUX_TVA21 / 100;
                double prixHTVA = prixTVAC - prixTVA;
                // Format du System.out avec System.out.printf %.2f pour deux chiffres après la virgule>
                System.out.printf("Prix HTVA: %.2f€\nTVA: %.2f%%\nTVA: %.2f€\nTotal TVAC: %.2f€%n", prixHTVA, TAUX_TVA21, prixTVA, prixTVAC);

                System.out.print("Autre calcul? y/n ");
                autresCalcul = sc.next();
            } while(autresCalcul.equalsIgnoreCase("y"));
        }
        public static void main(String[] args) {

            while (true) {
                System.out.println("\nMenu \n1. Calcul TVA 6%\n2. Calcul TVA 21%\n3. Calcul Prix TVAC\n0. Exit");
                System.out.print("Choix: ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "1" -> calculTVA6();
                    case "2" -> calculTVA21();
                    case "3" -> calculPrixTVA21();
                    case "0" -> {
                        System.out.println("GoodBye!");
                        System.exit(0);
                    }
                    default -> System.out.println("Choix invalide!");
                }
            }
        }
    }
