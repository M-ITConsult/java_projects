package technofutur.Java.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> noms = Arrays.asList("");

        List<String> nomsFiltre = noms.stream()
                .filter(nom -> nom.startsWith("M"))
                .collect(Collectors.toList());

        for(String nom : nomsFiltre) {
            System.out.println(nom);
        }

        List<String> nomsMaj = noms.stream()
                //valeur -> valeur.
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        for(String nom : nomsMaj) {
            System.out.println(nom);
        }
    }
}
