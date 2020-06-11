package DAOFACTORYJ2EHIBERNATEwithPostgres.daofactory.com.daointerface;

import com.daofactory.DaoFactory;
import com.entity.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DaoProduitImpl implements IProduitsDao{
    public void create(Produit produitAEnregistrer) {
        SessionFactory sessionFactory = DaoFactory.buildSessionFactory(Produit.class);
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        // si on passe par un serveur d'application => session.getTransaction().begin();
        session.save(produitAEnregistrer);
        session.getTransaction().commit(); // on passe par le getTransaction car on a déjà la transaction
        session.close();
    }

    public Produit findSingleProduit(Long id) {
        SessionFactory sessionFactory = DaoFactory.buildSessionFactory(Produit.class);
        Session session = sessionFactory.openSession();
        Produit produitFromDB = session.find(Produit.class, id);
        session.close();
        return produitFromDB;
    }

    // code specifique Hibernate pour rechercher via la classe objet du Java
    public List<Produit> getAllProduits() {
        SessionFactory sessionFactory = DaoFactory.buildSessionFactory(Produit.class);
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        List<Produit> result = session.createQuery("from Produit").list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    // code specifique JPA en SQL JPQL
    public List<Produit> findProduitByName(String name) {
        SessionFactory sessionFactory = DaoFactory.buildSessionFactory(Produit.class);
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        List<Produit> listname = session
                .createQuery("select p from Produit p where p.nom = :nomAttendu")
                .setParameter("nomAttendu", name)
                .list();
        session.getTransaction().commit();
        session.close();
        return listname;
    }
}
