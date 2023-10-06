package technofutur.Java.Stream;

import java.util.function.Consumer;

public class Consume implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.printf("Hello there! %s",o);
    }
}
