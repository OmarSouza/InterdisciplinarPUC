/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Funcionario;

/**
 *
 * @author guuil
 */
public class ControllerLoginFuncionario {
    
    public TratamentoRetorno verificarLogin(String usuario, String senha){
        if(usuario == null || usuario.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Usuario não preenchido");
            return tratamento;
        }
        
        if(senha == null || senha.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Senha não preenchida");
            return tratamento;
        }
        
        Funcionario func = new Funcionario(usuario, senha);
        
        
        if(func.verificaLogin() == null){
            TratamentoRetorno tratamento = new TratamentoRetorno(true, "Login Invalido.");
            return tratamento;
        }
        
        TratamentoRetorno tratamento = new TratamentoRetorno(true, "Login Realizado com Sucesso.");
        return tratamento;
    }
    
}
