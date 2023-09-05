import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter number 2: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();
        
        double result;

        switch (operator) {
            case "+" -> {
                result = num1 + num2;
                System.out.printf("Result: %s",result);
            }
            case "-" -> {
                result = num1 - num2;
                System.out.printf("Result: %s",result);
            }
            case "*" -> {
                result = num1 * num2;
                System.out.printf("Result: %s",result);
            }
            case "/" -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("Result: %s", result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
            }

            default -> System.out.println("Error: Invalid operator");

        }
        
        scanner.close();
    }
}
