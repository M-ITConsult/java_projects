package technofutur;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args){
//
//        int maVariableEntiere;
//        double maVariableReel;
//        String maVariableChaineCaracteres;
//        maVariableEntiere = 14;
//        maVariableChaineCaracteres = "Hello World!";
//        maVariableReel = 24.58;
//
//        System.out.println(maVariableEntiere);
//        System.out.println(maVariableChaineCaracteres);
//        System.out.println(maVariableReel);

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        final String INSTRUCTION_STOP = "STOP";
//        int nombre, somme = 0;
//        String chaineUtilisateur;
//        boolean continuer = true;
//        System.out.print("Voici votre calculatrice d'addition ! \n Entrer la chaîne 'STOP' pour sortir du programme et ainsi afficher la somme des nombres préalablement entrés. \n");
//        do {
//            System.out.print("Entrer un nombre entier : ");
//            chaineUtilisateur = String.valueOf(scanner.next());
//            if(chaineUtilisateur.equals(INSTRUCTION_STOP)){
//                continuer=false;
//            }
//            else{
//                nombre = Integer.parseInt(chaineUtilisateur);
//                somme+=nombre;
//            }
//        } while (continuer);
//
//        System.out.println("La somme des nombres encodés vaut : " + somme);
//    }

//    public static void main(String[] args) {
//        char tableauCaractere[] = {'a','e','i','o','u','y'};
//        for(int i = 0; i < tableauCaractere.length; i++){
//            System.out.println("À l'indice " + i +" du tableau se trouve la voyelle " +
//                    tableauCaractere[i]);
//        }
//    }

    // En Boucle While
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int tableauEntier[] = new int[6];
//        int i = 0;
//
//        while(i < 6){
//            System.out.print("Veuillez entrer un nombre entier: ");
//            tableauEntier[i] = Integer.parseInt(scanner.next());
//            i=i+1;
//        }
//        int somme = 0;
//        i=0;
//
//        while(i < 6){
//            somme = somme + tableauEntier[i];
//            i=i+1;
//        }
//
//        System.out.print("La somme des nombres du tableau d'entiers vaut " + somme +"\n");
//        System.out.print("La moyenne des nombres du tableau d'entiers vaut " + somme/i);
//    }

    // En Boucle For

//    public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//        int tableauEntier[] = new int[6];
//
//        for(int i = 0; i < 6; i=i+1){
//            System.out.print("Veuillez entrer un nombre entier: ");
//            tableauEntier[i] = Integer.parseInt(scanner.next());
//        }
//        double somme = 0;
//
//        for(int i = 0; i < 6; i++){
//            somme = somme + tableauEntier[i];
//        }
//
//        System.out.print("La somme des nombres du tableau d'entiers vaut " + somme +"\n");
//        System.out.print("La moyenne des nombres du tableau d'entiers vaut " + somme/tableauEntier.length);
//    }

//    public static void main(String[] args) {
//        char mesLettres[][] = { {'a','b','c','d'}, {'e','f','g','h'}, {'i','j','k','l'}};
//        System.out.println(mesLettres[3][3]);
//    }

//public static void main(String[] args) {
//    int tabEntier[][] = { {5, 45, 78, -8}, {-4, 85, 1, -85}, {47, 31, -85, 87} };
//    double somme = 0;
//    int nombreElement = 0;
//    int i = 0;
//    int j = 0;
//
//    // For
////    for(int i = 0; i < 3; i++){
////        for(int j = 0; j < 4; j++){
////            somme = somme + tabEntier[i][j];
////            nombreElement++;
////        }
////    }
//
//    // While
//    while(i < 3 && j < 4){
//        somme += tabEntier[i][j];
//        nombreElement++;
//        i++;
//        j++;
//    }
//
//    System.out.print("La moyenne des nombres du tableau d'entiers vaut " + somme/nombreElement);
//}

    // Sans propriété length
//    public static void main(String[] args) {
//        int tabEntier[][] = { {5, 45, 78, -8}, {-4, 85, 1, -85}, {47, 31, -85, 87} };
//        double somme = 0;
//
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 4; j++){
//                somme = somme + tabEntier[i][j];
//            }
//        }
//        System.out.print("La somme des nombres du tableau d'entiers vaut " + somme);
//    }

    // Avec propriété length
//    public static void main(String[] args) {
//        int tabEntier[][] = { {5, 45, 78, -8}, {-4, 85, 1, -85}, {47, 31, -85, 87} };
//        double somme = 0;
//        for(int i = 0; i < tabEntier.length; i++){
//            for(int j = 0; j < tabEntier[i].length; j++){
//                somme = somme + tabEntier[i][j];
//            }
//        }
//        System.out.print("La somme des nombres du tableau d'entiers vaut " + somme);
//    }

//    public static void main(String[] args){
//
//        StringBuffer maChaine = new StringBuffer();
//        votreChaine(maChaine);
//        System.out.println("Votre chaîne de caractères est : " + maChaine);
//    }
//
//    public static void votreChaine(StringBuffer chaineUtilisateur){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Veuillez rentrer votre chaîne de caractères : ");
//        String val = scanner.next();
//        chaineUtilisateur.append(val);
//    }

//    public static void main(String[] args){
//        int nombreUn = 15, nombreDeux = 27;
//        System.out.println("Votre somme de "+ nombreUn + " et " + nombreDeux + " vaut : " + somme(nombreUn,nombreDeux));
//    }
//
//    public static int somme(int val1, int val2){
//        return val1 + val2;
//    }

//    public static void main(String[] args){
//        String tabChaine[] = {"Bonjour", "Guten Tag", "Hello", "Namaskar", "Annyong haseyo", "Hej", "Buenos días", "Kalimera", "Aloha", "Konnichi wa", "Ave", "Goede morgen"};
//
//        int nombreCaracteres[] = new int[tabChaine.length];
//
//        for (int i = 0; i < tabChaine.length; i++) {
//            nombreCaracteres[i] = calculNombreCaracteres(tabChaine[i]);
//        }
//
//        for (int i = 0; i < tabChaine.length; i++) {
//            System.out.println("La longeur de " + tabChaine[i]  + " est de " + nombreCaracteres[i]);
//        }
//    }
//
//    public static int calculNombreCaracteres (String chaineChar){
//        int longueurChaine = chaineChar.length();
//        return longueurChaine;
//    }
}