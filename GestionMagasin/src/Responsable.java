public class Responsable extends Employe {
    private double prime;

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public Responsable(int identifiant, String nom, String adresse, double nb_heures,double prime) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heures = nb_heures;
        this.prime = prime;
    }

}
