/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter;

import twitter.repositorio.FileUsuario;
import twitter.servico.MyTwitter;
import twitter.ui.Login;

/**
 *
 * @author mtayllan
 */
public class Twitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileUsuario repositorio = new FileUsuario();
        
        Login login = new Login(new MyTwitter(repositorio));
        login.setVisible(true);
    }
    
}
