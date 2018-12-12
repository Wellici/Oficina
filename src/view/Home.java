package view;

// import classes.GerenteDeJanelas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import oficinahugo.OficinaHugo;


public class Home extends javax.swing.JFrame {
    
    //  GerenteDeJanelas gerenteDeJanelas;
    public Home() {
        initComponents();
        Consultas con = new Consultas(); // inicializa uma tela de consulta junto com a home
        desktopPane.add(con);
        con.setVisible(true);
        // this.gerenteDeJanelas = new GerenteDeJanelas(jDesktopPane);
        // GerenteDeJanelas gerenteDeJanelas = new GerenteDeJanelas(desktopPane);
    }
    
     private void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = desktopPane.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        removeUser = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Usuario");

        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Adicionar");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        removeUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_delete.png"))); // NOI18N
        removeUser.setMnemonic('s');
        removeUser.setText("Remover");
        removeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserActionPerformed(evt);
            }
        });
        fileMenu.add(removeUser);

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bricks.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Produtos");

        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/database_add.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cadastrar");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/database_delete.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Remover");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_green.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Cliente");

        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vcard_add.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Cadastrar");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vcard_delete.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Remover");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_gray.png"))); // NOI18N
        jMenu1.setText("Funcionario");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_go.png"))); // NOI18N
        jMenuItem2.setText("Adicionar ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/help.png"))); // NOI18N
        jMenu3.setText("Help");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/information.png"))); // NOI18N
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        menuBar.add(jMenu3);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        //System.exit(0);
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        // CadastroCliente.controladorDeJanela == false
       if(OficinaHugo.controleDeJanela == false){
            CadastroCliente telaCli = new CadastroCliente();
            desktopPane.add(telaCli);
            centralizaForm(telaCli);
            telaCli.setVisible(true);
            // CadastroCliente.controladorDeJanela = true;
            OficinaHugo.controleDeJanela = true;
       }
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        // RemoverCliente.controleDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            RemoverCliente remov = new RemoverCliente();
            desktopPane.add(remov);
            centralizaForm(remov);
            remov.setVisible(true);
            // RemoverCliente.controleDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
        // CadastroProduto.controladorDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            CadastroProduto prod = new CadastroProduto();
            desktopPane.add(prod);
            centralizaForm(prod);
            prod.setVisible(true);
            // CadastroProduto.controladorDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
        // ExcluirProduto.controleDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            ExcluirProduto prodE = new ExcluirProduto();
            desktopPane.add(prodE);
            centralizaForm(prodE);
            prodE.setVisible(true);
            // ExcluirProduto.controleDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        /// Sobre.controleDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            Sobre sobre = new Sobre();
            desktopPane.add(sobre);
            centralizaForm(sobre);
            sobre.setVisible(true);
            // Sobre.controleDeJanela = true;
            OficinaHugo.controleDeJanela = true;
       }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        // AddFuncionario.controladorDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            AddFuncionario addF = new AddFuncionario();
            desktopPane.add(addF);
            centralizaForm(addF);
            addF.setVisible(true);
            //AddFuncionario.controladorDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        // AddUsr.controleDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
                AddUsr usr = new AddUsr();
                desktopPane.add(usr);
                centralizaForm(usr);
                usr.setVisible(true);
                // AddUsr.controleDeJanela = true;
                OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void removeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserActionPerformed
        // TODO add your handling code here:
        // RemoveUser.controladorDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
                RemoveUser usr = new RemoveUser();
                desktopPane.add(usr);
                centralizaForm(usr);
                usr.setVisible(true);
                // RemoveUser.controladorDeJanela = true;
                OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_removeUserActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem removeUser;
    // End of variables declaration//GEN-END:variables

}
