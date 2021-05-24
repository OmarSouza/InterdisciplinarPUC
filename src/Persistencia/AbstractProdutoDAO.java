package Persistencia;

import Model.Produto;
import java.util.ArrayList;

//Implementação dos metodos abstratos para utilização da classe Produto.

public abstract class AbstractProdutoDAO {
    public abstract int cadastrarProdutos(Produto produto);
    
    public abstract int update(Produto produto);
    
    public abstract int delete(Produto produto);
    
    public abstract ArrayList<Produto> findAll();
}
