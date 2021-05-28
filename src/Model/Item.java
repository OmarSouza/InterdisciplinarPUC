/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistencia.ItemDAO;
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

// construir pilha
@Entity
public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String marca;
    @Column 
    private String nome;
    @Column
    private Double valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Item(String marca, String nome, Double valor) {
        this.marca = marca;
        this.nome = nome;
        this.valor = valor;
    }
    
    public int insert(){
        return ItemDAO.getInstance().insert(this);
    }
    
    public int update(){
        return ItemDAO.getInstance().update(this);
    }
    
    public int delete(){
        return ItemDAO.getInstance().delete(this);
    }
    
    public static ArrayList<Item> findAll(){
        return ItemDAO.getInstance().findAll();
    }
}
