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
import twitter.excecoes.UJCException;
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
    public void criarPerfil(Perfil usuario) throws PEException{
        try {
            repositorio.cadastrar(usuario);
        } catch (UJCException ex) {
            throw new PEException(usuario.getUsuario());
        }
    }

    @Override
    public void cancelarPerfil(String usuario) throws PIException, PDException {
        Perfil perfil = repositorio.buscar(usuario);
        if (perfil == null){
            throw new PIException(usuario);
        }else if(!perfil.isAtivo()){
            throw new PDException(usuario);
        }
        perfil.setAtivo(false);
    }

    @Override
    public void tweetar(String usuario, String mensagem) throws PIException, PDException, MFPException {
        Perfil perfil = repositorio.buscar(usuario);
        if (perfil == null){
            throw new PIException(usuario);
        }else if(!perfil.isAtivo()){
            throw new PDException(usuario);
        }else if(mensagem.length()<1 && mensagem.length()>140){
            throw new MFPException(mensagem);
        }
        perfil.getTimeline().add(new Tweet(usuario, mensagem));
    }

    @Override
    public Vector<Tweet> timeline(String usuario) throws PIException, PDException {
        Perfil perfil = repositorio.buscar(usuario);
        if (perfil == null){
            throw new PIException(usuario);
        }else if(!perfil.isAtivo()){
            throw new PDException(usuario);
        }
        return perfil.getTimeline();
    }

    @Override
    public Vector<Tweet> tweets(String usuario) throws PIException, PDException {
        Perfil perfil = repositorio.buscar(usuario);
        if (perfil == null){
            throw new PIException(usuario);
        }else if(!perfil.isAtivo()){
            throw new PDException(usuario);
        }
        // busca em todas as timelines?
        Vector<Tweet> tweets = new Vector<>();
        for(Perfil p : repositorio.getUsuarios()){
            for(Tweet tweet : p.getTimeline()){
                if (tweet.getUsuario().equals(usuario)){
                    tweets.add(tweet);
                }
            }
        }
        return tweets;
    }

    @Override
    public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException {
        Perfil perfil1 = repositorio.buscar(seguidor);
        if (perfil1 == null){
            throw new PIException(seguidor);
        }else if(!perfil1.isAtivo()){
            throw new PDException(seguidor);
        }
        Perfil perfil2 = repositorio.buscar(seguido);
        if (perfil1 == null){
            throw new PIException(seguidor);
        }else if(!perfil1.isAtivo()){
            throw new PDException(seguidor);
        }
        if (perfil1 == perfil2){
            throw new SIException();
        }
        perfil1.getSeguidos().add(perfil2);
        perfil2.getSeguidores().add(perfil1);
    }

    @Override
    public int numeroSeguidores(String usuario) throws PIException, PDException {
        Perfil perfil = repositorio.buscar(usuario);
        if (perfil == null){
            throw new PIException(usuario);
        }else if(!perfil.isAtivo()){
            throw new PDException(usuario);
        }
        return perfil.getSeguidores().size();
    }

    @Override
    public Vector<Perfil> seguidores(String usuario) throws PIException, PDException {
        Perfil perfil = repositorio.buscar(usuario);
        if (perfil == null){
            throw new PIException(usuario);
        }else if(!perfil.isAtivo()){
            throw new PDException(usuario);
        }
        return perfil.getSeguidores();
    }

    @Override
    public Vector<Perfil> seguidos(String usuario) throws PIException, PDException {
        Perfil perfil = repositorio.buscar(usuario);
        if (perfil == null){
            throw new PIException(usuario);
        }else if(!perfil.isAtivo()){
            throw new PDException(usuario);
        }
        return perfil.getSeguidos();
    }
    
    public void logar(String usuario) throws PIException{
        if(repositorio.buscar(usuario) == null){
            throw new PIException(usuario);
        }
    }
    
    public void gravar(){
        repositorio.gravar();
    }
}
