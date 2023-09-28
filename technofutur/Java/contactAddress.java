package technofutur.Java;

import java.io.*;
import java.util.*;

public class contactAddress {
    public static final Scanner sc = new Scanner(System.in);
    private static final String FILE_PATH = "C:\\java_projects\\technofutur\\Java\\address_file";
    private final Map<String, List<String>> contact;
    private String selectedContact;
    public contactAddress() {
        contact = new HashMap<>();
    }
    //
    public void loadContactFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    contact.put(parts[0], Collections.singletonList(parts[1]));
                } else {
                    System.out.printf("Contacts enregistrés sans adresse: %s%n", line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading categories file.");
        }
    }
    // Création du contact
    public void createContact() {
        System.out.println("Entrez un contact à créer: ");
        String newAddress = sc.nextLine();
        contact.put(newAddress, new ArrayList<>());
        updateAddressFile();

        System.out.println("Contenu de 'contact' après ajout : " + contact);
    }
    // Voir la liste de contacts
    public void showContact() {
        loadContactFromFile();
        System.out.println("Contacts: \n");
        for (String category : contact.keySet()) {
            System.out.println("Nom: " + category);

            List<String> addresses = contact.get(category);
            if (addresses != null && !addresses.isEmpty()) {
                for (String address : addresses) {
                    System.out.println("Adresse: " + address);
                }
            } else {
                System.out.println("Aucune adresse enregistrée pour ce contact.");
            }

            System.out.println();
        }
    }
    // Suppression du contact
    public void deleteContact() {
        System.out.println("Contacts : ");
        for (String category : contact.keySet()) {
            System.out.println(category);
        }
        System.out.print("Entrez le contact à supprimer: ");
        String contactToDelete = sc.nextLine();

        if (contact.containsKey(contactToDelete)) {
            contact.remove(contactToDelete);
            updateAddressFile();
            System.out.println("Contact supprimé.");
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
    // Mise à jour d'un contact ou ajout d'une adresse
    public void modifyContact() {
        loadContactFromFile();
        System.out.println("Contacts: ");
        for (String category : contact.keySet()) {
            System.out.println(category);
        }

        System.out.print("Choisir un contact: ");
        selectedContact = sc.nextLine();

        System.out.println("Contact sélectionné: \n" + selectedContact);
        System.out.println("Adresse actuel attaché au contact " + selectedContact + ":");
        List<String> wordsInCategory = contact.get(selectedContact);
        if (wordsInCategory != null) {
            for (String word : wordsInCategory) {
                System.out.println(word);
            }
        }

        System.out.println("1. Ajouté une adresse");
        System.out.println("2. Supprimer une adresse");
        System.out.print("Entrez votre choix: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Entrez la nouvelle adresse: ");
            String newWord = sc.nextLine();
            addAddressToContact(newWord);
        } else if (choice == 2) {
            System.out.print("Entrez l'adresse à supprimer: ");
            String wordToDelete = sc.nextLine();
            deleteAddressFromContact(wordToDelete);
        } else {
            System.out.println("Choix invalid.");
        }
    }
    // Ajout de l'adresse
    public void addAddressToContact(String word) {
        List<String> wordsInCategory = contact.get(selectedContact);
        if (wordsInCategory != null) {
            wordsInCategory.add(word);
            System.out.println("Adresse ajouté avec succès à " + selectedContact);
        } else {
            System.out.println("Contact non trouvé.");
        }

        updateAddressFile();
    }
    // Suppression de l'adresse
    public void deleteAddressFromContact(String word) {
        List<String> wordsInCategory = contact.get(selectedContact);
        if (wordsInCategory != null) {
            List<String> updateList = new ArrayList<>(wordsInCategory);
            if (updateList.remove(word)) {
                contact.put(selectedContact, updateList);
                System.out.println("Adresse supprimé avec succès de " + selectedContact);
                updateAddressFile();
            } else {
                System.out.println("Adresse non trouvé attaché à " + selectedContact);
            }
        } else {
            System.out.println("Adresse non trouvé.");
        }

    }

    // Mise à jour du fichier
    public void updateAddressFile() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            for (Map.Entry<String, List<String>> entry : contact.entrySet()) {
                String addresses = String.join(";", entry.getValue());
                writer.write(entry.getKey() + ":" + addresses + "\n");
            }
            System.out.println("Contacts enregistrés avec succès.\n");
        } catch (IOException e) {
            System.out.println("Erreur lors de l'enregistrement des contacts : " + e.getMessage());
        }
    }
    // Menu
    public static void main(String[] args) {
        contactAddress address = new contactAddress();
        do {
            System.out.println("""
                            Menu du carnet d'adresses:
                            1. Ajouter une personne
                            2. Afficher les personnes
                            3. Ajouter ou Mettre a jour les cordonnées d'une personne
                            4. Supprimer une personne
                            0. Quitter""");
            String choice = sc.nextLine();

            switch (choice) {
                case "1" -> address.createContact();
                case "2" -> address.showContact();
                case "3" -> address.modifyContact();
                case "4" -> address.deleteContact();
                case "0" -> {
                    System.out.println("Aurevoir! :)");
                    System.exit(0);
                }

                default -> System.out.println("Choix invalid.");
            }
        } while (true);
    }
}