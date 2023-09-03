package technofutur.Java;

import java.util.Scanner;

public class multiplication_table_while {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nombre = 0;
        boolean valide = false;

        while (!valide) {
            System.out.println("Veuillez entrer un nombre positif et non nul: ");
            if (scanner.hasNext()) {
                nombre = scanner.nextInt();
                if (nombre > 0) {
                    valide = true;
                } else {
                    System.out.println("Erreur: Veuillez entrer un nombre entier positif et non nul.");
                }
            } else {
                System.out.println("Erreur: Veuillez entrer un nombre entier positif et non nul.");
                scanner.next(); // Consommer l'entrée valide
            }
        }

        System.out.println("Table de multiplication par le nombre " + nombre + " :");

        int multiplicateur = 1;
        while (multiplicateur <= 10) {
            System.out.println(nombre + " x " + multiplicateur + " = " + (nombre * multiplicateur));
            multiplicateur++;
        }
    }
}