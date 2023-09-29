package technofutur.Java;

public class MainOO {
    public static void main(String[] args) {
        // MethodeOO methode = new MethodeOO();
        Animal animal1 = new Animal("", "", 0,false);

        animal1.name = "Dog";
        animal1.race = "Asutralien";
        animal1.taille = 200;

        System.out.println(animal1.name+"\n"+animal1.taille+"\n"+animal1.race+"\n"+animal1.sauvage);

    }
}