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
public class UJCException extends Exception{
    public UJCException(String usuario){
        super("O usuário já existe: " + usuario);
    }
}
