package Persistencia;

import Model.Funcionario;
import java.util.ArrayList;

//Implementação dos metodos abstratos para utilização do funcionario.

public abstract class AbstractFuncionarioDAO {
    public abstract int addFuncionario(Funcionario funcionario);
    
    public abstract int atualizarCadastro(Funcionario funcionario);
    
    public abstract int removerFuncionario(Funcionario funcionario);
    
    public abstract ArrayList<Funcionario> findAll();
}
