package technofutur.Java.Exo_IntFunc;

public class Voiture extends Carwash {

    private String Plaque;

    // Constructor
    public Voiture(String plaque) {
        Plaque = plaque;
    }

    // Getter and Setter
    public String getPlaque() {
        return Plaque;
    }

    public void setPlaque(String plaque) {
        Plaque = plaque;
    }
}
