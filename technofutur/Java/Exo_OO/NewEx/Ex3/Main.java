package technofutur.Java.Exo_OO.NewEx.Ex3;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Roi roi1 = new Roi();

        Pion pion1 = new Pion();

        System.out.print("Pour le roi, entrez le nombres de case souhaitez: ");
        roi1.setNbCase(sc.nextInt());
        roi1.seDeplacer();

        System.out.print("Pour le pion, entrez le nombres de case souhaitez: ");
        pion1.setNbCase(sc.nextInt());
        pion1.seDeplacer();
    }
}
