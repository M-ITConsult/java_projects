package POO_wow;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Races race3 = new Races("","","",0);
    
        // Exemple avec le level et le set
        System.out.print("Entrez level: ");
        race3.setLevel(sc.nextInt());
        // Avec le get
        System.out.printf("Le level de votre perso est: %s", race3.getLevel());

        /* ------------------------------------------ */

        // Ajout d'un nom de personnage
        System.out.print("Entrez le nom du personnage: ");
        String newCharacter = sc.next();

        // Ajout du nom de la race
        System.out.print("Entrez le nom de la race: ");
        String newRace = sc.next();

        // Ajout de la classe
        System.out.print("Entrez la classe: Horde ou Alliance ");
        String newRaceClass = sc.next();

        // Ajout du niveau du personnage
        System.out.print("Entrez le level du personnage: ");
        int newLevel = sc.nextInt();

        Races raceChosen = new Races(newCharacter, newRace, newRaceClass, newLevel);

        System.out.printf("Nom du personnage: %s%n" +
                            "Nom de la race: %s%n" +
                            "Nom de la classe: %s%n" +
                            "Level du personnage: %s",
                            raceChosen.getName(),
                            raceChosen.getRaceName(),
                            raceChosen.getRaceClass(),
                            raceChosen.getLevel());

                            
                            
    }
}
