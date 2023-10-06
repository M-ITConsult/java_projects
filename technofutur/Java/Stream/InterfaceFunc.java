package technofutur.Java.Stream;

import java.util.function.Consumer;

public class InterfaceFunc {

    static void demo1() {
        // First method
        Runnable run = () -> System.out.println("run I-F");
        run.run();

        // Second method
        IF test = new IF();

        test.run();
    }

    static void demo2() {
        // Consumer
        Consumer<String> test = (valeur) -> System.out.printf("Test: %s%n", valeur);
        test.accept("Ceci est un test");

        // other method Consumer
        Consume c = new Consume();
        c.accept("says Obiwan :)");
    }
}
