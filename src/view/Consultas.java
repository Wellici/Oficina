package view;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import oficinahugo.OficinaHugo;

public class Consultas extends javax.swing.JInternalFrame {
   
    public Consultas() {
        initComponents();
    }
    //ConsultaProdEstoque frame
       private void centralizaForm(JInternalFrame frame) { // metódo criado para abrir InternalFrorme centralizado  
        Dimension desktopSize = getParent().getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoRelatorio = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botaoRenFunc = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        botaoUltimasCompras = new javax.swing.JButton();
        botaoEstoque = new javax.swing.JButton();

        setTitle("Menu");

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        botaoRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_white_text.png"))); // NOI18N
        botaoRelatorio.setText("Relatório");
        botaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom_out.png"))); // NOI18N
        jButton2.setText("Produtos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botaoRenFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_line.png"))); // NOI18N
        botaoRenFunc.setText("Rendimento funcionario");
        botaoRenFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRenFuncActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car.png"))); // NOI18N
        jButton5.setText("Veiculo do cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        botaoUltimasCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_bar.png"))); // NOI18N
        botaoUltimasCompras.setText("Ultimas Vendas");
        botaoUltimasCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUltimasComprasActionPerformed(evt);
            }
        });

        botaoEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/package.png"))); // NOI18N
        botaoEstoque.setText("Produtos em estoque");
        botaoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoRenFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoUltimasCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(botaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(botaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(botaoUltimasCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(botaoRenFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioActionPerformed
        // Aqui é a consulta do relatóorio
        // ConsultaRelatorio.controladorDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            ConsultaRelatorio tela = new ConsultaRelatorio();
            getParent().add(tela);
            centralizaForm(tela);
            tela.setVisible(true);
            //ConsultaRelatorio.controladorDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_botaoRelatorioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Aqui é a consulta de produtos especificos
        // ConsultaProduto.controladorDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            ConsultaProduto tela1 = new ConsultaProduto();
            getParent().add(tela1);
            centralizaForm(tela1);
            tela1.setVisible(true);
            //ConsultaProduto.controladorDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botaoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEstoqueActionPerformed
        // Aqui é a consulta de todos os produtos disponiveis em estoque
        // ConsultaProdEstoque.controladorDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            ConsultaProdEstoque tela = new ConsultaProdEstoque();
            getParent().add(tela);
            centralizaForm(tela);
            tela.setVisible(true);
            // ConsultaProdEstoque.controladorDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
         
    }//GEN-LAST:event_botaoEstoqueActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Aqui vai consultar o veiculo relacionado a um clinte
        // ConsultaVeiculo.controladorDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            ConsultaVeiculo tela = new ConsultaVeiculo();
            getParent().add(tela);
            centralizaForm(tela);
            tela.setVisible(true);
            // ConsultaVeiculo.controladorDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void botaoUltimasComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUltimasComprasActionPerformed
        // Aqui vai mostrar as ultimas compras feitas por clientes
        // ConsultaVendas.controladorDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            ConsultaVendas tela = new ConsultaVendas();
            getParent().add(tela);
            centralizaForm(tela);
            tela.setVisible(true);
            // ConsultaVendas.controladorDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_botaoUltimasComprasActionPerformed

    private void botaoRenFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRenFuncActionPerformed
        // Aqui vai ser o rendimento de cada funcionario, o quanto cada um vendeu
        // ConsultaRendFunc.controladorDeJanela == false
        if(OficinaHugo.controleDeJanela == false){
            ConsultaRendFunc tela = new ConsultaRendFunc();
            getParent().add(tela);
            centralizaForm(tela);
            tela.setVisible(true);
            // ConsultaRendFunc.controladorDeJanela = true;
            OficinaHugo.controleDeJanela = true;
        }
    }//GEN-LAST:event_botaoRenFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEstoque;
    private javax.swing.JButton botaoRelatorio;
    private javax.swing.JButton botaoRenFunc;
    private javax.swing.JButton botaoUltimasCompras;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}