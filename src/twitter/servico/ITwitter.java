/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.servico;

import java.util.Vector;
import twitter.excecoes.*;
import twitter.objetos.Perfil;
import twitter.objetos.Tweet;

/**
 *
 * @author mtayllan
 */
public interface ITwitter {
    public void criarPerfil(Perfil usuario) throws PEException;
    public void cancelarPerfil(String usuario) throws PIException, PDException;
    public void tweetar(String usuario, String mensagem) throws PIException, MFPException, PDException;
    public Vector<Tweet> timeline(String usuario) throws PIException, PDException;
    public Vector<Tweet> tweets(String usuario) throws PIException, PDException;
    public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException;
    public int numeroSeguidores(String usuario) throws PIException, PDException;
    public Vector<Perfil> seguidores(String usuario) throws PIException, PDException;
    public Vector<Perfil> seguidos(String usuario) throws PIException, PDException;
}
