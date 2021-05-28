package Persistencia;

import Model.Funcionario;
import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProdutoDAO extends AbstractProdutoDAO {
    
    //Inicio Singleton e Conexão com Banco
    private SessionFactory factory;
    
    private static ProdutoDAO instance;
    
    private ProdutoDAO(){
        factory = new Configuration().configure().buildSessionFactory();
    }
    
    public static ProdutoDAO getInstance(){
        if(instance == null){
            instance = new ProdutoDAO();
        }
        
        return instance;
    }
    
    //Finalização.

    @Override
    //Metodo de inserir produtos na tabela produto
    public int cadastrarProdutos(Produto produto) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(produto);
            session.getTransaction().commit();
            session.close();
            return 1;
        } 
        catch (Exception e) {
            return 0;
        }
    }

    @Override
    //Metodo de update da tabela produto.
    public int update(Produto produto) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.update(produto);
            session.getTransaction().commit();
            session.close();
            return 1;
        } 
        catch (Exception e) {
            return 0;
        }
    }

    @Override
    //Metodo de deletar da tabela produto.
    public int delete(Produto produto) {
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.delete(produto);
            session.getTransaction().commit();
            session.close();
            return 1;
        } 
        catch (Exception e) {
            return 0;
        }
    }

    @Override
    //Metodo de implementação de um ArrayList findAll.
    public ArrayList<Produto> findAll() {
        try {
            Session session = factory.openSession();
            List<Produto> produtoLista = session.createQuery("FROM " + Produto.class.getName()).list();
            return new ArrayList<>(produtoLista);
        } 
        catch (Exception e) {
            return null;
        }
    }
    
        public boolean procurarProduto(Produto produto) throws Exception {
        try {
            
            List<Produto> produtoLista = findAll();
            for(Produto prod : produtoLista){
                if(produto.getCodBarras() == prod.getCodBarras()){    
                    return true;
                }
            }
            return false;
        } catch (Exception ex) {
            throw new Exception("Erro ao verificar o usúario");
        }
    }
        
        
    
    
}
