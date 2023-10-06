// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit(1021, "Lait", "Delice");
        Produit p2 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p3 = new Produit(3250, "Tomate", "Sicam", 1.200);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        p1.setPrix(0.7);
        System.out.println(p1.toString());
        p2.setPrix(2.1);
        Date d1=new Date();
        p1.setDate_exp(d1);
        Magasin mcv = new Magasin(1,"Carrefour", "Centre-ville");
        Magasin mmz = new Magasin(2,"Monoprix","Menzah 6");
        Caissier c1m1 = new Caissier(1, "mohamed", "Tunis", 100, 5);
        Caissier c2m1 = new Caissier(2, "arij", "Tunis", 70, 7);
        Vendeur vm1 = new Vendeur(5, "anis", "siliana",150, 0.56);
        Responsable rm1 = new Responsable(6, "amina", "gabes", 120, 525.5);
        Vendeur v1m2 = new Vendeur(9, "anis", "siliana",150, 0.56);
        Vendeur v2m2 = new Vendeur(55, "ahmed", "tela",150, 0.56);
        Vendeur v3m2 = new Vendeur(144, "oussema", "sousse",150, 0.56);
        Responsable rm2 = new Responsable(78, "xyz", "monastir", 57, 8);

        /*mcv.addEmploye(c1m1);
        mcv.addEmploye(c2m1);

        mcv.addEmploye(rm1);

        mmz.addEmploye(v1m2);
        mmz.addEmploye(v2m2);
        mmz.addEmploye(v3m2);
        mmz.addEmploye(rm2);*/

    }
}