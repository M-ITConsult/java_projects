package technofutur.Java.Exo_OO;
import java.util.HashMap;

public class Banque {
    public Banque(String name) {
        this.name = name;
    }

    private String name;
    private static HashMap<String, Courant> comptes = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompte() {

        return 0;
    }

    public void setCompte(int compte) {

    }

    public static void Ajouter(Courant compte) {
        comptes.put(compte.getNumero(),compte);
    }

    public void Supprimer(String numero){
        Courant compte = comptes.get(numero);
        if(compte != null) {
            comptes.remove(numero);
        }
    }
}
