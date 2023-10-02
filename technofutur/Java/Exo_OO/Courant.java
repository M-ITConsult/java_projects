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
        return ligneDeCredit;
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
}
