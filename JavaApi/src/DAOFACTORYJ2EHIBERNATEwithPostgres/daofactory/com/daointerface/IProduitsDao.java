package DAOFACTORYJ2EHIBERNATEwithPostgres.daofactory.com.daointerface;

import com.entity.Produit;

import java.util.List;

public interface IProduitsDao {
    //permet l'enregistrement dans la base H2
    void create(Produit produit);

    // permet de récupérer une voiture dans une base de donnée
    Produit findSingleProduit(Long id);

    // permet de faire une requête sécifique Hibernate sur la base de donnée en passant par l'objet

    List<Produit> getAllProduits();

    List<Produit> findProduitByName(String name);


}
