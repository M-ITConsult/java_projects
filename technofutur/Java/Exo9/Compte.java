package technofutur.Java.Exo9;


public abstract class Compte implements IBanker, ICustomer {
    private Devise devise;

    public Compte(String numero , Personne titulaire) {
        this.numero = numero;
        this.solde = 0;
        this.titulaire = titulaire;
    }

    private String numero;

    public void setSolde(double solde) {
        this.solde = solde;
    }

    private double solde;
    private Personne titulaire;



    public String getNumero() {return numero; }

    public void setNumero(String numero) {this.numero = numero; }

    public double getSolde() {
        return solde;
    }

    public Personne getTitulaire() {return titulaire; }

    public void setTitulaire(Personne titulaire) { this.titulaire = titulaire; }


    public static double addSoldePositif(double solde, Compte c) {
        return solde + (c.getSolde() < 0.0 ? 0.0 : c.getSolde());
    }

    protected abstract double CalculInteret();

    public void changerDevise(Devise devise) {this.solde = devise.apply(this.solde);}

    public void retrait(double montant, double ligneDeCredit) throws ExceptionPhrase {

            if (montant <= 0)
                throw new ExceptionPhrase("Le montant doit être supérieur à zéro");

            if (montant > solde + ligneDeCredit)
                throw new ExceptionPhrase("Le montant doit être supérieur à zéro");

            solde -= montant;

        }

    @Override
    public void retrait(double montant) throws ExceptionPhrase {
        // Mise en place d'un try catch

            if (montant <= 0)
                throw new ExceptionPhrase("Le montant doit être supérieur à zéro");

            if (montant > solde)
                throw new ExceptionPhrase("Le montant doit être supérieur à zéro");

            solde -= montant;
    }

    @Override
    public void depot(double montant){
        if (montant <= 0)
            return; //à remplacer plus tard par une exception

        solde += montant;
    }

    @Override
    public void appliquerInteret()
    {
        solde += CalculInteret();
    }



}
