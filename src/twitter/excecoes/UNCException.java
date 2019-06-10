/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.excecoes;

/**
 *
 * @author mtayllan
 */
public class UNCException extends Exception{
    private String usuario;
    
    public UNCException(String usuario){
        super("Usuário Inexistente");
        this.usuario = usuario;
    }
    
    public String getUsuario(){
        return usuario;
    }
}
