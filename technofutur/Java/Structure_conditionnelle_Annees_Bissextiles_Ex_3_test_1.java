package technofutur;

import java.util.Scanner;

public class Structure_conditionnelle_Annees_Bissextiles_Ex_3_test_1 {

    public static void main(String[] args) {

        System.out.println("Entrez une année: ");
        Scanner year = new Scanner(System.in);
        int yearInput = year.nextInt();

        if ((yearInput % 4 == 0 && yearInput % 100 != 0) || yearInput % 400 == 0) {
            System.out.println(yearInput + " est une année bissextile!");
        } else {
            System.out.println(yearInput + " n'est pas une année bissextile!");
        }
    }
}