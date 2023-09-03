package technofutur.Java;

import java.util.Scanner;

public class Structure_conditionnelle_ternaire_Ex_2_test_1 {

// First program
    public static void main(String[] args) {
        final int MAJEUR = 18;
        System.out.println("Entrez votre âge: ");
        Scanner age = new Scanner(System.in);
        int agePersonne = age.nextInt();


        Boolean siMajeur = MAJEUR <= agePersonne;
                System.out.println(siMajeur);
    }
}