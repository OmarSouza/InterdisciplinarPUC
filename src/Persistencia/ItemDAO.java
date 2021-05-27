package Persistencia;

import Model.Item;
import java.util.ArrayList;
import java.util.List;

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
        
            public boolean validarUsuario(Funcionario funcionario) throws Exception {
        try {
            
            List<Funcionario> funcionarioLista = findAll();
            for(Funcionario func : funcionarioLista){
                if(func.getLogin().equals(funcionario.getLogin()) && func.getSenha().equals(funcionario.getSenha())){
                    System.out.println(funcionario.getLogin() + "" + funcionario.getSenha());
                    return true;
                }
            }
            
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
