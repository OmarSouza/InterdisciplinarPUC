package Persistencia;

import Model.Venda;
import java.util.ArrayList;

public abstract class AbstractVendaDAO {
    public abstract int insert(Venda venda);
    
    public abstract int update(Venda venda);
    
    public abstract int delete(Venda venda);
    
    public abstract ArrayList<Venda> findAll();
}
