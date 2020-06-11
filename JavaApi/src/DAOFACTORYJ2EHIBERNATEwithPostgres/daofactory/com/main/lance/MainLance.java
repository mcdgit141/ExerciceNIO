package DAOFACTORYJ2EHIBERNATEwithPostgres.daofactory.com.main.lance;

import com.daofactory.DaoFactory;
import com.daointerface.IProduitsDao;
import com.entity.Produit;

import java.util.List;

public class MainLance {
    public static void main(String[] args) {

        Produit p1 = new Produit();
        p1.setNom("ChaineHifi4");
        p1.setCode("ChaineHificode4");
        p1.setDescription("creationdupremierproduit4");
        p1.setCodeBarre(123456789l);

        IProduitsDao iproduitdao= DaoFactory.getProduitDao();//objet réel via de type interface pour être evolutif

        iproduitdao.create(p1);

        Produit produitFromDB= iproduitdao.findSingleProduit(1l);
        System.out.println("Affiche----" + produitFromDB.getNom());

        List<Produit> listproduit = iproduitdao.getAllProduits();
        System.out.println("nom | description  | code  | codeBarre");
        for (Produit p:listproduit) {
            System.out.print(p.getNom());
            System.out.print(" | ");
            System.out.print(p.getDescription());
            System.out.print(" | ");
            System.out.print(p.getCode());
            System.out.print(" | ");
            System.out.print(p.getCodeBarre());
            System.out.print(" | ");
        }
        List<Produit> listproduitName = iproduitdao.findProduitByName("ChaineHifi");
        System.out.println("nom | description  | code  | codeBarre");
        for (Produit p:listproduitName) {
            System.out.print(p.getNom());
            System.out.print(" | ");
        }
    }
}
