/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author guuil
 */
public class Produto {
    private String nomeProduto;
    private String marca;
    private int estoque;
    private long codBarras;
    private double preço;

    public Produto(String nomeProduto, String marca, int estoque, long codBarras, double preço) {
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.estoque = estoque;
        this.codBarras = codBarras;
        this.preço = preço;
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

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
    public void cadastrarProduto(){
        //banco de dados
    }
}
