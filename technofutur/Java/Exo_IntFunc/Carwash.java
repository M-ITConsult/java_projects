package technofutur.Java.Exo_IntFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Carwash {
    // Méthode ArrayList
    private final List<IVoiture<Voiture>> traitements = new ArrayList<>();
    // Méthode Consumer
//    private Consumer<Voiture> traitements = voiture -> {};

    private void preparer(Voiture v) {
        System.out.printf("Préparation de la voiture: %s%n ", v.getPlaque());
    }

    private void laver(Voiture v) {
        System.out.printf("Lavage de la voiture: %s%n ", v.getPlaque());
    }

    private void secher(Voiture v) {
        System.out.printf("Séchage de la voiture: %s%n ", v.getPlaque());
    }

    private void finaliser(Voiture v) {
        System.out.printf("Finalisation de la voiture: %s%n ", v.getPlaque());
    }

    public void subscribe() {
        // Méthode ArrayList
        traitements.add(this::preparer);
        traitements.add(this::laver);
        traitements.add(this::secher);
        traitements.add(this::finaliser);
        // Méthode Consumer
//        traitements = this::preparer;
//        traitements = traitements.andThen(this::laver);
//        traitements = traitements.andThen(this::secher);
//        traitements = traitements.andThen(this::finaliser);
    }

    public void traiter(Voiture v) {
        for (IVoiture<Voiture> traitement : traitements) {
            traitement.accept(v);
        }
    }
}
