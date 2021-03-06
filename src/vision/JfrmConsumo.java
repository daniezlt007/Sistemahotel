/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vision;

import model.DadConsumo;
import control.LogConsumo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class JfrmConsumo extends javax.swing.JInternalFrame{
    public static String idreserva;
    public static String cliente;
    

    /**
     * Creates new form JfrmConsumo
     */
    public JfrmConsumo() {
        initComponents();
        mostrar(idreserva);
        txtCliente.setText(cliente);
        txtIdreserva.setText(idreserva);
        inabilitar();
        
    }
    
    private String acao = "salvar";

    void ocultar_colunas() {
        TabelaLista.getColumnModel().getColumn(0).setMaxWidth(0);
        TabelaLista.getColumnModel().getColumn(0).setMinWidth(0);
        TabelaLista.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        TabelaLista.getColumnModel().getColumn(1).setMaxWidth(0);
        TabelaLista.getColumnModel().getColumn(1).setMinWidth(0);
        TabelaLista.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        TabelaLista.getColumnModel().getColumn(2).setMaxWidth(0);
        TabelaLista.getColumnModel().getColumn(2).setMinWidth(0);
        TabelaLista.getColumnModel().getColumn(2).setPreferredWidth(0);
    }

    void inabilitar() {
        txtIdconsumo.setVisible(false);
        
        txtIdreserva.setVisible(false);
        txtCliente.setEnabled(false);
        txtIdproduto.setVisible(false);
        txtNomeProduto.setEnabled(false);
        txtQuantidade.setEnabled(false);
        
        txtPreco_Venda.setEnabled(false);
        JcomboStatus.setEnabled(false);
        
        jButton_Salvar.setEnabled(false);
        jButton_cancelar.setEnabled(false);
        jButton_Excluir.setEnabled(false);
        
        txtIdconsumo.setText("");
        txtPreco_Venda.setText("");
        txtIdproduto.setText("");
        txtNomeProduto.setText("");
        txtQuantidade.setText("");
        
    }

    void habilitar() {
       txtIdconsumo.setVisible(false);
        
        txtIdreserva.setVisible(false);
        txtCliente.setEnabled(true);
        txtIdproduto.setVisible(false);
        txtNomeProduto.setEnabled(true);
        txtQuantidade.setEnabled(true);
        
        txtPreco_Venda.setEnabled(true);
        JcomboStatus.setEnabled(true);
        
        jButton_Salvar.setEnabled(true);
        jButton_cancelar.setEnabled(true);
        jButton_Excluir.setEnabled(true);
        
        txtIdconsumo.setText("");
        txtPreco_Venda.setText("");
        txtIdproduto.setText("");
        txtNomeProduto.setText("");
        txtQuantidade.setText("");
        
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            LogConsumo func = new LogConsumo();
            modelo = func.mostrar(buscar);
            TabelaLista.setModel(modelo);
            ocultar_colunas();
            LabelTotalRegistros.setText("Total Registros = " + Integer.toString(func.totalRegistros));
            jLabelConsumo.setText("Consumo Total R$" + func.totalConsumo);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
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

        jPanel1 = new javax.swing.JPanel();
        txtIdconsumo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdreserva = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPreco_Venda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JcomboStatus = new javax.swing.JComboBox();
        jButton_Novo = new javax.swing.JButton();
        jButton_Salvar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        txtIdproduto = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        jButtonBuscarProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaLista = new javax.swing.JTable();
        jButton_Excluir = new javax.swing.JButton();
        jButton_Sair = new javax.swing.JButton();
        LabelTotalRegistros = new javax.swing.JLabel();
        jLabelConsumo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Consumo"));

        jLabel2.setText("Reserva.:");

        txtIdreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdreservaActionPerformed(evt);
            }
        });

        jLabel4.setText("Produto.:");

        jLabel6.setText("Preço Venda.:");

        txtPreco_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreco_VendaActionPerformed(evt);
            }
        });

        jLabel7.setText("Status.:");

        JcomboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Confirmado", "Cancelado" }));
        JcomboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboStatusActionPerformed(evt);
            }
        });

        jButton_Novo.setBackground(new java.awt.Color(51, 51, 51));
        jButton_Novo.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/novo.png"))); // NOI18N
        jButton_Novo.setText("Novo");
        jButton_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NovoActionPerformed(evt);
            }
        });

        jButton_Salvar.setBackground(new java.awt.Color(51, 51, 51));
        jButton_Salvar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/salvar.png"))); // NOI18N
        jButton_Salvar.setText("Salvar");
        jButton_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarActionPerformed(evt);
            }
        });

        jButton_cancelar.setBackground(new java.awt.Color(51, 51, 51));
        jButton_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/cancelar.png"))); // NOI18N
        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        txtIdproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdprodutoActionPerformed(evt);
            }
        });

        jButtonBuscarProduto.setText("...");
        jButtonBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProdutoActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade.:");

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_cancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtIdproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(24, 24, 24)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JcomboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPreco_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIdreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtIdconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBuscarProduto)
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPreco_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JcomboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Novo)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButton_cancelar)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Consumo");

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listagem de Consumo"));

        TabelaLista.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelaLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaListaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelaLista);

        jButton_Excluir.setBackground(new java.awt.Color(51, 51, 51));
        jButton_Excluir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/excluir.png"))); // NOI18N
        jButton_Excluir.setText("Excluir");
        jButton_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirActionPerformed(evt);
            }
        });

        jButton_Sair.setBackground(new java.awt.Color(51, 51, 51));
        jButton_Sair.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/sair.png"))); // NOI18N
        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        LabelTotalRegistros.setText("Registros ");

        jLabelConsumo.setText("Consumo.:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jButton_Excluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Sair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelConsumo)
                        .addGap(149, 149, 149)
                        .addComponent(LabelTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Excluir)
                    .addComponent(jButton_Sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConsumo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdreservaActionPerformed
        // TODO add your handling code here:
        txtIdreserva.transferFocus();
    }//GEN-LAST:event_txtIdreservaActionPerformed

    private void txtPreco_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreco_VendaActionPerformed
        // TODO add your handling code here:
        txtPreco_Venda.transferFocus();
    }//GEN-LAST:event_txtPreco_VendaActionPerformed

    private void JcomboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboStatusActionPerformed
        // TODO add your handling code here:
        JcomboStatus.transferFocus();
    }//GEN-LAST:event_JcomboStatusActionPerformed

    private void jButton_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NovoActionPerformed
        // TODO add your handling code here:
        habilitar();
        jButton_Salvar.setText("Salvar");
        acao = "salvar";
    }//GEN-LAST:event_jButton_NovoActionPerformed

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
        // TODO add your handling code here:
        if (txtIdproduto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Favor preencher o campo Produto!");
            jButtonBuscarProduto.requestFocus();
            return;
        }

        if (txtQuantidade.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Favor preencher o campo Quantidade!");
            txtQuantidade.requestFocus();
            return;
        }

        if (txtPreco_Venda.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Favor preencher o campo Preço de Venda!");
            txtPreco_Venda.requestFocus();
            return;
        }

        DadConsumo dts = new DadConsumo();
        LogConsumo func = new LogConsumo();

        dts.setIdreserva(Integer.parseInt(txtIdreserva.getText()));
        dts.setIdproduto(Integer.parseInt(txtIdproduto.getText()));
        dts.setQuantidade(Double.parseDouble(txtQuantidade.getText()));
        dts.setPreco_venda(Double.parseDouble(txtPreco_Venda.getText()));
        
        int selecionado = JcomboStatus.getSelectedIndex();
        dts.setEstado((String) JcomboStatus.getItemAt(selecionado));

        if (acao.equals("salvar")) {
            if (func.inserir(dts)) {
                JOptionPane.showMessageDialog(rootPane, "O Consumo " + txtNomeProduto.getText()+ " do Cliente "
                + txtCliente.getText() + " foi registrado com sucesso!");
                mostrar(idreserva);
                inabilitar();
            }
        } else if (acao.equals("editar")) {
            dts.setIdconsumo(Integer.parseInt(txtIdconsumo.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "O Consumo " + txtCliente.getText() + " foi editado com sucesso!" );
                mostrar(idreserva);
                inabilitar();
            }
        }
    }//GEN-LAST:event_jButton_SalvarActionPerformed

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        // TODO add your handling code here
        //this.dispose();
        this.inabilitar();
    }//GEN-LAST:event_jButton_cancelarActionPerformed

    private void TabelaListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaListaMouseClicked
        // TODO add your handling code here:
        jButton_Salvar.setText("Editar");
        habilitar();
        jButton_Excluir.setEnabled(true);
        acao = "editar";

        int fila = TabelaLista.rowAtPoint(evt.getPoint());

        txtIdconsumo.setText(TabelaLista.getValueAt(fila, 0).toString());
        txtIdreserva.setText(TabelaLista.getValueAt(fila, 1).toString());
        txtIdproduto.setText(TabelaLista.getValueAt(fila, 2).toString());
        txtNomeProduto.setText(TabelaLista.getValueAt(fila, 3).toString());
        txtQuantidade.setText(TabelaLista.getValueAt(fila, 4).toString());
        txtPreco_Venda.setText(TabelaLista.getValueAt(fila, 5).toString());
        JcomboStatus.setSelectedItem(TabelaLista.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_TabelaListaMouseClicked

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
        // TODO add your handling code here:
        if (!txtIdconsumo.getText().equals("")) {
            int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir o Produto?", "Confirmar", 2);

            if (confirmacao == 0) {
                LogConsumo func = new LogConsumo();
                DadConsumo dts = new DadConsumo();

                dts.setIdconsumo(Integer.parseInt(txtIdconsumo.getText()));
                func.excluir(dts);
                mostrar(idreserva);
                inabilitar();
            }
        }
    }//GEN-LAST:event_jButton_ExcluirActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void txtIdprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdprodutoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void jButtonBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProdutoActionPerformed
        // TODO add your handling code here:
        JfrmViewProduto frm = new JfrmViewProduto();
        frm.toFront();
        frm.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmConsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JcomboStatus;
    private javax.swing.JLabel LabelTotalRegistros;
    private javax.swing.JTable TabelaLista;
    private javax.swing.JButton jButtonBuscarProduto;
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Novo;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelConsumo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtIdconsumo;
    public static javax.swing.JTextField txtIdproduto;
    private javax.swing.JTextField txtIdreserva;
    public static javax.swing.JTextField txtNomeProduto;
    public static javax.swing.JTextField txtPreco_Venda;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
