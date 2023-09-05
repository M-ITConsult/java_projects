package technofutur.Java;

import java.util.Scanner;

public class multiplication_table_for {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nombre;

        do {
            System.out.print("Veuillez entrer un nombre positif et non nul: ");
            while (!scanner.hasNextInt()) {
                    System.out.print("Erreur: Veuillez entrer un nombre entier positif et non nul.");
                    scanner.next();
                }
            nombre = scanner.nextInt();
            }  while (nombre <= 0);


        System.out.println("Table de multiplication par le nombre " + nombre + " :");

        for (int multiplicateur = 1; multiplicateur <=10; multiplicateur++) {
            System.out.println(nombre + " x " + multiplicateur + " = " + (nombre * multiplicateur));
        }
    }
}