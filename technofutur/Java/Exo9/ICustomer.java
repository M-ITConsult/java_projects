package technofutur.Java.Exo9;

public interface ICustomer {
    double getSolde();
    void depot(double Montant);
    void retrait(double Montant) throws ExceptionPhrase;
}
