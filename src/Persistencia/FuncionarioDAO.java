package Persistencia;

import Model.Funcionario;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FuncionarioDAO extends AbstractFuncionarioDAO{
    
    private SessionFactory factory;
    
    //Inicio Singleton
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
    public int insert(Funcionario funcionario) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(funcionario);
            session.getTransaction().commit();
            session.close();
            return 1; //retornou com sucesso
        } catch (Exception e) {
            return 0; //retornou com problema
        }
    }

    @Override
    public int update(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Funcionario funcionario) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.delete(funcionario);
            session.getTransaction().commit();
            session.close();
            return 1; //retornou com sucesso
        } catch (Exception e) {
            return 0; //retornou com problema
        }
    }

    @Override
    public ArrayList<Funcionario> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
