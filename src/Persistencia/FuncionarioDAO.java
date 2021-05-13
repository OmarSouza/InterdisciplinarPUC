package Persistencia;

import Model.Funcionario;
import java.util.ArrayList;


public class FuncionarioDAO extends AbstractFuncionarioDAO{
    
    //Inicio Singleton
    private static FuncionarioDAO instance;
    
    private FuncionarioDAO(){
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

        } catch (Exception e) {
        }
    }

    @Override
    public int update(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Funcionario funcionario) {
        try {
        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList<Funcionario> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
