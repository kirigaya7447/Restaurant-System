package PRINCIPAL;

import VARIAVEIS.Administracao;
import CODIGOINTERNO.CIAdministracao;
import CODIGOINTERNO.CIFuncionario;
import CODIGOINTERNO.CIRegistro;
import VARIAVEIS.DataHora;
import VARIAVEIS.Funcionario;
import VARIAVEIS.Registro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IfrmAdministracao extends javax.swing.JInternalFrame {

    private static IfrmAdministracao ifrmAdministracao;
    Administracao a1 = new Administracao();
    CIAdministracao cia1 = new CIAdministracao();
    Registro r = new Registro();
    CIRegistro reg = new CIRegistro();
    DataHora dh = new DataHora();
    CIFuncionario cif = new CIFuncionario();
    Funcionario f = new Funcionario();

    public static IfrmAdministracao getInstancia() {
        if (ifrmAdministracao == null) {
            ifrmAdministracao = new IfrmAdministracao();
        }
        return ifrmAdministracao;
    }

    public IfrmAdministracao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdministracao = new javax.swing.JPanel();
        lblNivel = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        cbxNivel = new javax.swing.JComboBox();
        btnInserir = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JToggleButton();
        pnlTabelaAdministracao = new javax.swing.JScrollPane();
        tblAdministrativo = new javax.swing.JTable();
        lblDescricao2 = new javax.swing.JLabel();

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

        pnlAdministracao.setBackground(new java.awt.Color(0, 153, 153));

        lblNivel.setText("Nível da administração:");

        lblDescricao.setText("Descrição do nível:");

        cbxNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NIVEL:", "00", "01", "02", "03", "04", "05" }));

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Confirmar.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Apagar.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblAdministrativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nível:", "Descrição:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdministrativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdministrativoMouseClicked(evt);
            }
        });
        pnlTabelaAdministracao.setViewportView(tblAdministrativo);

        lblDescricao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricao2.setMaximumSize(new java.awt.Dimension(0, 100));
        lblDescricao2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblDescricao2PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlAdministracaoLayout = new javax.swing.GroupLayout(pnlAdministracao);
        pnlAdministracao.setLayout(pnlAdministracaoLayout);
        pnlAdministracaoLayout.setHorizontalGroup(
            pnlAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdministracaoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAdministracaoLayout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(btnPesquisar))
                            .addGroup(pnlAdministracaoLayout.createSequentialGroup()
                                .addComponent(btnInserir)
                                .addGap(48, 48, 48)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemover)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)))
                        .addContainerGap(102, Short.MAX_VALUE))
                    .addGroup(pnlAdministracaoLayout.createSequentialGroup()
                        .addComponent(lblNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(pnlAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(lblDescricao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(pnlTabelaAdministracao)
        );
        pnlAdministracaoLayout.setVerticalGroup(
            pnlAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministracaoLayout.createSequentialGroup()
                .addGroup(pnlAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdministracaoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNivel)
                            .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdministracaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(lblDescricao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(pnlAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnRemover)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabelaAdministracao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdministracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdministracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (cbxNivel.getSelectedItem().equals("NIVEL:")) {
            JOptionPane.showMessageDialog(null, "Você não selecionou nenhum nivel para remover", "Sem dados!", JOptionPane.ERROR_MESSAGE);
            registrarTRemocao();
        } else {
            int confirma;
            confirma = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja remover?\n Será permanente", "Confirmação:", JOptionPane.YES_NO_OPTION);
            if (confirma == 0) {
                cia1.remover(cbxNivel.getSelectedItem().toString());
                preencherTabela(null);
                limpar();
                registrarRemocao();
            } else {
                preencherTabela(null);
                limpar();
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            if (campoVazio() == false) {
                a1.setNivelAdministracao(cbxNivel.getSelectedItem().toString());
                a1.setDescricaoAdministracao(lblDescricao2.getText());
                preencherAdministrativo();
                cia1.inserir(a1);
                registrarInsercao();
                JOptionPane.showMessageDialog(null, "Inserção feita com sucesso !", " ", JOptionPane.INFORMATION_MESSAGE);
                preencherTabela(null);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Há campos vazios que devem ser preenchidos", "Há campos vazios", JOptionPane.WARNING_MESSAGE);
                registrarTInsercao();
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Este nível já está inserido!!!!", "Erro!!", JOptionPane.ERROR_MESSAGE);
            registrarTInsercao();
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        preencherAdministrativo();
        if (campoVazio() == false) {
            int simNao = JOptionPane.showConfirmDialog(null, "Tem certeza que irá alterar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (simNao == 0) {
                String nivelAdministracao;
                if (tblAdministrativo.getSelectedRow() > -1) {
                    nivelAdministracao = tblAdministrativo.getValueAt(tblAdministrativo.getSelectedRow(), 0).toString();
                } else {
                    nivelAdministracao = cbxNivel.getSelectedItem().toString();
                }
                cia1.alterar(a1, nivelAdministracao);
                
                registrarAlteracao();
                JOptionPane.showMessageDialog(null, "A alteração foi realizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                preencherTabela(null);
                limpar();
            } else {
                preencherTabela(null);
                limpar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Há campos vazios", "Erro!", JOptionPane.ERROR_MESSAGE);
            registrarTAlteracao();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (btnPesquisar.isSelected()) {
            preencherTabela(cbxNivel.getSelectedItem().toString());
            btnPesquisar.setText("Cancelar");
        } else {
            btnPesquisar.setText("Pesquisar");
            preencherTabela(null);
            limpar();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblAdministrativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdministrativoMouseClicked
        if (tblAdministrativo.getSelectedRow() > -1) {
            cbxNivel.setSelectedItem(tblAdministrativo.getValueAt(tblAdministrativo.getSelectedRow(), 0).toString());
            lblDescricao2.setText(tblAdministrativo.getValueAt(tblAdministrativo.getSelectedRow(), 1).toString());
            habilitarBotoes(true);
        }
    }//GEN-LAST:event_tblAdministrativoMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela(null);
    }//GEN-LAST:event_formInternalFrameOpened

    private void lblDescricao2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblDescricao2PropertyChange

    }//GEN-LAST:event_lblDescricao2PropertyChange

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        limpar();
    }//GEN-LAST:event_formInternalFrameClosed
    private void limpar() {
        cbxNivel.setSelectedItem("NIVEL:");
        lblDescricao2.setText("");
        tblAdministrativo.clearSelection();
        habilitarBotoes(false);
    }

    private boolean campoVazio() {
        boolean vazio = false;
        if (cbxNivel.getSelectedItem().equals("NIVEL:")
                || lblDescricao2.getText() == null) {
            vazio = true;
        }
        return vazio;
    }

    private void preencherTabela(String nivelAdministracao) {
        ArrayList<Administracao> administrativoTabe = cia1.pesquisar(nivelAdministracao);
        DefaultTableModel modelo = (DefaultTableModel) tblAdministrativo.getModel();
        modelo.setNumRows(0);
        for (Administracao a1 : administrativoTabe) {
            modelo.addRow(new String[]{a1.getNivelAdministracao(), a1.getDescricaoAdministracao()});
        }
        tblAdministrativo.setModel(modelo);

    }

    private void preencherAdministrativo() {
        a1.setNivelAdministracao(cbxNivel.getSelectedItem().toString());
        a1.setDescricaoAdministracao(lblDescricao2.getText());
    }

    private void habilitarBotoes(boolean habilitar) {
        if (habilitar) {
            btnRemover.setEnabled(true);
            btnAlterar.setEnabled(true);
        } else {
            btnRemover.setEnabled(false);
            btnAlterar.setEnabled(false);
        }
    }
    
    private void preencherRegistro() {
        r.setCpfCliente(null);
        r.setCpfAutor(FrmPrincipal.cpfAutor);
        r.setData(dh.getData());
        r.setHora(dh.getHora());
    }
    
    private void registrarAlteracao() {
        r.setAcaoRegistro("Tentativa de alteração bem-sucedida (Administração).");
        preencherRegistro();
        reg.registrar(r, dh);
    }
    
    private void registrarTAlteracao() {
        r.setAcaoRegistro("Tentativa de alteração fracassada (Administração).");
        preencherRegistro();
        reg.registrar(r, dh);
    }
    
    private void registrarRemocao() {
        r.setAcaoRegistro("Tentativa de remoção bem-sucedida (Administração).");
        preencherRegistro();
        reg.registrar(r, dh);
    }
    private void registrarTRemocao() {
        r.setAcaoRegistro("Tentativa de remoção fracassada (Administração).");
        preencherRegistro();
        reg.registrar(r, dh);
    }
    private void registrarInsercao() {
        r.setAcaoRegistro("Tentativa de inserção bem-sucedida (Administração).");
        preencherRegistro();
        reg.registrar(r, dh);
    }
    private void registrarTInsercao() {
        r.setAcaoRegistro("Tentativa de inserção fracassada (Administração).");
        preencherRegistro();
        reg.registrar(r, dh);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JToggleButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox cbxNivel;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricao2;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JPanel pnlAdministracao;
    private javax.swing.JScrollPane pnlTabelaAdministracao;
    private javax.swing.JTable tblAdministrativo;
    // End of variables declaration//GEN-END:variables
}
