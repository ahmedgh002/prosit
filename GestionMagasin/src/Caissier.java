public class Caissier extends Employe{
    private int numeroDeCaisse;

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }
    public Caissier(int identifiant, String nom, String adresse, double nb_heures, int numeroDeCaisse) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heures = nb_heures;
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                '}';
    }
}
