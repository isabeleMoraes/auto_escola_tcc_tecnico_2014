/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.Apresentaçao;

import br.com.isabele.Dao.AulaDao;
import br.com.isabele.Dao.VeiculoDao;
import br.com.isabele.modelo.Aula;
import br.com.isabele.modelo.Veiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Belinha
 */
public class CadastroDeVeiculo extends javax.swing.JFrame {
    private FrmPrincipal fPrin;
    
    /**
     * Creates new form CadastroDeVeiculo
     */
    public CadastroDeVeiculo() {
        initComponents();
    }
    public CadastroDeVeiculo(javax.swing.JFrame frm) {
        this();
        fPrin = (FrmPrincipal) frm;
    }

     boolean alterarVeiculo = false;
     int cor;
     int combustivel;
     String nomeCor = null;
     String tipoCombustivel;
     
    
    /*LEMBRETES:
    verificar como fazer funcionar o alterar, ecomo trazer no combo box.E como limpar os campos clicando no campo codigo 
    */
   
    public void LiberarCampos(){
        Placa.setEnabled(true);
        cbCor.setEnabled(true);
        cbCombustivel.setEnabled(true);
        Modelo.setEnabled(true);
        Ano.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }
    public void BloquearCampos(){
        Placa.setEnabled(false);
        cbCor.setEnabled(false);
        cbCombustivel.setEnabled(false);
        Modelo.setEnabled(false);
        Ano.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    public void LimparCampos(){
        Placa.setText("");
        cbCor.setSelectedIndex(0);
        cbCombustivel.setSelectedIndex(0);
        Modelo.setText("");
        Ano.setText("");
    }
    public void comboCor(){
        cor = cbCor.getSelectedIndex();
         
        
         if(cor == 0){
               nomeCor = "Branco";
           }else{
               if (cor == 1){
                  nomeCor = "Preto";
               }else{
                   if(cor == 2){
                       nomeCor = "Azul"; 
                   }else{
                       if(cor == 3){
                           nomeCor = "Vermelho";
                       }else{
                           if(cor == 4){
                               nomeCor = "Prata";
                           }else{
                               nomeCor = "Amarelo";
                           }
                       }
                   }
               }
           }
        }
    public void comboCombustivel(){
       combustivel = cbCombustivel.getSelectedIndex();
                 
         if(combustivel == 0){
               tipoCombustivel = "Gasolina";
           }else{
               if (combustivel == 1){
                  tipoCombustivel = "Etanol";
               }else{
                   if(combustivel == 2){
                       tipoCombustivel = "Disel"; 
                   }else{
                       tipoCombustivel = "Gas";
                   }
               }
           }
        
    }
    public void setarCampos(String placa, String cor, String combustivel, String modelo, int ano){
        BloquearCampos();
        Veiculo v = new Veiculo();
        Placa.setText(placa);
        cbCor.setSelectedItem(cor);
        cbCombustivel.setSelectedItem(combustivel);
        Modelo.setText(modelo);
        Ano.setText(Integer.toString(ano));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        Ano = new javax.swing.JTextField();
        cbCombustivel = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbCor = new javax.swing.JComboBox();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        Placa = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de veiculos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Veiculo"));

        jLabel1.setText("Placa:");

        jLabel2.setText("Cor:");

        jLabel3.setText("Combustivel:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Ano:");

        cbCombustivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gasolina", "Etanol", "Disel", "Gas" }));

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

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416104181_DeleteRed.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Veiculo.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        cbCor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Branco", "Preto", "Azul", "Vermelho", "Prata", "Amarelo" }));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416103914_editor_trash_delete_recycle_bin_-24.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCombustivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(25, 25, 25)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSalvar)
                            .addGap(18, 18, 18)
                            .addComponent(btnAlterar)
                            .addGap(18, 18, 18)
                            .addComponent(btnExcluir)
                            .addGap(17, 17, 17)
                            .addComponent(btnCancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnCancelar)
                            .addComponent(btnAlterar)
                            .addComponent(btnExcluir))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenu1.setText("Arquivo");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Veiculo v = new Veiculo();
   
        comboCor();
        comboCombustivel();
        
        try{
           
                VeiculoDao dao = new VeiculoDao(); 
                if(alterarVeiculo == true){
                    
                    v.setPlaca(Placa.getText());
                    v.setCor(nomeCor);
                    v.setTipoCombustivel(tipoCombustivel);
                    v.setModelo(Modelo.getText());
                    v.setAno(Integer.parseInt(Ano.getText()));
                  
                    
                    dao.alterarVeiculo(v);
                    JOptionPane.showMessageDialog(this, "Veiculo alterado com secesso!");
                }else{
                    v.setPlaca(Placa.getText());
                    v.setCor(nomeCor);
                    v.setTipoCombustivel(tipoCombustivel);
                    v.setModelo(Modelo.getText());
                    v.setAno(Integer.parseInt(Ano.getText()));
                    
                    dao.cadastrarVeiculo(v);
                
                    JOptionPane.showMessageDialog(this, "Veiculo cadastrado com sucesso!");
                }
               
                //Codigo.selectAll();
                LimparCampos();
                alterarVeiculo = false;
               // this.dispose();
            }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Preenchimento incorreto!");
        }
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        alterarVeiculo =false;
        VeiculoDao dao = new VeiculoDao();
        
        if(Placa.getText().isEmpty()){        
            PesquisarVeiculo frm = new PesquisarVeiculo(this);
            frm.setVisible(true);
            frm.setAlwaysOnTop(true);
            frm.setLocationRelativeTo(null);
        }else{
            try{
                Veiculo v = dao.buscarVeiculo(Placa.getText());

                Placa.setText(v.getPlaca());
                cbCor.setSelectedItem(v.getCor());
                cbCombustivel.setSelectedItem(v.getTipoCombustivel());
                Modelo.setText(v.getModelo());
                Ano.setText(Integer.toString(v.getAno()));

                BloquearCampos();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Placa do veiculo incorreto!");
                LimparCampos();
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirmar == JOptionPane.YES_OPTION){
            try{
            Veiculo v = new Veiculo();
            AulaDao daao = new AulaDao();
            ArrayList<Aula> aulas = null;
            
            aulas = daao.listarAulaVeiculo(Placa.getText());
            
            if(aulas.size() == 0){
                v.setPlaca(Placa.getText());

                VeiculoDao dao = new VeiculoDao();
                dao.excluirVeiculo(v);
                LimparCampos();
            }else{
                JOptionPane.showMessageDialog(this, "O veiculo nao pode ser excluido pois há aulas vinculadas a ele!");
            }
            
        }catch(Exception e){
                   JOptionPane.showMessageDialog(this, "Informe um aluno a ser excuido");
             }
    
            
        }    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(Placa.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe o aluno", "OPS!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            alterarVeiculo = true;
            LiberarCampos();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        LimparCampos();
        LiberarCampos();
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_SairActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ano;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField Placa;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbCombustivel;
    private javax.swing.JComboBox cbCor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
