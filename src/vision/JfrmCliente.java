/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vision;

import model.DadCliente;
import control.LogCliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class JfrmCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form JfrmCliente
     */
    public JfrmCliente() {
        initComponents();
        mostrar("");
        inabilitar();
    }
    
    private String acao = "salvar";

    void ocultar_colunas() {
        TabelaLista.getColumnModel().getColumn(0).setMaxWidth(0);
        TabelaLista.getColumnModel().getColumn(0).setMinWidth(0);
        TabelaLista.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void inabilitar() {
        txtIdPessoa.setVisible(false);
        txtNomeCliente.setEnabled(false);
        txtCpfCliente.setEnabled(false);
        txtRgCliente.setEnabled(false);
        txtEnderecoCliente.setEnabled(false);
        txtFoneResCliente.setEnabled(false);
        txtCelularCliente.setEnabled(false);
        txtEmailCliente.setEnabled(false);
        txtCodigoCliente.setEnabled(false);
        
        jButton_Salvar.setEnabled(false);
        jButton_cancelar.setEnabled(false);
        jButton_Excluir.setEnabled(false);
        txtIdPessoa.setText("");
        txtNomeCliente.setText("");
        txtCpfCliente.setText("");
        txtRgCliente.setText("");
        txtEnderecoCliente.setText("");
        txtFoneResCliente.setText("");
        txtCelularCliente.setText("");
        txtEmailCliente.setText("");
        txtCodigoCliente.setText("");
    }

    void habilitar() {
        txtIdPessoa.setVisible(false);
        
        txtNomeCliente.setEnabled(true);
        txtCpfCliente.setEnabled(true);
        txtRgCliente.setEnabled(true);
        txtEnderecoCliente.setEnabled(true);
        txtFoneResCliente.setEnabled(true);
        txtCelularCliente.setEnabled(true);
        txtEmailCliente.setEnabled(true);
        txtCodigoCliente.setEnabled(true);
        
        jButton_Salvar.setEnabled(true);
        jButton_cancelar.setEnabled(true);
        jButton_Excluir.setEnabled(true);
        txtIdPessoa.setText("");
        txtNomeCliente.setText("");
        txtCpfCliente.setText("");
        txtRgCliente.setText("");
        txtEnderecoCliente.setText("");
        txtFoneResCliente.setText("");
        txtCelularCliente.setText("");
        txtEmailCliente.setText("");
        txtCodigoCliente.setText("");
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            LogCliente func = new LogCliente();
            modelo = func.mostrar(buscar);
            TabelaLista.setModel(modelo);
            ocultar_colunas();
            LabelTotalRegistros.setText("Total Registros = " + Integer.toString(func.totalRegistros));

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
        txtIdPessoa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEnderecoCliente = new javax.swing.JTextField();
        jButton_Novo = new javax.swing.JButton();
        jButton_Salvar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRgCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFoneResCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCelularCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaLista = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jButton_Excluir = new javax.swing.JButton();
        jButton_Sair = new javax.swing.JButton();
        LabelTotalRegistros = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Clientes"));

        jLabel2.setText("Nome do Cliente.:");

        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço.:");

        txtEnderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoClienteActionPerformed(evt);
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

        jLabel3.setText("CPF do Cliente.:");

        txtCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("RG do Cliente.:");

        txtRgCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Fone Res. Com.:");

        txtFoneResCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoneResClienteActionPerformed(evt);
            }
        });

        jLabel8.setText("Fone Celular.:");

        txtCelularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularClienteActionPerformed(evt);
            }
        });

        jLabel10.setText("Código Cliente");

        txtCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoClienteActionPerformed(evt);
            }
        });

        jLabel11.setText("Email.:");

        txtEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_cancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(288, Short.MAX_VALUE)
                                .addComponent(txtIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(txtNomeCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addComponent(txtCpfCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailCliente)
                                    .addComponent(txtCodigoCliente)
                                    .addComponent(txtCelularCliente)
                                    .addComponent(txtEnderecoCliente)
                                    .addComponent(txtRgCliente)
                                    .addComponent(txtFoneResCliente))))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFoneResCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Novo)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButton_cancelar)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Clientes");

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listagem de Clientes"));

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

        jLabel9.setText("Buscar.:");

        jButton_Buscar.setBackground(new java.awt.Color(51, 51, 51));
        jButton_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/buscar.png"))); // NOI18N
        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Excluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Sair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LabelTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar)
                    .addComponent(jButton_Excluir)
                    .addComponent(jButton_Sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
        txtNomeCliente.transferFocus();
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void txtEnderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoClienteActionPerformed
        // TODO add your handling code here:
        txtEnderecoCliente.transferFocus();
    }//GEN-LAST:event_txtEnderecoClienteActionPerformed

    private void jButton_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NovoActionPerformed
        // TODO add your handling code here:
        habilitar();
        jButton_Salvar.setText("Salvar");
        acao = "salvar";
    }//GEN-LAST:event_jButton_NovoActionPerformed

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
        // TODO add your handling code here:
        if (txtNomeCliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Favor preencher o campo Nome do Cliente!");
            txtNomeCliente.requestFocus();
            return;
        }

        if (txtCpfCliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Favor preencher o campo CPF!");
            txtCpfCliente.requestFocus();
            return;
        }

        if (txtRgCliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Favor preencher o campo RG do cliente!");
            txtRgCliente.requestFocus();
            return;
        }

        DadCliente dts = new DadCliente();
        LogCliente func = new LogCliente();

        dts.setNome(txtNomeCliente.getText());

        dts.setCpf(txtCpfCliente.getText());

        dts.setRg(txtRgCliente.getText());
        
        dts.setEndereco(txtEnderecoCliente.getText());
        
        dts.setEmail(txtEmailCliente.getText());
        
        dts.setFone_res_com(txtFoneResCliente.getText());
        
        dts.setFone_cel(txtCelularCliente.getText());
        
        dts.setCodigo_cliente(txtCodigoCliente.getText());

        

        if (acao.equals("salvar")) {
            if (func.inserir(dts)) {
                JOptionPane.showMessageDialog(rootPane, "O Cliente foi salvo com sucesso!");
                mostrar("");
                inabilitar();
            }
        } else if (acao.equals("editar")) {
            dts.setIdpessoa(Integer.parseInt(txtIdPessoa.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "O Cliente foi editado com sucesso!");
                mostrar("");
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

        txtIdPessoa.setText(TabelaLista.getValueAt(fila, 0).toString());
        txtNomeCliente.setText(TabelaLista.getValueAt(fila, 1).toString());
        txtCpfCliente.setText(TabelaLista.getValueAt(fila, 2).toString());
        txtRgCliente.setText(TabelaLista.getValueAt(fila, 3).toString());
        txtEnderecoCliente.setText(TabelaLista.getValueAt(fila, 4).toString());
        txtFoneResCliente.setText(TabelaLista.getValueAt(fila, 5).toString());
        txtCelularCliente.setText(TabelaLista.getValueAt(fila, 6).toString());
        txtEmailCliente.setText(TabelaLista.getValueAt(fila, 7).toString());
        txtCodigoCliente.setText(TabelaLista.getValueAt(fila, 8).toString());
    }//GEN-LAST:event_TabelaListaMouseClicked

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
        // TODO add your handling code here:
        if (!txtIdPessoa.getText().equals("")) {
            int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir o Cliente?", "Confirmar", 2);

            if (confirmacao == 0) {
                LogCliente func = new LogCliente();
                DadCliente dts = new DadCliente();

                dts.setIdpessoa(Integer.parseInt(txtIdPessoa.getText()));
                func.excluir(dts);
                mostrar("");
                inabilitar();
            }
        }
    }//GEN-LAST:event_jButton_ExcluirActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void txtCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClienteActionPerformed
        // TODO add your handling code here:
        txtCpfCliente.transferFocus();
    }//GEN-LAST:event_txtCpfClienteActionPerformed

    private void txtRgClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgClienteActionPerformed
        // TODO add your handling code here:
        txtRgCliente.transferFocus();
    }//GEN-LAST:event_txtRgClienteActionPerformed

    private void txtFoneResClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoneResClienteActionPerformed
        // TODO add your handling code here:
        txtFoneResCliente.transferFocus();
    }//GEN-LAST:event_txtFoneResClienteActionPerformed

    private void txtCelularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularClienteActionPerformed
        // TODO add your handling code here:
        txtCelularCliente.transferFocus();
    }//GEN-LAST:event_txtCelularClienteActionPerformed

    private void txtCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoClienteActionPerformed
        // TODO add your handling code here:
        txtCodigoCliente.transferFocus();
    }//GEN-LAST:event_txtCodigoClienteActionPerformed

    private void txtEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailClienteActionPerformed
        // TODO add your handling code here:
        txtEmailCliente.transferFocus();
    }//GEN-LAST:event_txtEmailClienteActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTotalRegistros;
    private javax.swing.JTable TabelaLista;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Novo;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelularCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCpfCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtFoneResCliente;
    private javax.swing.JTextField txtIdPessoa;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtRgCliente;
    // End of variables declaration//GEN-END:variables
}
