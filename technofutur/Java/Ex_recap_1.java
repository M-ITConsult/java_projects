package technofutur.Java;

public class Ex_recap_1 {
    public static void triABulles(int[] tab) {

        int longTab = tab.length;
        boolean modif;


        for (int passage = 1; passage < longTab; passage++) {
            modif = false;

            for (int i = 0; i < longTab - passage; i++) {
                if (tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    modif = true;
                }
            }

            if (!modif) {
                break;
            }
        }
    }

        public static void main (String[]args){
            int[] tab = {2, 9, 4, 1, 28, 96, 8, 8, 14, 145, 7, 54, 78, 69, 45, 1, 0, 87, 958, 457, 56, 257, 698, 154, 75};
            triABulles(tab);

            for (int valeur : tab) {
                System.out.println(valeur + " ");
            }
        }
}