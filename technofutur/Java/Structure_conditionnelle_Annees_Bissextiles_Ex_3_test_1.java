package technofutur.Java;

import java.util.Scanner;

public class Structure_conditionnelle_Annees_Bissextiles_Ex_3_test_1 {

    public static void main(String[] args) {

        System.out.println("Entrez une année: ");
        Scanner year = new Scanner(System.in);
        int yearInput = Integer.parseInt(year.nextLine());

        if ((yearInput % 4 == 0 && yearInput % 100 != 0) || yearInput % 400 == 0) {
            // %d pour Int %f pour Float
            System.out.printf("%d est une année bissextile!",yearInput);
        } else
            System.out.printf("%d n'est pas une année bissextile!", yearInput);
        }
    }