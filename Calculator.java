import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private final List<String> history;
    private final Scanner scanner;

    public Calculator() {
        history = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addCalculationToHistory(String calculation) {
        history.add(calculation);
    }

    public void printHistory() {
        System.out.println("--- Historique des Calculs ---");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
        System.out.println();
    }

    public double performOperation(double operand1, double operand2, String operator) {
        double result = 0.0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Erreur : Division par zéro.");
                }
                break;
            default:
                System.out.println("Opérateur non valide.");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Entrez le premier nombre : ");
            double num1 = calculator.scanner.nextDouble();
            calculator.scanner.nextLine(); // Consume the newline character

            System.out.print("Entrez l'opérateur (+, -, *, /) : ");
            String operator = calculator.scanner.nextLine();

            System.out.print("Entrez le deuxième nombre : ");
            double num2 = calculator.scanner.nextDouble();
            calculator.scanner.nextLine(); // Consume the newline character

            double result = calculator.performOperation(num1, num2, operator);
            System.out.println("Résultat : " + result);

            calculator.addCalculationToHistory(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.print("Voulez-vous continuer (O/N) ? ");
            String continueChoice = calculator.scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("O")) {
                calculator.printHistory();
                break;
            }
        }
    }
}
