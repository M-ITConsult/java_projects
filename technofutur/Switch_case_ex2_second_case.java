package technofutur;

import java.util.Scanner;

public class Switch_case_ex2_second_case {
    public static void main(String[] args) {

        // Second Case
        final double TAUX_REVENUS = 40;
        final double LOYER_HOUSE = 1200;
        System.out.println("Veuillez entrer votre revenu ");
        Scanner role = new Scanner(System.in);
        int revenuClient = role.nextInt();
        double baseRevenus = revenuClient*(1+(TAUX_REVENUS / 100.0));

        String decisionLoyer = (LOYER_HOUSE >= baseRevenus)?"Trop haut":"Acceptable";

        System.out.println(decisionLoyer);

        role.close();
    }
}
