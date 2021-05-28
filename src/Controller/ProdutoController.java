/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omars
 */
public class ProdutoController {
    public TratamentoRetorno verificarProduto(String codBarras, String marca, String nome, String valor, String estoque){
        if(codBarras == null || codBarras.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Codigo de Barras não preenchido.");
            return tratamento;
        }
        
        if(nome == null || nome.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Nome não preenchido.");
            return tratamento;
        }
        
        if(marca == null || marca.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Marca não preenchido.");
            return tratamento;
        }
        
        if(valor == null || valor.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Valor não preenchido.");
            return tratamento;
        }
        
        if(estoque == null || estoque.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Estoque não preenchido.");
            return tratamento;
        }
        
        long codBarrasLong;
        
        try {
            codBarrasLong = Long.parseLong(codBarras);
        } catch (Exception e) {
            return new TratamentoRetorno(false, "Codigo de Barras não preenchido com valor numerico.");
        }
        
        double valorDouble;
        
        try {
            valorDouble = Double.parseDouble(valor);
        } catch (Exception e) {
            return new TratamentoRetorno(false, "Valor não preenchido com valor numerico.");
        }
        
        int estoqueInt;
        
        try {
            estoqueInt = Integer.parseInt(estoque);
        } catch (Exception e) {
            return new TratamentoRetorno(false, "Estoque não preenchido com valor numerico.");
        }
        
        Produto produto = new Produto(codBarrasLong, marca, nome, valorDouble, estoqueInt);
        int resultado = produto.insert();
        
        if(resultado <= 0){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Cadastro Não Realizado!");
            return tratamento;
        }
        
        TratamentoRetorno tratamento = new TratamentoRetorno(false, "Cadastro Realizado!");
        return tratamento;
    }
    
    public void preencherTabelas(DefaultTableModel modelo){
        modelo.setNumRows(0);
        
        for(Produto produto : Produto.findAll()){
            modelo.addRow(new Object[]{produto.getCodBarras(), produto.getMarca(), produto.getNomeProduto(), produto.getPreço(), produto.getEstoque()});
        }
    }
    
    public TratamentoRetorno deletarCadastro(String codBarras){
        Produto produto = new Produto();
        produto.setCodBarras(Long.parseLong(codBarras));
        
        int resultado = produto.delete();
        
        if(resultado < 0){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Não foi possivel deletar produto.");
            return tratamento;
        }
        
        TratamentoRetorno tratamento = new TratamentoRetorno(true, "Deletado com Sucesso");
        return tratamento;
    }
    
    public TratamentoRetorno atualizarCadastro(String codBarras, String marca, String nome, String valor, String estoque){
        if(codBarras == null || codBarras.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Codigo de Barras não preenchido.");
            return tratamento;
        }
        
        if(nome == null || nome.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Nome não preenchido.");
            return tratamento;
        }
        
        if(marca == null || marca.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Marca não preenchido.");
            return tratamento;
        }
        
        if(valor == null || valor.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Valor não preenchido.");
            return tratamento;
        }
        
        if(estoque == null || estoque.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Estoque não preenchido.");
            return tratamento;
        }
        
        long codBarrasLong;
        
        try {
            codBarrasLong = Long.parseLong(codBarras);
        } catch (Exception e) {
            return new TratamentoRetorno(false, "Codigo de Barras não preenchido com valor numerico.");
        }
        
        double valorDouble;
        
        try {
            valorDouble = Double.parseDouble(valor);
        } catch (Exception e) {
            return new TratamentoRetorno(false, "Valor não preenchido com valor numerico.");
        }
        
        int estoqueInt;
        
        try {
            estoqueInt = Integer.parseInt(estoque);
        } catch (Exception e) {
            return new TratamentoRetorno(false, "Estoque não preenchido com valor numerico.");
        }
        
        Produto produto = new Produto(codBarrasLong, marca, nome, valorDouble, estoqueInt);
        int resultado = produto.update();
        
        if(resultado <= 0){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Alteração Não Realizada!");
            return tratamento;
        }
        
        TratamentoRetorno tratamento = new TratamentoRetorno(false, "Alteração Realizada!");
        return tratamento;
    }
}
