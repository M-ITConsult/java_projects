package technofutur.Java;

import java.util.Scanner;

public class Structure_alternative_ex2 {

    public static void main(String[] args) {

        final int MAX = 50;
        final int MIN = 20;

        System.out.println("Veuillez entrer un nombre entier.");
        Scanner first = new Scanner(System.in);
        int nombreEntier = first.nextInt();

        if (nombreEntier < MAX && nombreEntier > MIN)
            System.out.println("Votre nombre est compris entre les valeurs Maximum et Minimum.");

        else
            System.out.println("Votre valeur n'est pas comprise entre le Maximum et le Minimum.");

        first.close();
    }
}
