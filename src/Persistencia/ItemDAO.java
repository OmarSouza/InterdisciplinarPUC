package Persistencia;

import Model.Item;
import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ItemDAO extends AbstractItemDAO {

    //Inicio Singleton
    private static ItemDAO instance;

    private SessionFactory factory;

    private ItemDAO() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public static ItemDAO getInstance() {
        if (instance == null) {
            instance = new ItemDAO();
        }

        return instance;
    }

    //Finlização Singleton
    @Override
    public int insert(Item item) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(item);
            session.getTransaction().commit();
            session.close();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int update(Item item) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.update(item);
            session.getTransaction().commit();
            session.close();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int delete(Item item) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.delete(item);
            session.getTransaction().commit();
            session.close();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public ArrayList<Item> findAll() {
        try {
            Session session = factory.openSession();
            List<Item> itemLista = session.createQuery("FROM " + Item.class.getName()).list();
            return new ArrayList<>(itemLista);
        } catch (Exception e) {
            return null;
        }
    }
}
