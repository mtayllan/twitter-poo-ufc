/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.repositorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import twitter.excecoes.UJCException;
import twitter.excecoes.UNCException;
import twitter.objetos.Perfil;

/**
 *
 * @author mtayllan
 */
public class FileUsuario implements IRepositorioUsuario{
    private File file;
    private Vector<Perfil> usuarios;
    
    public FileUsuario(){
        file = new File("twitter.db");
        try{
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream oi = new ObjectInputStream(fi);
            usuarios = (Vector<Perfil>) oi.readObject();
            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dados não encontrados.");
        } catch (IOException e) {
            System.out.println("Erro ao inicializar o fluxo.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Ocorreu um erro interno na inicialização do sistema.");
        }
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
    
    public Vector<Perfil> getUsuarios(){
        return usuarios;
    }
    
    public void gravar(){
        try {
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(usuarios);
            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dados não encontrados.");
        } catch (IOException e) {
            System.out.println("Erro ao inicializar o fluxo.");
        }
    }
    
}
