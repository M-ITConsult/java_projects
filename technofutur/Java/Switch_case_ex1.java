package technofutur;

import java.util.Scanner;

public class Switch_case_ex1 {
    public static void main(String[] args) {

        System.out.println("Veuillez entrer un nombre entre 1 et 7: ");
        Scanner role = new Scanner(System.in);
        int numRole = role.nextInt();

        if (numRole == 1) {
            System.out.println("Vous prenez le rôle Directeur");
        }
        if (numRole == 2) {
            System.out.println("Vous prenez le rôle de Chef de service");
        }
        if (numRole == 3) {
            System.out.println("Vous prenez le rôle de Manager");
        }
        if (numRole >= 4) {
            System.out.println("Vous prenez le rôle d'Employé");
        }



        role.close();
    }
}
