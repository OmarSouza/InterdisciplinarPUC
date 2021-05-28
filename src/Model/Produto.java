/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistencia.ProdutoDAO;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author guuil
 */
@Entity
public class Produto {
    
    @Id
    private long codBarras;
    @Column
    private String nomeProduto;
    @Column
    private String marca;
    @Column
    private int estoque;
    @Column
    private Double preco;

    public Produto() {
        
    }

    public Produto(long codBarras) {
        this.codBarras = codBarras;
    }
    
    

    public Produto(long codBarras, String nomeProduto, String marca, double preco, int estoque) {
        this.codBarras = codBarras;
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public long getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(long codBarras) {
        this.codBarras = codBarras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preço) {
        this.preco = preço;
    }
    
    public int insert(){
        return ProdutoDAO.getInstance().cadastrarProdutos(this);
    }
    
    public int update(){
        return ProdutoDAO.getInstance().update(this);
    }
    
    public int delete(){
        return ProdutoDAO.getInstance().delete(this);
    }
    
    public static ArrayList<Produto> findAll(){
        return ProdutoDAO.getInstance().findAll();
    }
    
        public boolean validarProduto() throws Exception{
        return ProdutoDAO.getInstance().procurarProduto(this);
    }
}
