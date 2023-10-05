package technofutur.Java.Exo_OO.NewEx.Ex8;

public class Calculateur implements ICalculer, IAfficher {

    private int nbr1;
    private int nbr2;

    public Calculateur(int nbr1, int nbr2) {
        this.nbr1 = nbr1;
        this.nbr2 = nbr2;
    }

    @Override
    public void afficher() {
        System.out.printf("Voici le résultat: %s", calculer());
    }

//    @Override
//    public int calculer() {
//        return 0;
//    }

    @Override
    public int calculer() {
        return nbr1 + nbr2;
    }

    @Override
    public int calculer(int nbr1, int nbr2) {
        return nbr1 + nbr2;
    }
}
