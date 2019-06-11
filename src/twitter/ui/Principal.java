/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.ui;

import java.awt.Dimension;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import twitter.excecoes.PDException;
import twitter.excecoes.PIException;
import twitter.objetos.Perfil;
import twitter.objetos.Tweet;
import twitter.servico.MyTwitter;

/**
 *
 * @author mtayl
 */
public class Principal extends javax.swing.JFrame {
    private String usuarioLogado;
    private MyTwitter myTwitter;
    /**
     * Creates new form Principal
     * @param usuarioLogado
     * @param myTwitter
     */
    public Principal(String usuarioLogado, MyTwitter myTwitter) {
        initComponents();
        this.usuarioLogado = usuarioLogado;
        this.myTwitter = myTwitter;
        preencherStatus();
        preencherListaDeUsuarios();
    }
    
    private void preencherStatus(){
        try {
            int qtdSeguidores = myTwitter.numeroSeguidores(usuarioLogado);
            int qtdSeguidos = myTwitter.seguidos(usuarioLogado).size();
            seguidoresTxt.setText(qtdSeguidores + " seguidores.");
            seguindoTxt.setText(qtdSeguidos + " seguindo");
            usuarioTxt.setText("@"+usuarioLogado);
        } catch (PIException | PDException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void preencherListaDeUsuarios(){
        Vector<Perfil> usuarios = myTwitter.getUsuarios();
        for(Perfil perfil : usuarios){
            JLabel label = new JLabel();
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setText(perfil.getUsuario());
            label.setMaximumSize(new Dimension(198, 34));
            label.setSize(198, 34);
            painelUsuarios.add(label);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        seguidoresTxt = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JLabel();
        seguindoTxt = new javax.swing.JLabel();
        novoTweet = new javax.swing.JButton();
        editarPerfil = new javax.swing.JButton();
        ativarBotao = new javax.swing.JButton();
        botaoSair = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        painelUsuarios = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(0, 172, 237));
        jLayeredPane1.setOpaque(true);

        seguidoresTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seguidoresTxt.setForeground(new java.awt.Color(255, 255, 255));
        seguidoresTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seguidoresTxt.setText("Seguidores:");

        usuarioTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuarioTxt.setForeground(new java.awt.Color(255, 255, 255));
        usuarioTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuarioTxt.setText("Usuário:");

        seguindoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seguindoTxt.setForeground(new java.awt.Color(255, 255, 255));
        seguindoTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seguindoTxt.setText("Seguindo:");

        novoTweet.setText("Novo Tweet");
        novoTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoTweetActionPerformed(evt);
            }
        });

        editarPerfil.setText("Perfil");

        ativarBotao.setText("Ativar Conta");
        ativarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativarBotaoActionPerformed(evt);
            }
        });

        botaoSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close_icon_24x24.png"))); // NOI18N
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });

        jLayeredPane2.setLayer(seguidoresTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(usuarioTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(seguindoTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(novoTweet, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(editarPerfil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ativarBotao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(botaoSair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novoTweet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ativarBotao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(botaoSair))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(seguidoresTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addComponent(seguindoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addGap(0, 200, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(editarPerfil))
                    .addComponent(botaoSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novoTweet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ativarBotao)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seguindoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(seguidoresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelUsuarios.setLayout(new javax.swing.BoxLayout(painelUsuarios, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane4.setViewportView(painelUsuarios);

        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        setSize(new java.awt.Dimension(698, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        myTwitter.gravar();
    }//GEN-LAST:event_formWindowClosing

    private void novoTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoTweetActionPerformed
        String mensagem = JOptionPane.showInputDialog("Digite aqui sua mensagem");
        try {
            myTwitter.timeline(usuarioLogado).add(new Tweet(usuarioLogado, mensagem));
        } catch (PIException | PDException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_novoTweetActionPerformed

    private void ativarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativarBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ativarBotaoActionPerformed

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_botaoSairMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ativarBotao;
    private javax.swing.JLabel botaoSair;
    private javax.swing.JButton editarPerfil;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton novoTweet;
    private javax.swing.JPanel painelUsuarios;
    private javax.swing.JLabel seguidoresTxt;
    private javax.swing.JLabel seguindoTxt;
    private javax.swing.JLabel usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
