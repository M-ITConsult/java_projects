package technofutur.Java.Exo_OO.NewEx.Ex8;

public class Main {
    public static void main(String[] args) {
        Calculateur calculateur = new Calculateur(20,5);
        ICalculer calculer = new ICalculer() {
            @Override
            public int calculer() {
                return 0;
            }

            @Override
            public int calculer(int nbr1, int nbr2) {
                return nbr1+nbr2;
            }
        };


        System.out.println(calculer.calculer(20, 56));
        calculateur.afficher();
    }
}
