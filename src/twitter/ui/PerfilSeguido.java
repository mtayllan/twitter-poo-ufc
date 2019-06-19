/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;
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
 * @author mtayllan
 */
public class PerfilSeguido extends javax.swing.JFrame {

    private final String usuarioLogado;
    private final String usuarioSeguido;
    private final MyTwitter myTwitter;

    public PerfilSeguido(String usuarioLogado, String usuarioSeguido, MyTwitter myTwitter) {
        this.usuarioLogado = usuarioLogado;
        this.usuarioSeguido = usuarioSeguido;
        this.myTwitter = myTwitter;
        initComponents();
        preencherStatus();
        preencherListaDeSeguidos();
        preencherListaDeSeguidores();
        preencherMeusTweets();
    }
    
    private void preencherStatus(){
        try {
            int qtdSeguidores = myTwitter.numeroSeguidores(usuarioSeguido);
            int qtdSeguidos = myTwitter.seguidos(usuarioSeguido).size();
            int qtdTweets = myTwitter.tweets(usuarioSeguido).size();
            seguidoresTxt.setText(qtdSeguidores + " seguidores.");
            seguindoTxt.setText(qtdSeguidos + " seguindo");
            usuarioTxt.setText("@"+usuarioSeguido);
            tweetsTxt.setText(qtdTweets + " tweets");
        } catch (PIException | PDException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void preencherListaDeSeguidos(){
        Vector<Perfil> usuarios;
        try {
            usuarios = myTwitter.seguidos(usuarioSeguido);
            for(Perfil perfil : usuarios){
                JLabel label = new JLabel();
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setText(perfil.getUsuario());
                label.setForeground(new Color(0,172,237));
                label.setMaximumSize(new Dimension(1000, 40));
                label.setSize(1000,40);
                label.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        PerfilSeguido perfilSeguido = new PerfilSeguido(usuarioLogado, perfil.getUsuario(), myTwitter);
                        perfilSeguido.setVisible(true);
                        PerfilSeguido.this.dispose();
                    }
                });
                painelUsuarios.add(label);
            }
        } catch (PIException | PDException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void preencherListaDeSeguidores(){
        Vector<Perfil> usuarios;
        try {
            usuarios = myTwitter.seguidores(usuarioSeguido);
            for(Perfil perfil : usuarios){
                JLabel label = new JLabel();
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setText(perfil.getUsuario());
                label.setForeground(new Color(0,172,237));
                label.setMaximumSize(new Dimension(1000, 40));
                label.setSize(1000,40);
                label.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        PerfilSeguido perfilSeguido = new PerfilSeguido(usuarioLogado, perfil.getUsuario(), myTwitter);
                        perfilSeguido.setVisible(true);
                        PerfilSeguido.this.dispose();
                    }
                });
                painelSeguidores.add(label);
            }
        } catch (PIException | PDException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void preencherMeusTweets(){
        painelTweets.removeAll();
        Vector<Tweet> tweets;
        try {
            tweets = myTwitter.tweets(usuarioSeguido);
            for(Tweet tweet : tweets){
                JLabel label = new JLabel();
                label.setText("@" + tweet.getUsuario() + " - " + tweet.getMensagem());
                label.setMaximumSize(new Dimension(1000, 40));
                label.setForeground(new Color(0,172,237));
                label.setSize(1000,40);
                painelTweets.add(label);
            }
        } catch (PIException | PDException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        painelTweets.updateUI();
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
        botaoSair = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        seguidoresTxt = new javax.swing.JLabel();
        tweetsTxt = new javax.swing.JLabel();
        seguindoTxt = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        painelUsuarios = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        painelSeguidores = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        painelTweets = new javax.swing.JPanel();
        seguidosTxt3 = new javax.swing.JLabel();
        seguidosTxt2 = new javax.swing.JLabel();
        seguidosTxt1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane2.setBackground(new java.awt.Color(0, 172, 237));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close_icon_24x24.png"))); // NOI18N
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });
        jLayeredPane2.add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seguidoresTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seguidoresTxt.setForeground(new java.awt.Color(255, 255, 255));
        seguidoresTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seguidoresTxt.setText("Seguidores:");
        jLayeredPane3.add(seguidoresTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 179, 40));

        tweetsTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tweetsTxt.setForeground(new java.awt.Color(255, 255, 255));
        tweetsTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tweetsTxt.setText("Tweets");
        jLayeredPane3.add(tweetsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, 40));

        seguindoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seguindoTxt.setForeground(new java.awt.Color(255, 255, 255));
        seguindoTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seguindoTxt.setText("Seguindo:");
        jLayeredPane3.add(seguindoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 179, 40));

        usuarioTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuarioTxt.setForeground(new java.awt.Color(255, 255, 255));
        usuarioTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuarioTxt.setText("Usuário:");
        jLayeredPane3.add(usuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 40));

        jLayeredPane2.add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 660, 139));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelUsuarios.setBackground(java.awt.Color.white);
        painelUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        painelUsuarios.setLayout(new javax.swing.BoxLayout(painelUsuarios, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane4.setViewportView(painelUsuarios);

        jLayeredPane2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 223, 200, 280));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        painelSeguidores.setBackground(java.awt.Color.white);
        painelSeguidores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        painelSeguidores.setLayout(new javax.swing.BoxLayout(painelSeguidores, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane5.setViewportView(painelSeguidores);

        jLayeredPane2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 223, 200, 280));

        jScrollPane6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        painelTweets.setBackground(java.awt.Color.white);
        painelTweets.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        painelTweets.setLayout(new javax.swing.BoxLayout(painelTweets, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane6.setViewportView(painelTweets);

        jLayeredPane2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 223, 200, 280));

        seguidosTxt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seguidosTxt3.setForeground(new java.awt.Color(255, 255, 255));
        seguidosTxt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seguidosTxt3.setText("Tweets");
        jLayeredPane2.add(seguidosTxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 160, 40));

        seguidosTxt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seguidosTxt2.setForeground(new java.awt.Color(255, 255, 255));
        seguidosTxt2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seguidosTxt2.setText("Seguidores");
        jLayeredPane2.add(seguidosTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 120, 40));

        seguidosTxt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seguidosTxt1.setForeground(new java.awt.Color(255, 255, 255));
        seguidosTxt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seguidosTxt1.setText("Seguindo");
        jLayeredPane2.add(seguidosTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 40));

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 720, 530));

        setSize(new java.awt.Dimension(718, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_botaoSairMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoSair;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel painelSeguidores;
    private javax.swing.JPanel painelTweets;
    private javax.swing.JPanel painelUsuarios;
    private javax.swing.JLabel seguidoresTxt;
    private javax.swing.JLabel seguidosTxt1;
    private javax.swing.JLabel seguidosTxt2;
    private javax.swing.JLabel seguidosTxt3;
    private javax.swing.JLabel seguindoTxt;
    private javax.swing.JLabel tweetsTxt;
    private javax.swing.JLabel usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
