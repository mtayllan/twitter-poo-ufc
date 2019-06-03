package twitter.objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mtayllan
 */
public class PessoaFisica extends Perfil {
    
    private long cpf;

    public PessoaFisica(String usuario) {
        super(usuario);
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    
    
    
        
}
