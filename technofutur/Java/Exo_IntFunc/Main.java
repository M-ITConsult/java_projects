package technofutur.Java.Exo_IntFunc;

public class Main {

    public static void main(String[] args) {
        Carwash carwash = new Carwash();

        Voiture car1 = new Voiture("1-456-FVP");

        carwash.subscribe();

        carwash.traiter(car1);

    }
}
