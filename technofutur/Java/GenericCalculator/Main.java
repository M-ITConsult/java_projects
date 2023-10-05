package technofutur.Java.GenericCalculator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Calculator calc = new Calculator<>(20,5);

        System.out.println(calc.add());

        Calculator calcDouble = new Calculator<>(22.2,33.3);

        System.out.println(calcDouble.add());

        Calculator divFloat = new Calculator<>(50,5);

        System.out.println(divFloat.div());
    }
}
