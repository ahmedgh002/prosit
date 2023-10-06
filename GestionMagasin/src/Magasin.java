import java.util.Arrays;

public class Magasin {
    private int identifiant;
    private String adresse;

    private String lib;

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public Produit[] getTabProd() {
        return tabProd;
    }

    public void setTabProd(Produit[] tabProd) {
        this.tabProd = tabProd;
    }

    final int capacite = 50;

    Produit[] tabProd = new Produit[capacite];

    int nbProduitActuel;
    private Employe[] employees;
    final int nbMaxEmp = 20;
    private int nb_employés;

    public Employe[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employe[] employees) {
        this.employees = employees;
    }

    public int getNbMaxEmp() {
        return nbMaxEmp;
    }

    public int getNb_employés() {
        return nb_employés;
    }

    public void setNb_employés(int nb_employés) {
        this.nb_employés = nb_employés;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public Produit[] gettabProd() {
        return tabProd;
    }

    public void settabProd(Produit[] tabProd) {
        this.tabProd = tabProd;
    }

    public int getNbProduitActuel() {
        return nbProduitActuel;
    }

    public void setNbProduitActuel(int nbProduitActuel) {
        this.nbProduitActuel = nbProduitActuel;
    }

    public Magasin(int identifiant, String adresse, String lib) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.lib = lib;
    }

    public Magasin(int identifiant, String adresse, Produit[] tabProd, int nbProduitActuel) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.tabProd = tabProd;
        this.nbProduitActuel = nbProduitActuel;
    }

    public Magasin() {
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + capacite +
                ", tabProd=" + Arrays.toString(tabProd) +
                ", nbProduitActuel=" + nbProduitActuel +
                '}';
    }

    public void AfficheMagasin() {
        System.out.println("identifiant :" + this.identifiant + "adresse :" + adresse);
        for (int i = 0; i < nbProduitActuel; i++) {

            System.out.println("Marque :" + tabProd[i].getMarque());
            System.out.println("libelle :" + tabProd[i].getLib());
            System.out.println("date :" + tabProd[i].getDate_exp());
            System.out.println("prix :" + tabProd[i].getPrix());
            System.out.println("Identifiant :" + tabProd[i].getIdentifiant());

        }
    }

    public void AjoutProduit(Produit p) {
        if (nbProduitActuel < capacite && !(produitExiste(p, this))) {
            tabProd[nbProduitActuel] = p;
            System.out.println("Produit Ajouté avec succès!");
        } else {
            System.out.println("Magasin plein!");
        }
    }

    public boolean produitExiste(Produit p, Magasin m) {
        int n = m.getCapacite();
        boolean b = false;
        int i = 0;
        Produit[] produits = m.gettabProd();
        while (i < n && !b) {
            if (Produit.comparer(produits[i], p))
                b = true;
            else
                i++;
        }
        return b;
    }

    /*public void supprimeProduit(Produit p) {
        if(produitExiste(p, this)) {
            int indiceProduit =0 ;
            for(int i=0; i<nbProduitActuel; i++) {
                if (p.comparer(p)) {
                    indiceProduit = i;
                }
            }
            for(int j = indiceProduit; j<nbProduitActuel;j++){

            }
        }
        else {
            system
        }
    }*/
    public Magasin magasinSup(Magasin m1, Magasin m2) {
        if (m1.getNbProduitActuel() > m2.getNbProduitActuel()) {
            return m1;
        } else  {
            return m2;
        }
    }

    public void ajouterEmploye(Employe emp) {
        if (nb_employés<20){
            employees[nb_employés] = emp;
            nb_employés++;}
        else {
            System.out.println("nombre d employes saturé!");}
    }
}
