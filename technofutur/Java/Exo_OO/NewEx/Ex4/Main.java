package technofutur.Java.Exo_OO.NewEx.Ex4;

public class Main {
    public static void main(String[] args) {
        // Sans la méthode static
//        Operation firstOp = new Operation();

        // Avec la méthode static
        System.out.println(Operation.doublemultiplier(25.5));
        System.out.println(Operation.doublemutilplier1(23.5,5.3));
        System.out.println(Operation.multiplier(22.2,30.5));
    }
}
