/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.objetos;

import java.io.Serializable;

/**
 *
 * @author mtayllan
 */
public class Tweet implements Serializable{
    
    private String usuario;
    private String mensagem;
    
    public Tweet(String usuario, String mensagem){
        this.usuario = usuario;
        this.mensagem = mensagem;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
