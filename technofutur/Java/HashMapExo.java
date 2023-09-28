package technofutur.Java;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExo {
static Scanner sc = new Scanner(System.in);
static String email;
static String nom;

    public static void Ajouter(HashMap<String, String > carnetAdresse, String email, String nom) {
        carnetAdresse.put(email, nom);
    }
    public static void Modifier(HashMap<String, String > carnetAdresse, String email, String nom) {
        if(carnetAdresse.containsKey(email)) {
            carnetAdresse.replace(email, nom);
        } else {
            System.out.println("Impossible de modifier un element inexistant");
        }

    }
    public static void Supprimer(HashMap<String, String > carnetAdresse, String email) {
        if(carnetAdresse.containsKey(email)) {
            carnetAdresse.remove(email);
        } else {
            System.out.println("Impossible de supprimer un element inexistant");
        }
    }

    public static void Parcourir(HashMap<String, String > carnetAdresse) {
        // carnetAdresse.isEmpty() ->
        if (!carnetAdresse.isEmpty()) {
            carnetAdresse.forEach((cle, valeur) -> {
                System.out.println("Nom: " + valeur + " | Email: " + cle);
            });
        }
    }
    public static void main(String[] args) {


        HashMap<String, String> carnetAdresse = new HashMap<>();

        do {
            System.out.println("""
                    Veuillez faire un choix:
                    1. Ajouter un contact
                    2. Modifier un contact
                    3. Supprimer un contact
                    4. Parcourir les contacts
                    0. Quitter""");

            String choix = sc.nextLine();

            switch (choix) {
                case "1" -> {
                                System.out.println("Veuillez entrer un email: ");
                                email = sc.nextLine();
                                System.out.println("Veuillez entrer un nom: ");
                                nom = sc.nextLine();
                                Ajouter(carnetAdresse,email,nom);
                }
                case "2" -> {       System.out.print("Veuillez entrer un email associé au nom à modifier: ");
                                    email = sc.nextLine();
                                    System.out.print("Veuillez entrer le nouveau nom: ");
                                    nom = sc.nextLine();
                                    Modifier(carnetAdresse,email,nom);
                }
                case "3" -> {     System.out.print("Veuillez entrer un email associé au contact à supprimer: ");
                                email = sc.nextLine();
                                Supprimer(carnetAdresse,email);}
                case "4" -> Parcourir(carnetAdresse);
                case "0" -> {System.exit(0);
                    System.out.println("Au Revoir");}
                default -> System.out.println("Choix invalid");
            }

        } while (true);
    }
}
