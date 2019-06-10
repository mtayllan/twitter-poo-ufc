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
public interface IRepositorioUsuario {
    public void cadastrar(Perfil usuario) throws UJCException;
    public Perfil buscar(String usuario);
    public void atualizar(Perfil usuario) throws UNCException;
    public Vector<Perfil> getUsuarios();
}
