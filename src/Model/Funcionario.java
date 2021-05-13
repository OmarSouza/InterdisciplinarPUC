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

public class Funcionario extends Pessoa {
    private Integer ID;
    private String dataNasc;
    private String cargo;
    private String email;
    private String endereco;
    private String telefone;
    private String login;
    private String senha;

    public Funcionario(String dataNasc, String cargo, String email, String endereco, String telefone, String login, String senha, String nome, String cpf) {
        super(nome, cpf);
        this.dataNasc = dataNasc;
        this.cargo = cargo;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
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
}