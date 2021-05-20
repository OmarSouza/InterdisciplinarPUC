/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Persistencia.FuncionarioDAO;
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
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Column
    private String nome;
    @Column
    private String CPF;
    @Column
    private String dataNasc;
    @Column
    private String cargo;
    @Column
    private String email;
    @Column
    private String endereco;
    @Column
    private String telefone;
    @Column
    private String login;
    @Column
    private String senha;
    @Column
    private Integer numero;
    @Column
    private String bairro;

    public Funcionario(String dataNasc, String cargo, String email, String endereco, String telefone, String login, String senha, String nome, String cpf, Integer numero, String bairro) {
        this.nome = nome;
        this.CPF = cpf;
        this.dataNasc = dataNasc;
        this.cargo = cargo;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Funcionario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public Funcionario(){
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public int insert(){
        return FuncionarioDAO.getInstance().insert(this);
    }
    
    public int update(){
        return FuncionarioDAO.getInstance().update(this);
    }
    
    public int delete(){
        return FuncionarioDAO.getInstance().delete(this);
    }
    
    public static ArrayList<Funcionario> findAll(){
        return FuncionarioDAO.getInstance().findAll();
    }
    
    public Funcionario verificaLogin(){
        return FuncionarioDAO.getInstance().verificaLogin(login, senha);
    }
}