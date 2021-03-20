/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.Apresentaçao;

import br.com.isabele.Dao.AulaDao;
import br.com.isabele.Dao.ExameDao;
import br.com.isabele.Dao.InstrutorDao;
import br.com.isabele.Dao.VeiculoDao;
import br.com.isabele.modelo.Aluno;
import br.com.isabele.modelo.Aula;
import br.com.isabele.modelo.Exame;
import br.com.isabele.modelo.Instrutor;
import br.com.isabele.modelo.Veiculo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Belinha
 */
public class CadastrarExame extends javax.swing.JFrame {
    private FrmPrincipal fPrin;
    private FrmExames fExame;
    private frmListarExame fLExames;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    
    
    int codigoAluno = 0;
    String placai;
    int tela;
    
    
    public CadastrarExame() {
        initComponents();
        Aluno.setEditable(false);
        placa.setEditable(false);
    }
    
    public CadastrarExame(javax.swing.JFrame frm) {
        this();
        fPrin = (FrmPrincipal) frm;
    }
    public CadastrarExame(javax.swing.JFrame frm,Exame ex, int b) {
        this();
        alterarExame = true;
        
            codigo.setText(Integer.toString(ex.getCodExame()));
            Aluno.setText(Integer.toString(ex.getCodAluno()));
            codigoAluno = ex.getCodAluno();
            placa.setText(ex.getPlaca());
            placai = ex.getPlaca();
            Data.setDate(ex.getDataExame());
            Hora.setText(sdf.format(ex.getHora()));
            cbCategoria.setSelectedItem(ex.getCategoria());
            if(ex.getRealizado() == 1){
                cbRealizado.setSelected(true);
            }else{
                cbRealizado.setSelected(false);
            }
            
            if(b == 1){
                fExame = (FrmExames) frm;
                tela=1;
            }else{
                fLExames = (frmListarExame) frm;
            }
        
    }

     boolean alterarExame = false;
    
     public void LiberarCampos(){
        codigo.setEnabled(true);
        Aluno.setEnabled(true);
        placa.setEnabled(true);
        Data.setEnabled(true);
        Hora.setEnabled(true);
        cbCategoria.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(true);
        cbRealizado.setEnabled(true);
        
    }
    public void BloquearCampos(){
        codigo.setEnabled(false);
        Aluno.setEnabled(false);
        placa.setEnabled(false);
        Data.setEnabled(false);
        Hora.setEnabled(false);
        cbCategoria.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
        cbRealizado.setEnabled(false);
    }
    public void LimparCampos(){
        codigo.setText("");
        Aluno.setText("");
        placa.setText("");
        Data.setDate(null);
        Hora.setText("");
        cbCategoria.setSelectedIndex(0);
    }
    
