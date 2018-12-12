package view;

import classes.Usuario;
import classes.dao.UsuariosDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import oficinahugo.OficinaHugo;

public class AddUsr extends javax.swing.JInternalFrame {
    public static Boolean controleDeJanela = false;
    public AddUsr() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_senhaN = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txt_senhaConf = new javax.swing.JPasswordField();
        botaoSalvar = new javax.swing.JButton();
        botaoDescartar = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Senha:");

        jLabel3.setText("Confirmar senha:");

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/disk.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoDescartar.setText("Descartar");
        botaoDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDescartarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 185, Short.MAX_VALUE)
                        .addComponent(botaoSalvar)
                        .addGap(29, 29, 29)
                        .addComponent(botaoDescartar)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(txt_senhaN)
                                    .addComponent(txt_senhaConf))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_senhaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_senhaConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDescartar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        // controleDeJanela = false;
        OficinaHugo.controleDeJanela = false;
    }//GEN-LAST:event_formInternalFrameClosed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        UsuariosDAO dao = new UsuariosDAO();

        boolean userBool = false;
        boolean senhaBool = false;
        try {
            if(dao.readForUsuario(txtUser.getText()).isEmpty()){
                userBool = true;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUsr.class.getName()).log(Level.SEVERE, null, ex);
        }

        String senhaN = new String(txt_senhaN.getPassword());
        String senhaConf = new String(txt_senhaConf.getPassword());
        
        if(senhaConf.equals(senhaN)){
            senhaBool = true;    
        }
        if(userBool && senhaBool){
            usuario.setUser(txtUser.getText());
            usuario.setSenha(senhaN);
            dao.create(usuario);
            
            txt_senhaN.setText("");
            txt_senhaConf.setText("");
            txtUser.setText("");
        }
        
        else if(userBool && senhaBool==false){
            JOptionPane.showMessageDialog(null, "Senha não coincide");
            txt_senhaN.setText("");
            txt_senhaConf.setText("");
        }
        else if(userBool==false && senhaBool){
            JOptionPane.showMessageDialog(null, "Usuario já cadastrado");
            txtUser.setText("");
        }
        else if(userBool==false && senhaBool==false){
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado e senha não coincide");
            txt_senhaN.setText("");
            txt_senhaConf.setText("");
            txtUser.setText("");
        }
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDescartarActionPerformed
        // TODO add your handling code here:
        txt_senhaN.setText("");
        txt_senhaConf.setText("");
        txtUser.setText("");
    }//GEN-LAST:event_botaoDescartarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDescartar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPasswordField txt_senhaConf;
    private javax.swing.JPasswordField txt_senhaN;
    // End of variables declaration//GEN-END:variables
}
