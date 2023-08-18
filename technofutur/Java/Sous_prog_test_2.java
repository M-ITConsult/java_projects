package technofutur.Java;

public class Sous_prog_test_2 {
        public static void triTableau(int[] tab) {
            int longTab = tab.length;
            boolean modif;

            for (int passage = 1; passage < longTab; passage++) {
                modif = false;

                for (int i = 0; i < longTab - passage; i++) {
                    if (tab[i] > tab[i + 1]) {
                        // Échanger les éléments tab[i] et tab[i+1]
                        int temp = tab[i];
                        tab[i] = tab[i + 1];
                        tab[i + 1] = temp;
                        modif = true;
                    }
                }

                if (!modif) {
                    break; // Quitter la boucle si aucune modification n'a été effectuée
                }
            }
        }

        public static void main(String[] args) {
            int[] tab = { 9, 5, 1, 8, 3, 7, 2, 6, 4 };
            triTableau(tab);

            // Afficher le tableau trié
            System.out.print("Tableau trié : ");
            for (int valeur : tab) {
                System.out.print(valeur + " ");
            }
        }
    }
