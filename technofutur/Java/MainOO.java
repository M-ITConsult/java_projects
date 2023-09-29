package technofutur.Java;

public class MainOO {
    public static void main(String[] args) {
        // MethodeOO methode = new MethodeOO();
        Animal animal1 = new Animal("", "", 0,false);
        Cars car1 = new Cars("", "", 0,0 ); // First car
        Cars car2 = new Cars("","",0,0); // Nouvelle voiture
        // Appel de la méthode Animal
        animal1.name = "Dog";
        animal1.race = "Asutralien";
        animal1.taille = 200;

        System.out.println(animal1.name+"\n"+animal1.taille+"\n"+animal1.race+"\n"+animal1.sauvage);

        // Appel de methode Cars
        car1.brand = "Tesla";
        car1.energy = "Electric";
        car1.nbPlace = 5;
        car1.prix = 100000;

        System.out.printf("La voiture de marque %s est %s, à %s places et le prix est de %s€", car1.brand, car1.energy, car1.nbPlace, car1.prix);

    }
}