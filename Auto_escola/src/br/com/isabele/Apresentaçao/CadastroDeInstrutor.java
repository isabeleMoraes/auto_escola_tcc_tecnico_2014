/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.Apresentaçao;

import br.com.isabele.Apresentaçao.CadastroDeInstrutor;
import br.com.isabele.Dao.AlunoDao;
import br.com.isabele.Dao.AulaDao;
import br.com.isabele.Dao.InstrutorDao;
import br.com.isabele.modelo.Aluno;
import br.com.isabele.modelo.Aula;
import br.com.isabele.modelo.Instrutor;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Belinha
 */
public class CadastroDeInstrutor extends javax.swing.JFrame {
    private FrmPrincipal fPrin;
    /**
     * Creates new form CadastroDeInstrutor
     */
    public CadastroDeInstrutor() {
        initComponents();
    }
    public CadastroDeInstrutor(javax.swing.JFrame frm) {
        this();
        fPrin = (FrmPrincipal) frm;
    }

     boolean alterarInstrutor = false;
    
    /*LEMBRETES:
    verificar como fazer funcionar o alterar, ecomo trazer no combo box.E como limpar os campos clicando no campo codigo 
    */
    
    public void LiberarCampos(){
        Codigo.setEnabled(true);
        Nome.setEnabled(true);
        CPF.setEnabled(true);
        Data.setEnabled(true);
        Rua.setEnabled(true);
        Bairro.setEnabled(true);
        Numero.setEnabled(true);
        Residencial.setEnabled(true);
        Celular1.setEnabled(true);
        Celular2 .setEnabled(true);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }
    public void BloquearCampos(){
        Codigo.setEnabled(false);
        Nome.setEnabled(false);
        CPF.setEnabled(false);
        Data.setEnabled(false);
        Rua.setEnabled(false);
        Bairro.setEnabled(false);
        Numero.setEnabled(false);
        Residencial.setEnabled(false);
        Celular1.setEnabled(false);
        Celular2 .setEnabled(false); 
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    public void LimparCampos(){
        Codigo.setText("");
        Nome.setText("");
        CPF.setText("");
        Data.setDate(null);
        Rua.setText("");
        Bairro.setText("");
        Numero.setText("");
        Residencial.setText("");
        Celular1.setText("");
        Celular2.setText("");
    }
    public void setarCampos(int codigo, String nome, String cpf, Date data, String rua, String bairro, int numero, int residencial, int celular1, int celular2){
        BloquearCampos();
        Instrutor i = new Instrutor();
        
        Codigo.setText(Integer.toString(codigo));
        Nome.setText(nome);
        CPF.setText(cpf);
        Data.setDate(data);
        Rua.setText(rua);
        Bairro.setText(bairro);
        Numero.setText(Integer.toString(numero));
        Residencial.setText(Integer.toString(residencial));
        Celular1.setText(Integer.toString(celular1));
        Celular2.setText(Integer.toString(celular2));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        Rua = new javax.swing.JTextField();
        Bairro = new javax.swing.JTextField();
        Numero = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        brnCancelar = new javax.swing.JButton();
        Codigo = new javax.swing.JTextField();
        Data = new com.toedter.calendar.JDateChooser();
        btnPesquisa = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JToggleButton();
        btnLimpar1 = new javax.swing.JButton();
        CPF = new javax.swing.JTextField();
        Residencial = new javax.swing.JTextField();
        Celular1 = new javax.swing.JTextField();
        Celular2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Instrutores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do instrutor"));

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Data de Nascimento:");

        jLabel5.setText("Numero:");

        jLabel6.setText("Rua:");

        jLabel7.setText("Bairro:");

        jLabel9.setText("Residencial:");

        jLabel10.setText("Celular:");

        jLabel11.setText("Celular 2:");

        Bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BairroActionPerformed(evt);
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

        brnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416104181_DeleteRed.png"))); // NOI18N
        brnCancelar.setText("Cancelar");
        brnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCancelarActionPerformed(evt);
            }
        });

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Instrutor.png"))); // NOI18N
        jLabel12.setText("jLabel12");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnSalvar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Residencial, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Celular1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnAlterar)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Celular2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(brnCancelar)
                                .addGap(48, 48, 48))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Rua))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(Residencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Celular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Celular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnAlterar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(brnCancelar)
                        .addComponent(btnExcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCancelarActionPerformed
         this.dispose();
    }//GEN-LAST:event_brnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
          if (Codigo.getText().equals("") && new InstrutorDao().verificaInstrutorExiste(Nome.getText())){
            JOptionPane.showMessageDialog(this, "O instrutor já foi cadastro na base de dados.");
            return;
          }
        try{
                Instrutor i = new Instrutor();
                InstrutorDao dao = new InstrutorDao(); 
                if(alterarInstrutor == true){
    
                    i.setNome(Nome.getText());
                    i.setDataNascimento(Data.getDate());
                    i.setCPF(CPF.getText());
                    i.setRua(Rua.getText());
                    i.setBairro(Bairro.getText());
                    i.setNumero(Integer.parseInt(Numero.getText()));
                    i.setTelResidencial(Integer.parseInt(Residencial.getText()));
                    i.setCelular1(Integer.parseInt(Celular1.getText()));
                    i.setCelular2(Integer.parseInt(Celular2.getText()));
                    i.setCodInstrutor(Integer.parseInt(Codigo.getText()));
                    
                    dao.alterarInstrutor(i);
                
                    JOptionPane.showMessageDialog(this, "Instrutor alterados com secesso!");
                    
                }else{
                    
                    
                    i.setNome(Nome.getText());
                    i.setCPF(CPF.getText());
                    i.setDataNascimento(Data.getDate());
                    i.setRua(Rua.getText());
                    i.setBairro(Bairro.getText());
                    i.setNumero(Integer.parseInt(Numero.getText()));
                    i.setTelResidencial(Integer.parseInt(Residencial.getText()));
                    i.setCelular1(Integer.parseInt(Celular1.getText()));
                    i.setCelular2(Integer.parseInt(Celular2.getText()));
                    
                    dao.cadastrarInstrutor(i);
                    
                    JOptionPane.showMessageDialog(this, "Instrutor cadastrado com sucesso!\n" + "Codigo do instrutor: " + dao.exibeCodigo()   );
                }
               
             LimparCampos(); 
              
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Preenchimento incorreto!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterarInstrutor = true;
        LiberarCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void BairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        alterarInstrutor = false;
        InstrutorDao dao = new InstrutorDao();
        
        if(Codigo.getText().isEmpty()){        
            PesquisarInstrutor frm = new PesquisarInstrutor(this);
            frm.setVisible(true);
            frm.setAlwaysOnTop(true);
            frm.setLocationRelativeTo(null);
        }else{
            try{
                Instrutor i = dao.buscarInstrutor(Integer.parseInt(Codigo.getText()));

                Codigo.setText(Integer.toString(i.getCodInstrutor()));
                Nome.setText(i.getNome());
                CPF.setText(i.getCPF());
                Data.setDate(i.getDataNascimento());
                Rua.setText(i.getRua());
                Bairro.setText(i.getBairro());
                Numero.setText(Integer.toString(i.getNumero()));
                Residencial.setText(Integer.toString(i.getTelResidencial()));
                Celular1.setText(Integer.toString(i.getCelular1()));
                Celular2.setText(Integer.toString(i.getCelular2())); 

                BloquearCampos();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Instrutor não encotrado");
                LimparCampos();
            }
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirmar == JOptionPane.YES_OPTION){
            Instrutor i = new Instrutor();
            AulaDao daao = new AulaDao();
            ArrayList<Aula> aulas = null;
            
            aulas = daao.listarAulaInstrutor(Integer.parseInt(Codigo.getText()));
            
            if(aulas.size() == 0){
                i.setCodInstrutor(Integer.parseInt(Codigo.getText()));

                InstrutorDao dao = new InstrutorDao();
                dao.excluirInstrutor(i);
                LimparCampos();
            }else{
                JOptionPane.showMessageDialog(this, "O instrutor nao pode ser excluido pois há aulas vinculadas a ele!");
            }
        }
        LimparCampos(); 
    
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        LimparCampos();
        LiberarCampos();
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro;
    private javax.swing.JTextField CPF;
    private javax.swing.JTextField Celular1;
    private javax.swing.JTextField Celular2;
    private javax.swing.JTextField Codigo;
    private com.toedter.calendar.JDateChooser Data;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Numero;
    private javax.swing.JTextField Residencial;
    private javax.swing.JTextField Rua;
    private javax.swing.JButton brnCancelar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField10;
    // End of variables declaration//GEN-END:variables
}
