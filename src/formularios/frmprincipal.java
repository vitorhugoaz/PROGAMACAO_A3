package formularios;

import classes.background;
import classes.dados;

    public class frmprincipal extends javax.swing.JFrame {
    private dados msdados;
    
        public void setdados(dados msdados){
        
        this.msdados = msdados;
    }
    
    public frmprincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesktop = new background();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        MenuArquivoCliente = new javax.swing.JMenuItem();
        MenuArquivoProdutos = new javax.swing.JMenuItem();
        MenuArquivoUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuArquivoTrocarSenha = new javax.swing.JMenuItem();
        MenuArquivoTrocarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuArquivoSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuMovimentoNovaVenda = new javax.swing.JMenuItem();
        MenuMovimentoRelatorioVenda = new javax.swing.JMenuItem();
        MenuAjudaSobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnDesktop.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout dpnDesktopLayout = new javax.swing.GroupLayout(dpnDesktop);
        dpnDesktop.setLayout(dpnDesktopLayout);
        dpnDesktopLayout.setHorizontalGroup(
            dpnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1386, Short.MAX_VALUE)
        );
        dpnDesktopLayout.setVerticalGroup(
            dpnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        MenuArquivo.setBackground(new java.awt.Color(0, 0, 0));
        MenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo.png"))); // NOI18N
        MenuArquivo.setText("Arquivo");

        MenuArquivoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuArquivoCliente.setForeground(new java.awt.Color(0, 0, 0));
        MenuArquivoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes.png"))); // NOI18N
        MenuArquivoCliente.setText("Cliente");
        MenuArquivo.add(MenuArquivoCliente);

        MenuArquivoProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuArquivoProdutos.setForeground(new java.awt.Color(0, 0, 0));
        MenuArquivoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
        MenuArquivoProdutos.setText("Produtos");
        MenuArquivoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoProdutosActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuArquivoProdutos);

        MenuArquivoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuArquivoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        MenuArquivoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios.png"))); // NOI18N
        MenuArquivoUsuario.setText("Usuários");
        MenuArquivoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoUsuarioActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuArquivoUsuario);
        MenuArquivo.add(jSeparator1);

        MenuArquivoTrocarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuArquivoTrocarSenha.setForeground(new java.awt.Color(0, 0, 0));
        MenuArquivoTrocarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trocarsenha.png"))); // NOI18N
        MenuArquivoTrocarSenha.setText("Trocar Senha");
        MenuArquivo.add(MenuArquivoTrocarSenha);

        MenuArquivoTrocarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuArquivoTrocarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        MenuArquivoTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trocarusuario.png"))); // NOI18N
        MenuArquivoTrocarUsuario.setText("Trocar Usuário");
        MenuArquivo.add(MenuArquivoTrocarUsuario);
        MenuArquivo.add(jSeparator2);

        MenuArquivoSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuArquivoSair.setForeground(new java.awt.Color(0, 0, 0));
        MenuArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sairsair.png"))); // NOI18N
        MenuArquivoSair.setText("Sair");
        MenuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoSairActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuArquivoSair);

        jMenuBar1.add(MenuArquivo);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/movimento.png"))); // NOI18N
        jMenu2.setText("Movimento");

        MenuMovimentoNovaVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuMovimentoNovaVenda.setForeground(new java.awt.Color(0, 0, 0));
        MenuMovimentoNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novavenda.png"))); // NOI18N
        MenuMovimentoNovaVenda.setText("Nova Venda");
        MenuMovimentoNovaVenda.setToolTipText("");
        jMenu2.add(MenuMovimentoNovaVenda);

        MenuMovimentoRelatorioVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuMovimentoRelatorioVenda.setForeground(new java.awt.Color(0, 0, 0));
        MenuMovimentoRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatoriodevenda.png"))); // NOI18N
        MenuMovimentoRelatorioVenda.setText("Relatório de Venda");
        jMenu2.add(MenuMovimentoRelatorioVenda);

        jMenuBar1.add(jMenu2);

        MenuAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ajuda.png"))); // NOI18N
        MenuAjudaSobre.setText("Ajuda");

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobre.png"))); // NOI18N
        jMenuItem1.setText("Sobre");
        MenuAjudaSobre.add(jMenuItem1);

        MenuAjudaAjuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuAjudaAjuda.setForeground(new java.awt.Color(0, 0, 0));
        MenuAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ajudaajuda.png"))); // NOI18N
        MenuAjudaAjuda.setText("Ajuda");
        MenuAjudaAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaAjudaActionPerformed(evt);
            }
        });
        MenuAjudaSobre.add(MenuAjudaAjuda);

        jMenuBar1.add(MenuAjudaSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpnDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAjudaAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaAjudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAjudaAjudaActionPerformed

    private void MenuArquivoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoUsuarioActionPerformed
      
        frmusuarios musuarios = new frmusuarios();
        musuarios.setdados(msdados);
        dpnDesktop.add(musuarios);
        musuarios.show();
        
        
    }//GEN-LAST:event_MenuArquivoUsuarioActionPerformed

    private void MenuArquivoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoProdutosActionPerformed
      
        frmprodutos meusprodutos = new frmprodutos();
        meusprodutos.setdados(msdados);
        dpnDesktop.add(meusprodutos);
        meusprodutos.show();
    }//GEN-LAST:event_MenuArquivoProdutosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((background)dpnDesktop).setImage("/imagens/background.jpg");
    }//GEN-LAST:event_formWindowOpened

    private void MenuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoSairActionPerformed
        msdados.salvar();
        System.exit(0);
    }//GEN-LAST:event_MenuArquivoSairActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAjudaAjuda;
    private javax.swing.JMenu MenuAjudaSobre;
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenuItem MenuArquivoCliente;
    private javax.swing.JMenuItem MenuArquivoProdutos;
    private javax.swing.JMenuItem MenuArquivoSair;
    private javax.swing.JMenuItem MenuArquivoTrocarSenha;
    private javax.swing.JMenuItem MenuArquivoTrocarUsuario;
    private javax.swing.JMenuItem MenuArquivoUsuario;
    private javax.swing.JMenuItem MenuMovimentoNovaVenda;
    private javax.swing.JMenuItem MenuMovimentoRelatorioVenda;
    private javax.swing.JDesktopPane dpnDesktop;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
