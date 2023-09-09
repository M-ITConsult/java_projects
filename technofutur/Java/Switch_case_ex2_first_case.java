package technofutur.Java;

import java.util.Scanner;
import java.util.logging.LogRecord;

public class Switch_case_ex2_first_case {
    public static void main(String[] args) {

        String autresSimulation;
        // First Case
        final double TAUX_REVENUS = 40;
        final double LOYER_HOUSE = 1200;
        do {

            System.out.print("Veuillez entrer votre revenu: ");
            Scanner sc = new Scanner(System.in);
            int revenuClient = sc.nextInt();
            double baseRevenus = revenuClient*(1+(TAUX_REVENUS / 100.0));


            if (baseRevenus >= LOYER_HOUSE)
                System.out.printf("Le loyer de %.2f est acceptable pour vous.%n", LOYER_HOUSE);
            else
                System.out.printf("Le loyer de %.2f€ est trop haut pour vous.%n", LOYER_HOUSE);

            System.out.print("Une autre simulation? oui/non ");
            autresSimulation = sc.next();

        } while(autresSimulation.equalsIgnoreCase("oui"));
    }
}
