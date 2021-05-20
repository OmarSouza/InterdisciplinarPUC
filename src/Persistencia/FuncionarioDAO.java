package Persistencia;

import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;




public class FuncionarioDAO extends AbstractFuncionarioDAO{   

    private SessionFactory factory;
    
    private static FuncionarioDAO instance;
    private Object manager;
    
    private FuncionarioDAO(){
        factory = new Configuration().configure().buildSessionFactory();
    }

    public static FuncionarioDAO getInstance(){
        if(instance == null){
            instance = new FuncionarioDAO();
        }
        
        return instance;
    }

    //Finalização Singleton

    @Override
    public int insert(Funcionario funcionario) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(funcionario);
            session.getTransaction().commit();
            session.close();
            return 1;
        } 
        catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int update(Funcionario funcionario) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.update(funcionario);
            session.getTransaction().commit();
            session.close();
            return 1;
        } 
        catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int delete(Funcionario funcionario) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.delete(funcionario);
            session.getTransaction().commit();
            session.close();
            return 1;
        } 
        catch (Exception e) {
            return 0;
        }
    }

    @Override
    public ArrayList<Funcionario> findAll() {
        try {
            Session session = factory.openSession();
            List<Funcionario> funcionarioLista = session.createQuery("FROM " + Funcionario.class.getName()).list();
            return new ArrayList<>(funcionarioLista);
        } 
        catch (Exception e) {
            return null;
        }
    }
    
    public Funcionario verificaLogin(String login, String senha){
        System.out.println("login travou");
        try {
            Session session = factory.openSession();
            session.getTransaction();
            Query query = session.createQuery("SELECT func FROM Funcionario func where func.login =:login AND func.senha =: senha");
            query.setParameter("login", login);
            query.setParameter("senha", senha);
            return (Funcionario)query.uniqueResult();
        } 
        catch (Exception e) {
            return null;
        }
        
    }       
           
}
