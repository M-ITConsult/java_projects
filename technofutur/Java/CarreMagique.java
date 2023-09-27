package technofutur.Java;

public class CarreMagique {

    public static void main(String[] args) {
        int n = 5; // Ordre du carré magique (doit être impair)
        int[][] carreMagique = genererCarreMagique(n);
        afficherCarreMagique(carreMagique);
    }

    public static int[][] genererCarreMagique(int n) {
        int[][] carre = new int[n][n];
        int num = 1;
        int i = n / 2;
        int j = n - 1;

        while (num <= n * n) {
            if (i == -1 && j == n) {
                i = 0;
                j = n - 2;
            } else {
                if (j == n) {
                    j = 0;
                }
                if (i < 0) {
                    i = n - 1;
                }
            }

            if (carre[i][j] != 0) {
                i++;
                j -= 2;
                continue;
            } else {
                carre[i][j] = num++;
            }

            i--;
            j++;
        }

        return carre;
    }

    public static void afficherCarreMagique(int[][] carre) {
        int n = carre.length;
        System.out.println("Carré Magique d'ordre " + n + " :");

        for (int[] ints : carre) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
