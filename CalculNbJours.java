import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculNbJours {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entrez une première date YYYY-MM-DD: ");
        String test = sc.nextLine();

        System.out.print("Entrez une deuxième date YYYY-MM-DD: ");
        String test1 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(test, formatter);
        LocalDate date2 = LocalDate.parse(test1, formatter);

        long joursEntre = ChronoUnit.DAYS.between(date1, date2);
        long moisEntre = ChronoUnit.MONTHS.between(date1, date2);
        long anneesEntre = ChronoUnit.YEARS.between(date1, date2);

        System.out.printf("Nombre de jours entre les deux dates: %s%n", joursEntre);
        System.out.printf("Nombre de mois entre les dates: %s%n", moisEntre);
        System.out.printf("Nombre d'années entre les dates: %s%n", anneesEntre);

    }
}
