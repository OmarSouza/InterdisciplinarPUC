/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author omars
 */
public class ProdutoController {
    public TratamentoRetorno verificarProduto(String nomeProduto, String marca, int estoque, long codBarras, double preço){
        if(nomeProduto == null || nomeProduto.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Nome do produto não foi preenchido.");
            return tratamento;
        }
        
        if(marca == null || marca.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Marca do produto não foi preenchido.");
            return tratamento;
        }
        
        if(estoque < 0){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Não é possivel botar estoque menor que 0.");
            return tratamento;
        }
        
        //Definir o tratametno do codigo de barras e preço.
        return null;
    }
}
