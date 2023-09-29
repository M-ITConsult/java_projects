package technofutur.Java.Exo_OO;
import java.time.LocalDate;

public class Personne {

    private String nom;
    private String prenom;
    private LocalDate datenaissance;

    // Guetter and Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(LocalDate datenaissance) {
        this.datenaissance = datenaissance;
    }
}
