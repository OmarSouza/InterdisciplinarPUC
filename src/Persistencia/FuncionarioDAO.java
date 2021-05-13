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
        return 0;
        
    }

    @Override
    public int update(Funcionario funcionario) {
        return 0;
    }

    @Override
    public int delete(Funcionario funcionario) {
        return 0;
    }

    @Override
    public ArrayList<Funcionario> findAll(){
        
    }
    
}
