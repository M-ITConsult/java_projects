package technofutur.Java.Exo_OO.NewEx.Ex2;

public class Voiture {
    private String marque;
    private String model;
    private int nbPorte;
    private String couleur;
    private int nbChevaux;
    private boolean roule;

    public Voiture(String marque, String model, int nbPorte, String couleur, int nbChevaux, boolean roule) {
        this.marque = marque;
        this.model = model;
        this.nbPorte = nbPorte;
        this.couleur = couleur;
        this.nbChevaux = nbChevaux;
        this.roule = roule;
    }

    public String getMarque() {
        return marque;
    }

    public String getModel() {
        return model;
    }

    public int getNbPorte() {
        return nbPorte;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getNbChevaux() {
        return nbChevaux;
    }

    public boolean isRoule() {
        return roule;
    }
}
