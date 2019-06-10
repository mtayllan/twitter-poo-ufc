/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.servico;

import java.util.Vector;
import twitter.objetos.Perfil;
import twitter.objetos.Tweet;

/**
 *
 * @author mtayllan
 */
public interface ITwitter {
    public void criarPerfil(Perfil usario);
    public void cancelarPerfil(String usuario);
    public void tweetar(String usuario, String mensagem);
    public Vector<Tweet> timeline(String usuario);
    public void seguir(String seguidor, String seguido);
    public int numeroSeguidores(String usuario);
    public Vector<Perfil> seguidores(String usuario);
    public Vector<Perfil> seguidos(String usuario);
}
