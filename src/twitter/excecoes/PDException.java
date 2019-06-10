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
public class PDException extends Exception{
    public PDException(String usuario){
        super("O perfil " + usuario + " está desativado.");
    }
}
