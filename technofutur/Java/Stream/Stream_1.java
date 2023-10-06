package technofutur.Java.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_1 {

    static void exo_1() {
        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(3);
        liste.add(2);
        liste.add(4);
        liste.add(1);
        liste.add(6);
        liste.add(8);
        liste.add(10);
        liste.add(7);
        liste.add(9);

        // Trie de la liste
        List<Integer> numberFiltre = liste.stream()
                .sorted()
                .toList();

        System.out.printf("Voici la liste trié: %s%n", numberFiltre);

        // Conservation de 5 valeurs
        List<Integer> numbVal = liste.stream()
                .limit(5)
                .toList();

        System.out.printf("Ici je récupère 5 valeurs: %s%n", numbVal);
        // Somme des 5 valeurs
        List<Integer> sumVal = Collections.singletonList(liste.stream()
                .limit(5)
                .reduce(0, Integer::sum));

        // Afficher la somme
        System.out.printf("Ici je fais la somme des 5 valeurs: %s", sumVal);
    }

}
