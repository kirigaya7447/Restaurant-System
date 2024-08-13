/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRINCIPAL;

import CODIGOINTERNO.CIRegistro;
import VARIAVEIS.Funcionario;
import VARIAVEIS.Registro;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20211500032
 */
public class IfrmRegistro extends javax.swing.JInternalFrame {

    private static IfrmRegistro ifrmRegistro;
    CIRegistro cir = new CIRegistro();
    Registro reg = new Registro();
    
    public static IfrmRegistro getInstancia() {
        if (ifrmRegistro == null) {
            ifrmRegistro = new IfrmRegistro();
        }
        return ifrmRegistro;
    }
    
    public IfrmRegistro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        btnPesquisar = new javax.swing.JToggleButton();
        lblExplicacao = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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
                formInternalFrameOpened(evt);
            }
        });

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID - Registro", "Ação", "Data - Registro", "Hora - Registro", "CPF - Autor", "CPF - Funcionário", "CPF - Cliente", "ID - Reserva"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistro);

        lblCpf.setText("CPF do Autor:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblExplicacao.setText("Autor -> Usuário que fez a ação");

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(lblExplicacao))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(btnPesquisar))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(lblCpf)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExplicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela(null);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (btnPesquisar.isSelected()) {
            preencherTabela(txtCpf.getText().toString());
            btnPesquisar.setText("Cancelar");
        } else {
            btnPesquisar.setText("Pesquisar");
            preencherTabela(null);
            txtCpf.setText("   .   .   -  ");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        if (tblRegistro.getSelectedRow() > -1 && tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 4) != null ) {
            txtCpf.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tblRegistroMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        txtCpf.setText(null);
    }//GEN-LAST:event_formInternalFrameClosed

    private void preencherTabela(String cpfAutor) {
        ArrayList<Registro> registros = cir.pesquisar(cpfAutor);
        DefaultTableModel modelo = (DefaultTableModel) tblRegistro.getModel();
        modelo.setNumRows(0);
        for (Registro r : registros) {
            modelo.addRow(new String[]{
                r.getIdRegistro(), r.getAcaoRegistro(), r.getData(), r.getHora(), 
                r.getCpfAutor(), r.getCpfFuncionario(), r.getCpfCliente(), 
                r.getIdReserva()
            });
        
        }
        tblRegistro.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblExplicacao;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JFormattedTextField txtCpf;
    // End of variables declaration//GEN-END:variables
}
