package POO_wow;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Races race1= new Races("Horo","Elf","Horde",50);

        // Ajout d'un nom de personnage
        System.out.print("Entrez le nom du personnage: ");
        String newCharacter = sc.nextLine();

        // Ajout du nom de la race
        System.out.print("Entrez le nom de la race: ");
        String newRace = sc.nextLine();

        // Ajout de la classe
        System.out.print("Entrez la classe: Horde ou Alliance ");
        String newRaceClass = sc.nextLine();

        // Ajout du niveau du personnage
        System.out.print("Entrez le level du personnage: ");
        int newLevel = sc.nextInt();

        Races raceChoosen = new Races(newCharacter, newRace, newRaceClass, newLevel);

        System.out.printf("Nom du personnage: %s%n" +
                            "Nom de la race: %s%n" +
                            "Nom de la classe: %s%n" +
                            "Level du personnage: %s",
                            raceChoosen.getName(),
                            raceChoosen.getRaceName(),
                            raceChoosen.getRaceClass(),
                            raceChoosen.getLevel());
    }
}
