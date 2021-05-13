package Persistencia;

import Model.Produto;
import java.util.ArrayList;

public abstract class AbstractProdutoDAO {
    public abstract int insert(Produto produto);
    
    public abstract int update(Produto produto);
    
    public abstract int delete(Produto produto);
    
    public abstract ArrayList<Produto> findAll();
}
