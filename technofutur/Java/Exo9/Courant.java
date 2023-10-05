package technofutur.Java.Exo9;

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
    public void retrait(double montant) throws ExceptionPhrase {
        retrait(montant, ligneDeCredit);
    }

    @Override
    protected double CalculInteret()
    {
        return (getSolde() < 0) ? getSolde() * .0975 : getSolde() * .03;
    }
}
