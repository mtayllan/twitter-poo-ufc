/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.objetos;

import java.util.Vector;

/**
 *
 * @author mtayllan
 */
public abstract class Perfil {
    
    private String usuario;
    private Vector<Perfil> seguidos;
    private Vector<Perfil> seguidores;
    private Vector<Tweet> timeline;
    private boolean ativo;
    
    public Perfil(String usuario){
        // verificar se já existe
        this.usuario = usuario;
    }
    
    public void addSeguido(Perfil usuario){
        // verificar se já tá
        seguidos.add(usuario);
    }
    
    public void addSeguidor(Perfil usuario){
        // verificar se já tá
        seguidores.add(usuario);
    }
    
    public void addTweet(Tweet tweet){
        timeline.add(tweet);
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public Vector<Perfil> getSeguidos() {
        return seguidos;
    }

    public Vector<Perfil> getSeguidores() {
        return seguidores;
    }

    public Vector<Tweet> getTimeline() {
        return timeline;
    }
    
    public void setAtivo(boolean valor){
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    
    
}
