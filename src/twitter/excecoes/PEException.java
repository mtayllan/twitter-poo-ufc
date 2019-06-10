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
public class PEException extends Exception{
    public PEException(String usuario){
        super("O perfil já existe");
    }
}
