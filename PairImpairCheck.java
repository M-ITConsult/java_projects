import java.util.Scanner;

public class PairImpairCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre: ");
        int number = sc.nextInt();

        if (isEven(number)) {
            System.out.printf("%s est pair.", number);
        } else {
            System.out.printf("%s est impair.", number);
        }
        sc.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
