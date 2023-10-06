package technofutur.Java.Stream;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static technofutur.Java.Stream.Stream_1.*;

public class Main {
    public static void main(String[] args) {
        // Création de la liste
        List<String> noms = List.of("test", "test", "test", "marine", "meli", "thomas");

        // Filtre de la liste commençant par "m"
        List<String> nomsFiltre = noms.stream()
                .filter(nom -> {
                    return nom.startsWith("m");
                })
                .map(String::toUpperCase)
                .toList();

        // Affichage
        for (String nom : nomsFiltre) {
            System.out.println(nom);
        }

        // Liste en majuscule
        List<String> nomsMaj = noms.stream()
                //valeur -> valeur.
                .map(String::toUpperCase)
                .toList();

        // Affichage
        for (String nom : nomsMaj) {
            System.out.println(nom);
        }

        // Liste test
        List<String> test1 = noms.stream()
                .map(String::toLowerCase)
                .toList();

        for (String nom : test1) {
            System.out.println(nom);
        }

        exo_1();
    }
}
