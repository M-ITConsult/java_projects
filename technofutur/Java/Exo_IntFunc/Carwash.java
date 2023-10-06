package technofutur.Java.Exo_IntFunc;

import java.util.ArrayList;
import java.util.List;

public class Carwash {
    private List<IVoiture> traitements = new ArrayList<>();

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
        traitements.add(this::preparer);
        traitements.add(this::laver);
        traitements.add(this::secher);
        traitements.add(this::finaliser);
    }

    public void traiter(Voiture v) {
        for (IVoiture traitement : traitements) {
            traitement.traiterVoiture(v);
        }
    }
}
