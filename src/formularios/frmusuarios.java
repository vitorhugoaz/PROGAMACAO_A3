package formularios;

import classes.dados;
import classes.usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hugo
 */
                public class frmusuarios extends javax.swing.JInternalFrame {
                private dados msdados;
                private int usuarioAtual = 0;
                private boolean novo = false;
                private DefaultTableModel minhaTabela;
    
    public void setdados(dados msdados){
        this.msdados = msdados;
    }
    
    public frmusuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        txtIDusuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPrimeiro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cnbPerfil = new javax.swing.JComboBox<>();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        txtIDSenha = new javax.swing.JPasswordField();
        txtIDConfirmaSenha = new javax.swing.JPasswordField();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Usuários:");
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
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
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID Usuário:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sobrenome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Perfil:");

        txtSobrenome.setEnabled(false);

        txtIDusuario.setEnabled(false);
        txtIDusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDusuarioActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Senha:");

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back.png"))); // NOI18N
        btnPrimeiro.setMaximumSize(new java.awt.Dimension(0, 0));
        btnPrimeiro.setMinimumSize(new java.awt.Dimension(0, 0));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Conf. Senha:");

        cnbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Perfil", "Administrador", "Funcionário" }));
        cnbPerfil.setEnabled(false);

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/playnext.png"))); // NOI18N
        btnProximo.setMaximumSize(new java.awt.Dimension(0, 0));
        btnProximo.setMinimumSize(new java.awt.Dimension(0, 0));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/next.png"))); // NOI18N
        btnUltimo.setMaximumSize(new java.awt.Dimension(0, 0));
        btnUltimo.setMinimumSize(new java.awt.Dimension(0, 0));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/playback.png"))); // NOI18N
        btnAnterior.setMaximumSize(new java.awt.Dimension(0, 0));
        btnAnterior.setMinimumSize(new java.awt.Dimension(0, 0));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        txtIDSenha.setEnabled(false);

        txtIDConfirmaSenha.setEnabled(false);
        txtIDConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDConfirmaSenhaActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/deletarfuncionario.png"))); // NOI18N
        btnExcluir.setMaximumSize(new java.awt.Dimension(0, 0));
        btnExcluir.setMinimumSize(new java.awt.Dimension(0, 0));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionarfucionario.png"))); // NOI18N
        btnNovo.setMaximumSize(new java.awt.Dimension(0, 0));
        btnNovo.setMinimumSize(new java.awt.Dimension(0, 0));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editarfuncionario.png"))); // NOI18N
        btnEditar.setMaximumSize(new java.awt.Dimension(0, 0));
        btnEditar.setMinimumSize(new java.awt.Dimension(0, 0));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvarfuncionario.png"))); // NOI18N
        btnSalvar.setEnabled(false);
        btnSalvar.setMaximumSize(new java.awt.Dimension(0, 0));
        btnSalvar.setMinimumSize(new java.awt.Dimension(0, 0));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bloquearfuncionario.png"))); // NOI18N
        btnCancelar.setMaximumSize(new java.awt.Dimension(0, 0));
        btnCancelar.setMinimumSize(new java.awt.Dimension(0, 0));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisarfuncionario.png"))); // NOI18N
        btnPesquisar.setMaximumSize(new java.awt.Dimension(0, 0));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(0, 0));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gerente.png"))); // NOI18N

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblTabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIDConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(txtSobrenome)
                            .addComponent(txtIDSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(txtIDusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(cnbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cnbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIDSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIDConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        usuarioAtual = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
      
        //HABILTAR BOTÕES (SALVAR) E (CANCELAR).
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        
        //HABILITAR CAIXAS DE TEXTOS
         
        txtIDusuario.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtIDSenha.setEnabled(true);
        txtIDConfirmaSenha.setEnabled(true);
        cnbPerfil.setEnabled(true);
        
        //LIMPAR CAIXAS DE TEXTOS.
        
        txtIDusuario.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        txtIDSenha.setText("");
        txtIDConfirmaSenha.setText("");
        cnbPerfil.setSelectedIndex(0);
        
        novo = true;
        
         //PARA QUANDO CLICAR EM BOTÃO (NOVO), COLOCAR O CURSOR  NA CAIXA DE IDUSUARIO.
        txtIDusuario.requestFocus();
      
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      
        //HABILITAR BOTÕES COM EXEÇÃO DO (SALVAR) E (CANCELAR).
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         
        //HABILTAR BOTÕES (SALVAR) E (CANCELAR).
        
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        
        //HABILITAR CAIXAS DE TEXTOS
        
        txtIDusuario.setEnabled(false);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtIDSenha.setEnabled(true);
        txtIDConfirmaSenha.setEnabled(true);
        cnbPerfil.setEnabled(true);
        
        novo = false;
        
        //PARA QUANDO CLICAR EM BOTÃO (NOVO), COLOCAR O CURSOR  NA CAIXA DE IDUSUARIO.
        txtNome.requestFocus();
        
    
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
          if(txtIDusuario.getText().equals("")){
          JOptionPane.showMessageDialog(rootPane, "Por favor, insira um número de ID.");
          txtIDusuario.requestFocusInWindow();
          return;
          }
          if(cnbPerfil.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(rootPane, "Por favor, insira um Perfil.");
          cnbPerfil.requestFocusInWindow();
          return;
          }
          if(txtNome.getText().equals("")){
          JOptionPane.showMessageDialog(rootPane, "Por favor, insira um Nome.");
          txtNome.requestFocusInWindow();
          return;
          }
          if(txtSobrenome.getText().equals("")){
          JOptionPane.showMessageDialog(rootPane, "Por favor, insira um sobrenome.");
          txtSobrenome.requestFocusInWindow();
          return;
          }
          
          String Senha = new String (txtIDSenha.getPassword());
          String ConfirmarSenha = new String (txtIDConfirmaSenha.getPassword());
          
            if(Senha.equals("")){
          JOptionPane.showMessageDialog(rootPane, "Por favor, confirme a senha.");
          txtIDSenha.requestFocusInWindow();
          return;
          }
           if(ConfirmarSenha.equals("")){
          JOptionPane.showMessageDialog(rootPane, "Por favor, confirme a senha.");
          txtIDConfirmaSenha.requestFocusInWindow();
          return;
          }
           
         if(!Senha.equals(ConfirmarSenha)){
          JOptionPane.showMessageDialog(rootPane, "Sua senha está diferente.");
          txtIDSenha.setText("");
          txtIDConfirmaSenha.setText("");
          txtIDSenha.requestFocusInWindow();
          return;
         }
         
         int pos = msdados.posicaoUsuario(txtIDusuario.getText());
           if(novo){
           if(pos!=-1){
               
           JOptionPane.showMessageDialog(rootPane, "Este usuário ja existe.");
           txtIDusuario.requestFocusInWindow();
           return;
             }
         } else{
               
            if(pos == -1){
           JOptionPane.showMessageDialog(rootPane, "Este usuário está disponivel.");
           txtIDusuario.requestFocusInWindow();
           return;
               }
           }
           
           usuario meuUsuario = new usuario
             (txtIDusuario.getText(), 
              txtNome.getText(), 
              txtSobrenome.getText(), 
              Senha, 
              cnbPerfil.getSelectedIndex());
           
            String msg;
            if(novo){
           msg = msdados.adicionarUsuario(meuUsuario);
           JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com Sucesso!");
           
            }else{
                
            msdados.editarUsuario(meuUsuario, pos);
           JOptionPane.showMessageDialog(rootPane, "Usuário editado com Sucesso!");
           
            }
         
        //HABILITAR BOTÕES COM EXEÇÃO DO (SALVAR) E (CANCELAR).
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        //DESABILITAR OS CAMPOS DE TEXTOS.
        txtIDusuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtIDSenha.setEnabled(false);
        txtIDConfirmaSenha.setEnabled(false);
        cnbPerfil.setEnabled(false);
        
        PreencherTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtIDusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDusuarioActionPerformed

    private void txtIDConfirmaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDConfirmaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDConfirmaSenhaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
            mostrarRegistro();
            PreencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
       usuarioAtual = msdados.numeroUsuarios()-1;
       mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
       usuarioAtual++;
       if(usuarioAtual == msdados.numeroUsuarios()){
           usuarioAtual = 0;
       }
       mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
       usuarioAtual--;
       if(usuarioAtual == -1){
           usuarioAtual = msdados.numeroUsuarios()-1;
       }
       mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int retorno  = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir esse cadastro?");
          if (retorno !=0){
                    return;
                }
                String msg;
                msg = msdados.deletarUsuario(usuarioAtual);
                JOptionPane.showMessageDialog(rootPane, msg);
                usuarioAtual = 0;
                mostrarRegistro();
                PreencherTabela();  
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
       String usuario = JOptionPane.showInputDialog("Insira o ID do usuário");
       if(usuario.equals("")){
           return;
       }
       int pos = msdados.posicaoUsuario(usuario);
       if(pos == -1){
           JOptionPane.showMessageDialog(rootPane, "Este usuário não existe!");
           return;
       }
       usuarioAtual = pos;
       mostrarRegistro();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    public void mostrarRegistro(){
        txtIDusuario.setText(msdados.getUsuarios()[usuarioAtual].getIdUsuario());
        txtNome.setText(msdados.getUsuarios()[usuarioAtual].getNome());
        txtSobrenome.setText(msdados.getUsuarios()[usuarioAtual].getSobrenome());
        txtIDSenha.setText(msdados.getUsuarios()[usuarioAtual].getSenha());
        txtIDConfirmaSenha.setText(msdados.getUsuarios()[usuarioAtual].getSenha());
        cnbPerfil.setSelectedIndex(msdados.getUsuarios()[usuarioAtual].getPerfil());
    }
    private void PreencherTabela(){
        
        String titulos[] = {"ID Usuario","Nome","Sobrenome","Perfil"};
        String registros[] =  new String[4];
        minhaTabela = new DefaultTableModel(null,titulos);
                for(int i = 0; i < msdados.numeroUsuarios();i++){
                        registros[0] = msdados.getUsuarios()[i].getIdUsuario();
                        registros[1] = msdados.getUsuarios()[i].getNome();
                        registros[2] = msdados.getUsuarios()[i].getSobrenome();
                        registros[3] = perfil (msdados.getUsuarios()[i].getPerfil());
                        minhaTabela.addRow(registros);
                }
                tblTabela.setModel(minhaTabela);
    }
    private String perfil (int idperfil){
        
        if(idperfil == 1){
            return"Administrador";
        }else{
            return"Funcionário";
        }
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cnbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JPasswordField txtIDConfirmaSenha;
    private javax.swing.JPasswordField txtIDSenha;
    private javax.swing.JTextField txtIDusuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
