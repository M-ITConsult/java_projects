package technofutur.Java;

import java.util.Random;
import java.util.Scanner;

public class tableaux_test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] tableau2D = new double[6][10];
        double[] tableau1D = new double[6];

        Random random = new Random();

        for (int etudiant = 0; etudiant < 6; etudiant++) {
            for (int cours = 0; cours < 10; cours++) {
                double noteAleatoire = genererNoteAleatoire(0, 20, random);
                tableau2D[etudiant][cours] = noteAleatoire;
            }

            double sommeNotes = 0;
            for (int cours = 0; cours < 10; cours++) {
                sommeNotes += tableau2D[etudiant][cours];
            }

            double moyenne = sommeNotes / 10;
            tableau1D[etudiant] = moyenne;
        }

        for (int etudiant = 0; etudiant < 6; etudiant++) {
            System.out.println("Moyenne de l'étudiant " + etudiant + ": " + tableau1D[etudiant]);
        }
    }

    public static double genererNoteAleatoire(double min, double max, Random random) {
        return min + (max - min) * random.nextDouble();
    }
}
