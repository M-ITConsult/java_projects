package technofutur.Java;

public class Cars {
    public Cars(String brand, String energy, int nbPlace, int prix) {
        this.brand = brand;
        this.energy = energy;
        this.nbPlace = nbPlace;
        this.prix = prix;
    }

    String brand;
    String energy;
    int nbPlace;
    int prix;

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", energy='" + energy + '\'' +
                ", nbPlace=" + nbPlace +
                ", prix=" + prix +
                '}';
    }


}
