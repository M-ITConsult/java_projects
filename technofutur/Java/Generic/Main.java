package technofutur.Java.Generic;
public class Main {
    public static void main(String[] args) {
        ListeGenerique<String> listeCourse = new ListeGenerique<>();

        listeCourse.ajouter("Pâtes");
        listeCourse.ajouter("Brocoli");
        listeCourse.ajouter("Pommes");
        listeCourse.ajouter("Bananes");
        listeCourse.ajouter("Courgettes");

        ListeGenerique<Integer> scoreEleve = new ListeGenerique<>();

        scoreEleve.ajouter(5);
        scoreEleve.ajouter(15);
        scoreEleve.ajouter(1);
        scoreEleve.ajouter(7);
        scoreEleve.ajouter(12);
        scoreEleve.ajouter(18);

        // Afficher
        listeCourse.afficher();
        scoreEleve.afficher();

        System.out.println();

        // Supprimer
        listeCourse.supprimer("Pâtes");
        listeCourse.afficher();

        System.out.println();

        // Editer
        listeCourse.editer(2,"Kiwis");
        listeCourse.afficher();

        System.out.println();

        // Recupère la valeur
        System.out.println(listeCourse.recupValeur(3));


        System.out.println();

        // Ajouter
        listeCourse.ajouter("Noix");
        listeCourse.afficher();

    }
}
