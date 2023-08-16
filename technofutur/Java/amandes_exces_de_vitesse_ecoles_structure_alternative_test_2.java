package technofutur;

public class amandes_exces_de_vitesse_ecoles_structure_alternative_test_2 {

    public static void main(String[] args) {
        final int montantGlobal = 53;
        final int kmhSup = 10;
        final int tarifParKmhEcoles = 11;
        final String decheanceDuDroitDeConduire = "8 jours > 5ans (possible)";
        final String decheanceDuDroitDeConduire1 = "8 jours > 5ans (obligatoire)";
        final String retraisDuPermisDeConduire = "possible";
        final String tribunal = "entre 80 EUR et 4.000 EUR";

        int kmhVoiture = 22;
        int montantTotalKmhSup = (kmhVoiture > kmhSup) ? (kmhVoiture - kmhSup) * tarifParKmhEcoles : 0;

        if (kmhVoiture <= 10) {
            System.out.println("Vous avez une amende de: " + montantGlobal + "€");
        }

        if (kmhVoiture >= 11 && kmhVoiture <= 19) {
            System.out.println("Vous avez une amende de: " + montantGlobal + "€ + " + montantTotalKmhSup +
                    "€ pour informations, il y a un ajout de 11€ par km au dessus de 10km/h. \nPour rappel, si Tribunal " +
                    "le montant s'élève entre 80€ et 4.000€.");
        }

        if (kmhVoiture >= 20 && kmhVoiture <= 30) {
            System.out.println("Vous avez une amende de: " + montantGlobal + "€ + " + montantTotalKmhSup +
                    "€ pour informations, il y a un ajout de 11€ par km au dessus de 10km/h, " +
                    "\nmais également une Déchéance du droit de conduire " + decheanceDuDroitDeConduire +
                    " et un Retrais de permis de conduire " + retraisDuPermisDeConduire + "." + "\nPour rappel, si Tribunal " +
                    "le montant s'élève entre 80€ et 4.000€.");
        }

        if (kmhVoiture > 30) {
            System.out.println("Vous avez un excès de vitesse de plus de 30km/h, le Tribunal décidera de vous donner " +
                    "une amende " + tribunal + ",\nmais également une Déchéance du droit de conduire "
                    + decheanceDuDroitDeConduire1 + " et un Retrais de permis de conduire "
                    + retraisDuPermisDeConduire + ".");
        }
    }
}