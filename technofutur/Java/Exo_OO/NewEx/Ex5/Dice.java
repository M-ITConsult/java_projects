package technofutur.Java.Exo_OO.NewEx.Ex5;
import java.util.ArrayList;
import java.util.Random;

public class Dice {

    public static int diceRoller(double nbrFace, int nbrJet){
//        ArrayList<Integer>
        Random random = new Random();

        return random.nextInt(1, (int) nbrFace) + nbrJet;

        // Méthode Stream
//        int result = resultats.stream()
//                .limit(nbrJet-1)
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        return result;
    }
}
