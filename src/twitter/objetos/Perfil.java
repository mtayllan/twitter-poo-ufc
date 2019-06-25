/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.objetos;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author mtayllan
 */
public abstract class Perfil implements Serializable{
    
    private String usuario;
    private Vector<Perfil> seguidos;
    private Vector<Perfil> seguidores;
    private Vector<Tweet> timeline;
    private boolean ativo;
    
    public Perfil(String usuario){
        this.usuario = usuario;
        ativo = true;
        seguidos = new Vector<>();
        seguidores = new Vector<>();
        timeline = new Vector<>();
    }
    
    public Perfil(String usuario, boolean ativo){
        this.usuario = usuario;
        this.ativo = ativo;
        seguidos = new Vector<>();
        seguidores = new Vector<>();
        timeline = new Vector<>();
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
        ativo = valor;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    @Override
    public String toString() {
        return "Usuario:" + usuario + "\nStatus: " + ativo;
    }
}
