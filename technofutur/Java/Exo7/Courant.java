package technofutur.Java.Exo7;

public class Courant extends Compte {

    public Courant(String numero, double ligneDeCredit, Personne titulaire) {
        super(numero, titulaire);
        this.ligneDeCredit = ligneDeCredit;
    }

    private double ligneDeCredit;


    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        if(ligneDeCredit >= 0) {
            this.ligneDeCredit = ligneDeCredit;
        }
    }

    @Override
    public void retrait(double montant){
        retrait(montant, ligneDeCredit);

    }

    @Override
    protected double calculInteret() {
        // Ternaire (condition) ? si condition : else condition;
        return (this.getSolde() < 0) ? this.getSolde() * .0975 : this.getSolde() * .03;
    }
}
