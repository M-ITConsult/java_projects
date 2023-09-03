package technofutur.Java;

public class amandes_exces_de_vitesse_routes_structure_alternative_test_2 {
    public static void main(String[] args) {
        final int montantGlobal = 53;
        final int kmhSup = 10;
        final int tarifParKmhRoutes = 6;
        final String decheanceDuDroitDeConduire = "8 jours > 5ans (possible)";
        final String decheanceDuDroitDeConduire1 = "8 jours > 5ans (obligatoire)";
        final String retraisDuPermisDeConduire = "possible";
        final String tribunal = "entre 80 EUR et 4.000 EUR";

        int kmhVoitureRoutes = 32;
        int montantTotalKmhSup = (kmhVoitureRoutes > kmhSup) ? (kmhVoitureRoutes - kmhSup) * tarifParKmhRoutes : 0;


        if (kmhVoitureRoutes <= 10) {
            System.out.println("Vous avez une amende de: " + montantGlobal + "€");
        }

        if (kmhVoitureRoutes >= 11 && kmhVoitureRoutes <= 29) {
            System.out.println("Vous avez une amende de: " + montantGlobal + "€ + " + montantTotalKmhSup +
                    "€ pour informations, il y a un ajout de 6€ par km au dessus de 10km/h " +
                    "\n(si Tribunal: entre 80€ et 4.000€).");
        }

        if (kmhVoitureRoutes >= 30 && kmhVoitureRoutes <= 39) {
            System.out.println("Vous avez une amende de: " + montantGlobal + "€ + " + montantTotalKmhSup +
                    "€ pour informations, il y a un ajout de 6€ par km au dessus de 10km/h " +
                    "\n(si Tribunal: entre 80€ et 4.000€), " +
                    "\nmais également une Déchéance du droit de conduire " + decheanceDuDroitDeConduire +
                    " et un Retrais de permis de conduire " + retraisDuPermisDeConduire + ".");
        }

        if (kmhVoitureRoutes > 40) {
            System.out.println("Vous avez un excès de vitesse de plus de 40km/h, le Tribunal décidera de vous donner " +
                    "une amende " + tribunal + ",\nmais également une Déchéance du droit de conduire "
                    + decheanceDuDroitDeConduire1 + " et un Retrais de permis de conduire "
                    + retraisDuPermisDeConduire + ".");
        }
    }
}