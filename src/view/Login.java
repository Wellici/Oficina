package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import persistencia.ConnectionFactory;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_usr = new javax.swing.JTextField();
        txt_senha = new javax.swing.JPasswordField();
        usr_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_log = new javax.swing.JButton();
        tela_log = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_usr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 290, 50));
        getContentPane().add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 290, 50));

        usr_label.setText("Usuário");
        getContentPane().add(usr_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel1.setText("Senha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, 20));

        btn_log.setText("Login");
        btn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logActionPerformed(evt);
            }
        });
        getContentPane().add(btn_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 140, 50));

        tela_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login2.jpg"))); // NOI18N
        tela_log.setText("Usuário");
        getContentPane().add(tela_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logActionPerformed
        // TODO add your handling code here:
        try {
		Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
		String sql = "select * from login where usuario = ? and senha = ?";
		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, txt_usr.getText());
		prep.setString(2, new String(txt_senha.getPassword()));
		ResultSet rs = prep.executeQuery();
					
		if(rs.next()) {
		Home tela1 = new Home();
		tela1.setVisible(true);
                tela1.setLocationRelativeTo(null);
		setVisible(false);
						// Cadastro tela = new Cadastro();
						// tela.setVisible(true);
						// setVisible(false);
						// JOptionPane.showMessageDialog(null,"Usuario encontrado");
		}else {
                    JOptionPane.showMessageDialog(null,"Usuario ou senha não encontrado");
			}
		prep.close();
		con.close();			
		} catch (SQLException e) {
					// TODO Auto-generated catch block
			e.printStackTrace();
		}		
    }//GEN-LAST:event_btn_logActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_log;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tela_log;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usr;
    private javax.swing.JLabel usr_label;
    // End of variables declaration//GEN-END:variables
}
