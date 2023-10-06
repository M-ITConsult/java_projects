package technofutur.Java.Exo_IntFunc;

import java.util.function.Consumer;

@FunctionalInterface
interface IVoiture<T extends Voiture> extends Consumer<T> {
}