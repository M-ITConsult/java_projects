package technofutur;

import java.util.Scanner;

public class trouver_valeur_dans_un_tableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un prénom: ");
        String prenom = scanner.nextLine();

        String[] prenoms = {"Alice", "Bob", "Charlie", "David", "Eve" }; // Exemple de prénoms

        boolean trouve = false;

        for (String nom : prenoms) {
            if (nom.equals(prenom)) {
                trouve = true;
                break;
            }
        }

        if (trouve) {
            System.out.println("Le prénom a été trouvé dans la liste.");
        } else {
            System.out.println("Le prénom n'a pas été trouvé dans la liste");
        }
    }
}
