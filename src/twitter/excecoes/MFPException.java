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
public class MFPException extends Exception{
    public MFPException(String mensagem){
        super("Mensagem ultrapassa o limite de caracteres. Esperado: 1-140. Fornecido: " + mensagem.length());
    }
}
