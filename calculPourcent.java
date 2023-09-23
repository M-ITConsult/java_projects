import java.util.Scanner;

public class calculPourcent {
    private static final Scanner sc = new Scanner(System.in);
    public static final int surcent = 100;

    private static void calculAvecPrix() {
        System.out.print("Entrez votre prix: ");
        var price = sc.nextDouble();
        System.out.print("Entrez le pourcentage à déduire: ");
        var pourcent = sc.nextDouble();
        var reducPrice = price * pourcent / surcent;
        var finalPrice = price - reducPrice;
        System.out.printf("Voici le prix final avec la réduction %.2f€", finalPrice);
    }
    public static void main(String[] args) {
        calculAvecPrix();
    }
}
