package Persistencia;

import Model.Item;
import java.util.ArrayList;

public class ItemDAO extends AbstractItemDAO {

	//Inicio Singleton
	private static ItemDAO instance;

	private ItemDAO(){

	}

	public static ItemDAO getInstance(){
		if(instance == null){
			instance = new ItemDAO();
		}

		return instance;
	}

	//Finlização Singleton

	@Override
	public int insert(Item item){
		return 0;
	}

	@Override
	public int update(Item item){
		return 0;
	}

	@Override
	public int delete(Item item){
		return 0;
	}

	@Override
	public ArrayList<Item> findAll(){
		
	}
}
