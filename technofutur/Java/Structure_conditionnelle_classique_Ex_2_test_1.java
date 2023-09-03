package technofutur.Java;

import java.util.Scanner;

public class Structure_conditionnelle_classique_Ex_2_test_1 {

// Second program
    public static void main(String[] args) {
        final int MAJEUR = 18;
        System.out.println("Entrez votre âge: ");
        Scanner age = new Scanner(System.in);
        int agePersonne = age.nextInt();


        if (agePersonne >= MAJEUR)
            System.out.println("Vous êtes majeur!");
        else
            System.out.println("Vous n'êtes pas majeur!");
    }
}