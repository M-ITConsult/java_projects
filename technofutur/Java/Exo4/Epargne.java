package technofutur.Java.Exo4;

import java.time.LocalDate;


public class Epargne extends Compte{

    public Epargne(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    private LocalDate dateDernierRetrait ;


    public LocalDate getDateDernierRetrait() {
        return dateDernierRetrait ;
    }

    public void setDateDernierRetrait(LocalDate dateDernierRetrait ) {
            this.dateDernierRetrait  = dateDernierRetrait ;
    }

    @Override
    public void retrait(double montant){
        double AncientSolde = super.getSolde();
        super.retrait(montant);

        if (this.getSolde() != AncientSolde)
        {
            dateDernierRetrait = LocalDate.now();
        }
    }

}
