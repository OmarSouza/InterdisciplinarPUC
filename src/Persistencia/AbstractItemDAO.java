package Persistencia;

import Model.Item;
import java.util.ArrayList;

public abstract class AbstractItemDAO {
    public abstract int insert(Item item);
    
    public abstract int update(Item item);
    
    public abstract int delete(Item item);
    
    public abstract ArrayList<Item> findAll();
}
