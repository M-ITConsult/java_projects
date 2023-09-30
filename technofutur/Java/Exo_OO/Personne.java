package technofutur.Java.Exo_OO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Personne {

    public Personne(String nom, String prenom, String dateNaissanceStr) {
        this.nom = nom;
        this.prenom = prenom;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.datenaissance = LocalDate.parse(dateNaissanceStr, formatter);
    }

    private String nom;
    private String prenom;
    public LocalDate datenaissance;

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


