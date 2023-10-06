public class Vendeur extends Employe{
    private double tauxDeVente;

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    public Vendeur(int identifiant, String nom, String adresse, double nb_heures,double tauxDeVente) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heures = nb_heures;
        this.tauxDeVente = tauxDeVente;
    }
}
