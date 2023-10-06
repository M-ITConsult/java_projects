package technofutur.Java.Exo_IntFunc;

import technofutur.Java.Stream.Consume;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Carwash carwash = new Carwash();
        Voiture car1 = new Voiture("1-FVP-456");
        Voiture car2 = new Voiture("1-MDR-777");

        carwash.subscribe();
        carwash.traiter(car1);

        Consumer<String> consumer1 = (str) -> System.out.println("Consumer 1: " + str);

        Consumer<String> consumer2 = (str) -> System.out.println("Consumer 2: " + str);

        Consumer<String> consumer1And2 = consumer1.andThen(consumer2);

// Appel du premier consumer
        consumer1.accept("Hello"); // Output : Consumer 1: Hello

// Appel du deuxième consumer
        consumer2.accept("World"); // Output : Consumer 2: World

// Appel du consumer combiné
        consumer1And2.accept("Combined");
// Output :
// Consumer 1: Combined
// Consumer 2: Combined

    }
}
