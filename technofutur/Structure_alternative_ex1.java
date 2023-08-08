package technofutur;

import java.util.Scanner;

public class Structure_alternative_ex1 {

    public static void main(String[] args) {
        System.out.println("Veuillez entrer un premier entier.");
        Scanner first = new Scanner(System.in);
        int premierNombre = first.nextInt();

        System.out.println("Veuillez entrer un second entier.");
        Scanner second = new Scanner(System.in);
        int secondNombre = second.nextInt();

        if (premierNombre < secondNombre)
            System.out.println("La première valeur est plus petite que la seconde.");
        if (premierNombre > secondNombre)
            System.out.println("La première valeur est plus grande que la seconde.");
        else
            System.out.println("Les deux valeurs sont identiques.");

        first.close();
        second.close();
    }
}
