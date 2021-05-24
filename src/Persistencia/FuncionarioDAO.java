package Persistencia;

import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class FuncionarioDAO extends AbstractFuncionarioDAO{   

    private SessionFactory factory;
    
    private static FuncionarioDAO instance;
    
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
    public int addFuncionario(Funcionario funcionario) {
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
    public int atualizarCadastro(Funcionario funcionario) {
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
    public int removerFuncionario(Funcionario funcionario) {
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
}
