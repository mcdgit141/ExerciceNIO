package DAOFACTORYJ2EHIBERNATEwithPostgres.daofactory.com.daofactory;

import com.daointerface.DaoProduitImpl;
import com.daointerface.IProduitsDao;
import com.entity.Produit;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DaoFactory {
    SessionFactory sessionfactory= buildSessionFactory(Produit.class);

    public static SessionFactory buildSessionFactory(Class clazz) {
        // TODO Auto-generated method stub
        return new Configuration()
                .configure("Hibernate.cfg.xml")
                .addAnnotatedClass(clazz)
                .buildSessionFactory();
    }
    public static IProduitsDao getProduitDao(){
        return new DaoProduitImpl();
    }

}
