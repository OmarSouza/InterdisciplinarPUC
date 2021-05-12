package Persistencia;

import Model.Funcionario;
import java.util.ArrayList;

public abstract class AbstractFuncionarioDAO {
    public abstract int insert(Funcionario funcionario);
    
    public abstract int update(Funcionario funcionario);
    
    public abstract int delete(Funcionario funcionario);
    
    public abstract ArrayList<Funcionario> findAll();
}
