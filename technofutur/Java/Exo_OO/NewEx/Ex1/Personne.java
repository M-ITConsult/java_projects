package technofutur.Java.Exo_OO.NewEx.Ex1;
import java.time.LocalDate;
import java.time.Period;

public class Personne {

    private String nom;
    private String prenom;
    private String mail;
    private LocalDate dateNaiss;

//    public Personne(String nom, String prenom, String mail, LocalDate dateNaiss) {
//        this.nom = nom;
//        this.prenom = prenom;
//        this.mail = mail;
//        this.dateNaiss = dateNaiss;
//    }

    void sePresenter(){
        LocalDate dob = dateNaiss;
        LocalDate curDate = LocalDate.now();
        Period period = Period.between(dob, curDate);
        System.out.printf("Bonjour je suis %s %s et j'ai %s ans",nom, prenom, period.getYears());
    }

    // Getter and Setter
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
}
