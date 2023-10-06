public class Employe {
    protected int identifiant;

    protected String nom;

    protected String adresse;

    protected double nb_heures;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getNb_heures() {
        return nb_heures;
    }

    public void setNb_heures(double nb_heures) {
        this.nb_heures = nb_heures;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "employé{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nb_heures=" + nb_heures +
                '}';
    }
}
