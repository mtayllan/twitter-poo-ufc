/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.repositorio;

import java.util.Vector;
import twitter.excecoes.UJCException;
import twitter.excecoes.UNCException;
import twitter.objetos.Perfil;

/**
 *
 * @author mtayllan
 */
public class FileUsuario implements IRepositorioUsuario{
    private Vector<Perfil> usuarios;
    
    public FileUsuario(){
        usuarios = new Vector();
    }

    @Override
    public void cadastrar(Perfil usuario) throws UJCException {
        if (buscar(usuario.getUsuario()) != null){
            usuarios.add(usuario);
        }else{
            throw new UJCException(usuario.getUsuario());
        }
    }

    @Override
    public Perfil buscar(String usuario) {
        for(Perfil perfil : usuarios){
            if(perfil.getUsuario().equals(usuario)) return perfil;
  	}
  	return null;
    }

    @Override
    public void atualizar(Perfil usuario) throws UNCException {
        Perfil antigo = buscar(usuario.getUsuario());
        if(antigo != null){
            antigo = usuario;
        }else{
            throw new UNCException(usuario.getUsuario());
        }
    }
    
}
