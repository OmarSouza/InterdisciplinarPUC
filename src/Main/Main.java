package Main;

import View.LoginCadastro.TelaDeLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omars
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaDeLogin telaLogin = new TelaDeLogin();
        telaLogin.setResizable(false);
        telaLogin.setVisible(true);
    }
    
}
