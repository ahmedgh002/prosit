import java.time.LocalDateTime;
import java.util.Date;

public class Produit {
    private int identifiant;
    private String lib;
    private String marque;
    private double prix;
    private Date date_exp;

    public Date getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Produit() {
    }

    public Produit(int identifiant, String lib, String marque) {
        this.identifiant = identifiant;
        this.lib = lib;
        this.marque = marque;
    }

    public Produit(int identifiant, String lib, String marque, double prix) {
        this.identifiant = identifiant;
        this.lib = lib;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit(int identifiant, String lib, String marque, double prix, Date date_exp) {
        this.identifiant = identifiant;
        this.lib = lib;
        this.marque = marque;
        this.prix = prix;
        this.date_exp = date_exp;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", lib='" + lib + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }

    public boolean comparer(Produit P) {
        boolean b = false;
        if(this.identifiant ==P.identifiant && this.lib.equals(P.lib) && this.prix==P.prix)
            b = true;
        return b;
    }

    public static boolean comparer(Produit P1, Produit P2) {
        boolean b = false;
        if(P1.identifiant ==P2.identifiant && P1.lib.equals(P2.lib) && P1.prix==P2.prix)
            b = true;
        return b;
    }

}
