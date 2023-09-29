package technofutur.Java.Exo_OO;

public class Courant {

    public Courant(String numero, double solde, double ligneDeCredit, Personne titulaire) {
        this.numero = numero;
        this.solde = solde;
        this.ligneDeCredit = ligneDeCredit;
        this.titulaire = titulaire;

    }

    private String numero;
    private Double solde;
    private Double ligneDeCredit;
    private Personne titulaire;

    // Guetter and Setter
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Double getLigneDeCredit() {
        if(ligneDeCredit >= 0) {
            return ligneDeCredit;
        } else {
            System.out.println("Veuillez réassayer.");
        }
        return null;
    }

    public void setLigneDeCredit(Double ligneDeCredit) {

        this.ligneDeCredit = ligneDeCredit;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    public void retrait(double montant) {
            if(montant > 0){
              if(montant <= solde + ligneDeCredit){
                  solde -= montant;
                }
            }
    }

    public void depot(double montant) {
//            if(montant <= 0)
//                System.out.println("Pas de possibilités de retrait");
//
//            if(solde - montant < -ligneDeCredit)
//                System.out.println("");
//
//            solde -= montant;
        if(montant > 0) {
            solde += montant;
        }
    }
}
