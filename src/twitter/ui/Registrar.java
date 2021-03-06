/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.ui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import twitter.excecoes.PEException;
import twitter.objetos.Perfil;
import twitter.objetos.PessoaFisica;
import twitter.objetos.PessoaJuridica;
import twitter.servico.MyTwitter;

/**
 *
 * @author mtayl
 */
public class Registrar extends javax.swing.JFrame {
    private MyTwitter myTwitter;

    /**
     * Creates new form Registrar
     */
    public Registrar(MyTwitter myTwitter) {
        initComponents();
        this.myTwitter = myTwitter;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoDePessoa = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JLabel();
        botaoRegistrar = new javax.swing.JButton();
        campoUsuario = new javax.swing.JTextField();
        campoID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radioFisica = new javax.swing.JRadioButton();
        radioJurídica = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLayeredPane1.setBackground(new java.awt.Color(0, 172, 237));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nome de Usuário:");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 350, -1));

        botaoSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close_icon_24x24.png"))); // NOI18N
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });
        jLayeredPane1.add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 11, -1, -1));

        botaoRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        botaoRegistrar.setForeground(new java.awt.Color(0, 172, 237));
        botaoRegistrar.setText("Registrar");
        botaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(botaoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 184, -1));

        campoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        campoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane1.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 350, -1));

        campoID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        campoID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane1.add(campoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 350, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Tipo de Pessoa:");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CPF/CNPJ:");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 350, -1));

        radioFisica.setSelected(true);
        radioFisica.setText("Física");
        jLayeredPane1.add(radioFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        tipoDePessoa.add(radioJurídica);
        radioJurídica.setText("Jurídica");
        jLayeredPane1.add(radioJurídica, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_branca_100x100.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_botaoSairMouseClicked

    private void botaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarActionPerformed
        
        try{
            String usuario = campoUsuario.getText();
            long id = Long.parseLong(campoID.getText());
            Perfil perfil;
            if(radioFisica.isSelected()){
                perfil = new PessoaFisica(usuario);
                ((PessoaFisica) perfil).setCpf(id);
            }else{
                perfil = new PessoaJuridica(usuario);
                ((PessoaJuridica) perfil).setCnpj(id);
            }
            myTwitter.criarPerfil(perfil);
            this.dispose();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Número de Identificação mal formatado");
        } catch (PEException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_botaoRegistrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRegistrar;
    private javax.swing.JLabel botaoSair;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton radioFisica;
    private javax.swing.JRadioButton radioJurídica;
    private javax.swing.ButtonGroup tipoDePessoa;
    // End of variables declaration//GEN-END:variables
}
