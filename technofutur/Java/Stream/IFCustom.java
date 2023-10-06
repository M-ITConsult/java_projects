package technofutur.Java.Stream;

@FunctionalInterface
public interface IFCustom<T,U,R,S> {
    R execute(T t, U u, S s);
}