    public void setarAluno(String nome, int Codigo){
        Aluno.setText(nome);
        codigoAluno = Codigo;
    }
    public void setarVeiculo(String Placa){
        placa.setText(Placa);
        placai = Placa;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        Aluno = new javax.swing.JTextField();
        placa = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox();
        Data = new com.toedter.calendar.JDateChooser();
        btnPesquisar = new javax.swing.JButton();
        btnPesquisarAluno = new javax.swing.JButton();
        btnPesquisarPlaca = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        cbRealizado = new javax.swing.JCheckBox();
        Hora = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLimpar1 = new javax.swing.JButton();

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1415678111_edit-clear.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Exames");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do exame"));

        jLabel1.setText("Codigo:");

        jLabel3.setText("Aluno:");

        jLabel5.setText("Placa do veiculo:");

        jLabel6.setText("Data:");

        jLabel7.setText("Categoria:");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "A/B" }));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnPesquisarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAlunoActionPerformed(evt);
            }
        });

        btnPesquisarPlaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPlacaActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416102910_floppy-24.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416103240_edit-validated.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416104181_DeleteRed.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416103914_editor_trash_delete_recycle_bin_-24.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        cbRealizado.setText("Reaizado");

        try {
            Hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Hora:");

        btnLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1415678111_edit-clear.png"))); // NOI18N
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbRealizado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair)))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnPesquisarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbRealizado)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       if(Hora.getText().trim().equals(":") && Aluno.getText().isEmpty() && placa.getText().isEmpty() && Data.getDate() == null){
           this.dispose();
       }else{
           int confirmar = JOptionPane.showConfirmDialog(this, "As informações ainda nao foram salvas. Deseja realmente sair?", "Deseja Sair?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
           
           if(confirmar == JOptionPane.YES_OPTION){
               this.dispose();
           }
       }
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAlunoActionPerformed
        frmPesquisarAlunoExame frm = new frmPesquisarAlunoExame(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPesquisarAlunoActionPerformed

    private void btnPesquisarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPlacaActionPerformed
        frmPesquisarVeiculoExame frm = new frmPesquisarVeiculoExame(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPesquisarPlacaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        alterarExame = false;
        ExameDao dao = new ExameDao();

        try{
            Exame ex = dao.buscarExame(Integer.parseInt(codigo.getText()));

            codigo.setText(Integer.toString(ex.getCodExame()));
            Aluno.setText(Integer.toString(ex.getCodAluno()));
            placa.setText(ex.getPlaca());
            Data.setDate(ex.getDataExame());
            Hora.setText(sdf.format(ex.getHora()));
            cbCategoria.setSelectedItem(ex.getCategoria());
            if(ex.getRealizado() == 1){
                cbRealizado.setSelected(true);
            }else{
                cbRealizado.setSelected(false); 
            }

            BloquearCampos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Exame nao encontrado");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Exame ex = new Exame();
       
         int categoria = cbCategoria.getSelectedIndex();
         String nomeCategoria = null;
         int realizado;
        try{
           if(categoria == 0){
               nomeCategoria = "A";
           }else{
               if (categoria == 1){
                  nomeCategoria = "B";
               }else{
                   nomeCategoria = "A/B";
               }
           }
                
           if(cbRealizado.isSelected()){
               realizado = 1;
           }else{
               realizado = 0;
           }
                ExameDao dao = new ExameDao(); 
                if(alterarExame == true){
                    
                    ex.setCodExame(Integer.parseInt(codigo.getText()));
                    ex.setCodAluno(codigoAluno);
                    ex.setPlaca(placai);
                    ex.setDataExame(Data.getDate());
                    ex.setCategoria(nomeCategoria);
                    ex.setRealizado(realizado);
                    ex.setHora(new Time(sdf.parse(Hora.getText()).getTime()));
                    
                    dao.alterarExame(ex);

                    JOptionPane.showMessageDialog(this, "Exame alterado com secesso!");
                }else{
                    ex.setCodAluno(codigoAluno);
                    ex.setPlaca(placai);
                    ex.setDataExame(Data.getDate());
                    ex.setCategoria(nomeCategoria);
                    ex.setRealizado(realizado);
                    ex.setHora(new Time(sdf.parse(Hora.getText()).getTime()));
                    
                    dao.cadastrarExame(ex);
                
                    JOptionPane.showMessageDialog(this, "Exame cadastrado com sucesso!\n");
                }
                if(tela == 1){
                    fExame.atualizarTela();
                }
                
                LimparCampos();
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        LiberarCampos();
        alterarExame = true;
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try{
             int confirmar = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
             /*if(confirmar == JOptionPane.YES_OPTION){
                Instrutor i = new Instrutor();
                AulaDao daao = new AulaDao();
                ArrayList<Aula> aulas = null;
            
            aulas = daao.listarAulaInstrutor(Integer.parseInt(codigo. getText()));
            
            if(aulas.size() == 0){*/
        if(confirmar == JOptionPane.YES_OPTION){
            Exame e = new Exame();

            e.setCodExame(Integer.parseInt(codigo.getText()));

            ExameDao dao = new ExameDao();
            dao.excluirExame(e);
        }
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Informe o codigo do exame que deseja excluir", "Ops!", JOptionPane.ERROR_MESSAGE);
        }
        LimparCampos();
        alterarExame = false;
       
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
        LiberarCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        LimparCampos();
        LiberarCampos();
    }//GEN-LAST:event_btnLimpar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarExame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aluno;
    private com.toedter.calendar.JDateChooser Data;
    private javax.swing.JFormattedTextField Hora;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarAluno;
    private javax.swing.JButton btnPesquisarPlaca;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JCheckBox cbRealizado;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField placa;
    // End of variables declaration//GEN-END:variables
}
