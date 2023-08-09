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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String INSTRUCTION_STOP = "STOP";
        int nombre, somme = 0;
        String chaineUtilisateur;
        boolean continuer = true;
        System.out.print("Voici votre calculatrice d'addition ! \n Entrer la chaîne 'STOP' pour sortir du programme et ainsi afficher la somme des nombres préalablement entrés. \n");
        do {
            System.out.print("Entrer un nombre entier : ");
            chaineUtilisateur = String.valueOf(scanner.next());
            if(chaineUtilisateur.equals(INSTRUCTION_STOP)){
                continuer=false;
            }
            else{
                nombre = Integer.parseInt(chaineUtilisateur);
                somme+=nombre;
            }
        } while (continuer);

        System.out.println("La somme des nombres encodés vaut : " + somme);
    }
}