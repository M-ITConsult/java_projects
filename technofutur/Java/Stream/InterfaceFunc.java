package technofutur.Java.Stream;

import java.util.function.Consumer;
import java.util.function.Function;

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
        c.accept("says Obiwan :)\n");
    }

    static void demo3() {

        // Interface function

        Function<Integer, Integer> test = (nbr) -> nbr*2;

        System.out.println(test.apply(5));

        // Interface function classe anonyme

        Function<Integer, Integer> testAno = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        System.out.println(testAno.apply(50));

        //

        Function<Integer, Boolean> test2 = (valeur) -> valeur % 2 == 0;
        System.out.println(test2.apply(8));
    }

    static void exo1() {
//        IFCustom<String, String, Integer, String> ifcustom = (nom, prenom, age)
    }
}
