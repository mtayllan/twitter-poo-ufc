/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.servico;

import java.util.Vector;
import twitter.excecoes.MFPException;
import twitter.excecoes.PDException;
import twitter.excecoes.PEException;
import twitter.excecoes.PIException;
import twitter.excecoes.SIException;
import twitter.objetos.Perfil;
import twitter.objetos.Tweet;
import twitter.repositorio.IRepositorioUsuario;

/**
 *
 * @author mtayllan
 */
public class MyTwitter implements ITwitter{

    private IRepositorioUsuario repositorio;
    
    public MyTwitter(IRepositorioUsuario repositorio){
        this.repositorio = repositorio;
    }

    @Override
    public void criarPerfil(Perfil usario) throws PEException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cancelarPerfil(String usuario) throws PIException, PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tweetar(String usuario, String mensagem) throws PIException, MFPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector<Tweet> timeline(String usuario) throws PIException, PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector<Tweet> tweets(String usuario) throws PIException, PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numeroSeguidores(String usuario) throws PIException, PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector<Perfil> seguidores(String usuario) throws PIException, PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector<Perfil> seguidos(String usuario) throws PIException, PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
