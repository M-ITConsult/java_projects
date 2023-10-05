package technofutur.Java.Generic;

import java.util.ArrayList;
import java.util.List;

public class ListeGenerique<T> {

    private List<T> valeurs = new ArrayList<>();

    // Ajout d'une valeur
    public void ajouter(T valeur) {
        valeurs.add(valeur);
    }

    // Récupérer une valeur
    public T recupValeur(int indice) {
        return valeurs.get(indice);
    }

    // Affiche les valeurs
    public void afficher() {
        for(T valeur : valeurs) {
            System.out.println(valeur);
        }
    }

    // Supprime une valeur "T valeur ou indice"
    public void supprimer(T valeur){
        valeurs.remove(valeur);
    }

    // Edite une valeur
    public void editer(int indice, T valeur) {
        valeurs.set(indice,valeur);
    }
}
