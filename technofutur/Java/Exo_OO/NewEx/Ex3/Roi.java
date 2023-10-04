package technofutur.Java.Exo_OO.NewEx.Ex3;

public class Roi {
    int nbCase;
    void seDeplacer(){
        System.out.printf("Le Roi se déplace de %s case%n", nbCase);
    }

    public void setNbCase(int nbCase) {
        this.nbCase = nbCase;
    }
}
