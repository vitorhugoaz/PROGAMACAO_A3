package formularios;

import classes.dados;
import classes.produtos;
import classes.utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmprodutos extends javax.swing.JInternalFrame {

    private dados msdados;
    private int produtoAtual = 0;
    private boolean novo = false;
    private DefaultTableModel minhaTabela;

    public void setdados(dados msdados) {
	this.msdados = msdados;
    }

    public frmprodutos() {
	initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Preco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtIDproduto = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPrimeiro = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();

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
        setTitle("Cadastrar Produtos:");
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
        jLabel1.setText("ID Produto:");

        Preco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Preco.setForeground(new java.awt.Color(0, 0, 0));
        Preco.setText("Preço:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Produto:");

        txtPreco.setEnabled(false);

        txtIDproduto.setEnabled(false);
        txtIDproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDprodutoActionPerformed(evt);
            }
        });

        txtProduto.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Descrição:");

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back.png"))); // NOI18N
        btnPrimeiro.setMaximumSize(new java.awt.Dimension(0, 0));
        btnPrimeiro.setMinimumSize(new java.awt.Dimension(0, 0));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixa_produtos.png"))); // NOI18N

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblTabela);

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane3.setViewportView(txtDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(Preco)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Preco))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
	produtoAtual = 0;
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
	txtIDproduto.setEnabled(true);
	txtProduto.setEnabled(true);
	txtPreco.setEnabled(true);
	txtDescricao.setEnabled(true);
	

	//LIMPAR CAIXAS DE TEXTOS.
	txtIDproduto.setText("");
	txtProduto.setText("");
	txtPreco.setText("");
	txtDescricao.setText("");
	

	novo = true;

	//PARA QUANDO CLICAR EM BOTÃO (NOVO), COLOCAR O CURSOR  NA CAIXA DE IDUSUARIO.
	txtIDproduto.requestFocus();

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

	//DESABILITAR OS CAMPOS DE TEXTOS.
	txtIDproduto.setEnabled(false);
	txtProduto.setEnabled(false);
	txtPreco.setEnabled(false);
	txtDescricao.setEnabled(false);
	
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
	txtIDproduto.setEnabled(true);
	txtProduto.setEnabled(true);
	txtPreco.setEnabled(true);
	txtDescricao.setEnabled(true);
	

	novo = false;

	//PARA QUANDO CLICAR EM BOTÃO (NOVO), COLOCAR O CURSOR  NA CAIXA DE IDUSUARIO.
	txtDescricao.requestFocus();

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

	if (txtIDproduto.getText().equals("")) {
	    JOptionPane.showMessageDialog(rootPane, "Insira um número de ID para o produto.");
	    txtIDproduto.requestFocusInWindow();
	    return;
	}
        
	if (txtProduto.getText().equals("")) {
	    JOptionPane.showMessageDialog(rootPane, "Insira um descrição para o produto.");
	    txtProduto.requestFocusInWindow();
	    return;
	}
	if (txtPreco.getText().equals("")) {
	    JOptionPane.showMessageDialog(rootPane, "Insira um preço para o produto.");
	    txtPreco.requestFocusInWindow();
	    return;
	}

	if (!utilidades.isNumeric(txtPreco.getText())) {
	    JOptionPane.showMessageDialog(rootPane, "Insira apenas números.");
	    txtPreco.requestFocusInWindow();
	    return;
	}

	int preco = Integer.parseInt(txtPreco.getText());
	if (preco <= 0) {

	    JOptionPane.showMessageDialog(rootPane, "Insira um numero acima de zero.");
	    txtPreco.requestFocusInWindow();
	    return;
	}

	int pos = msdados.posicaoUsuario(txtIDproduto.getText());
	if (novo) {
	    if (pos != -1) {

		JOptionPane.showMessageDialog(rootPane, "Este produto ja existe.");
		txtIDproduto.requestFocusInWindow();
		return;
	    }
	} else {

	    if (pos == -1) {
		JOptionPane.showMessageDialog(rootPane, "Este produto está disponivel.");
		txtIDproduto.requestFocusInWindow();
		return;
	    }
	}

	produtos meuProduto = new produtos(txtIDproduto.getText(),
		txtProduto.getText(),
		txtDescricao.getText(),
		preco);

	String msg;
	if (novo) {
	    msg = msdados.adicionarProduto(meuProduto);
	    JOptionPane.showMessageDialog(rootPane, "Produto cadastrado com Sucesso!");

	} else {

	    msdados.editarProduto(meuProduto, pos);
	    JOptionPane.showMessageDialog(rootPane, "Produto editado com Sucesso!");

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
	txtIDproduto.setEnabled(false);
	txtProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
	txtPreco.setEnabled(false);
	
	PreencherTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtIDprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDprodutoActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_txtIDprodutoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
	mostrarRegistro();
	PreencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
	produtoAtual = msdados.numeroUsuarios() - 1;
	mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
	produtoAtual++;
	if (produtoAtual == msdados.numeroUsuarios()) {
	    produtoAtual = 0;
	}
	mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
	produtoAtual--;
	if (produtoAtual == -1) {
	    produtoAtual = msdados.numeroUsuarios() - 1;
	}
	mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
	String produtos = JOptionPane.showInputDialog("Insira o ID do produto");
	if (produtos.equals("")) {
	    return;
	}
	int pos = msdados.posicaoProduto(produtos);
	if (pos == -1) {
	    JOptionPane.showMessageDialog(rootPane, "Este produto não existe!");
	    return;
	}
	produtoAtual = pos;
	mostrarRegistro();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

	int retorno = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir esse cadastro?");
	if (retorno != 0) {
	    return;
	}
	String msg;
	msg = msdados.deletarProduto(produtoAtual);
	JOptionPane.showMessageDialog(rootPane, msg);
	produtoAtual = 0;
	mostrarRegistro();
	PreencherTabela();

    }//GEN-LAST:event_btnExcluirActionPerformed

    public void mostrarRegistro() {
	txtIDproduto.setText(msdados.getProdutos()[produtoAtual].getIdProduto());
	txtProduto.setText(msdados.getProdutos()[produtoAtual].getProduto());
        txtDescricao.setText(msdados.getProdutos()[produtoAtual].getDescricao());
	txtPreco.setText("" + msdados.getProdutos()[produtoAtual].getPreco());
	
    }

    private void PreencherTabela() {

	String titulos[] = {"ID Produto", "Produto", "Preço", "Descrição"};
	String registros[] = new String[4];
	minhaTabela = new DefaultTableModel(null, titulos);
	for (int i = 0; i < msdados.numeroProdutos(); i++) {
	    registros[0] = msdados.getProdutos()[i].getIdProduto();
            registros[1] = msdados.getProdutos()[i].getProduto();
	    registros[3] = msdados.getProdutos()[i].getDescricao();
	    registros[2] = "" + msdados.getProdutos()[i].getPreco();
	    
	    minhaTabela.addRow(registros);
	}
	tblTabela.setModel(minhaTabela);
    }

    private String imposto(int idImposto) {

	switch (idImposto) {

	    case 0:
		return "0%";
	    case 1:
		return "5%";
	    case 2:
		return "10%";
	    case 3:
		return "15%";
	    default:
		return "Imposto não definido";

	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Preco;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtIDproduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
