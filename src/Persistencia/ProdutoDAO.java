package Persistencia;

import Model.Produto;
import java.util.ArrayList;

public class ProdutoDAO extends AbstractProdutoDAO {

	//Inicio Singleton
	private static ProdutoDAO instance;

	private ProdutoDAO(){

	}

	public static ProdutoDAO getInstance(){
		if(instance == null){
			instance = new ProdutoDAO();
		}

		return instance;
	}

	//Finlização Singleton

	@Override
	public int insert(Produto produto){
		return 0;
	}

	@Override
	public int update(Produto produto){
		return 0;
	}

	@Override
	public int delete(Produto produto){
		return 0;
	}

	@Override
	public ArrayList<Produto> findAll(){
		
	}
}
