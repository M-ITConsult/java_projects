import java.util.Scanner;

public class calculPrixPoids {
    static final int kilo = 1000;

    // Pour connaître le prix au kg de l'article
    public static void prixAuKg() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le prix de votre article: ");
        double price = sc.nextDouble();

        System.out.print("Entrez le poids de votre article: ");
        double poids = sc.nextDouble();

        double result = price * kilo / poids;
        System.out.printf("Voici le prix au kilo de votre article: %.2f€%n", result);
    }

    // Pour connaître le prix de l'article en connaissant le prix au kg et le poids de l'article
    public static void prixPiece() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le prix au kg de votre article: ");
        double priceKg = sc.nextDouble();

        System.out.print("Entrez le poids de votre article: ");
        double poids = sc.nextDouble();

        double result = priceKg / kilo * poids;
        System.out.printf("Voici le prix au kilo de votre article: %.2f€%n", result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("\nEntez votre choix:\n1. Prix au KG\n2. Prix de l'article\n3. Exit");
        int choice = sc.nextInt();

            switch (choice) {
                case 1 -> prixAuKg();
                case 2 -> prixPiece();
                case 3 -> System.exit(0);
            }
        }
    }
}
