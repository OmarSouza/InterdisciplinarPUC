package Controller;

import Model.Funcionario;

public class FuncionarioController {
    public TratamentoRetorno cadastrarFuncionario(String dataNasc, String cargo, String email, String endereco, String telefone, String login, String senha, String nome, String cpf, int numero, String bairro){
        
        //Tratamento preenchimento campo Nome.
        if(nome == null || nome.isEmpty()){ 
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o campo nome.");
            return tratamento;
        }
        
        //Tratamento tamanho campo Nome.
        if(nome.length() < 4){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o Nome corretamente.");
            return tratamento;
        }
        
        //Tratamento preenchimento campo CPF.
        if(cpf == null || cpf.isEmpty()){ 
            // Tratamento do campo CPF.
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o campo CPF.");
            return tratamento;
        }
        
        //Tratamento tamanho campo CPF.
        if(cpf.length() < 11){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o CPF corretamente.");
            return tratamento;
        }
        
        //Tratamento preenchimento campo Login.
        if(login == null || login.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o campo Login.");
            return tratamento;
        }
        
        //Tratamento tamanho campo Login
        if(login.length() < 5){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Tamanho minimo de login requerido: 5 caracteres.");
            return tratamento;
        }
        
        //Tratamento preenchimento do campo Senha.
        if(senha == null || senha.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o campo senha.");
            return tratamento;
        }
        
        //Tratamento tamanho do campo Senha.
        if(senha.length() < 8){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Tamanho minimo da senha requirida: 8 caracteres.");
            return tratamento;
        }
        
        //Tratamento preenchimento do campo Telefone.
        if(telefone == null || telefone.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o campo Telefone.");
            return tratamento;
        }
        
        //Tratamento tamanho do campo Telefone.
        if(telefone.length() < 11){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha corretamente o Telefone.");
            return tratamento;
        }
        
        //Tratamento preenchimento do campo Data Nascimento
        if(dataNasc == null || dataNasc.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o campo Data de Nascimento.");
            return tratamento;
        }
        
        //Tratamento tamanho do campo Data Nascimento
        if(dataNasc.length() < 8){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha corretamente a Data de Nascimento.");
            return tratamento;
        }
        
        //Tratamento preenchimento do campo Cargo.
        if(cargo == null || cargo.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o campo Cargo.");
            return tratamento;
        }
        
        //Tratamento preenchimento do campo Email.
        if(email == null || email.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o campo Email.");
            return tratamento;
        }
        
        //Tratamento verificar se Email contem @
        if(!email.contains("@")){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Campo Email invalido.");
            return tratamento;
        }
        
        //Tratamento preenchimento campo Endereço
        if(endereco == null || endereco.isEmpty()){
            TratamentoRetorno tratamento = new TratamentoRetorno(false, "Preencha o campo Endereco.");
            return tratamento;
        }
        
        
        
        TratamentoRetorno tratamento = new TratamentoRetorno(true, "Cadastro Realizado com Sucesso.");
        return tratamento;
    }
}
