/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.Apresentaçao;

import br.com.isabele.Dao.AulaDao;
import br.com.isabele.Dao.VeiculoDao;
import br.com.isabele.modelo.Aluno;
import br.com.isabele.modelo.Aula;
import br.com.isabele.modelo.Exame;
import br.com.isabele.modelo.Instrutor;
import br.com.isabele.modelo.Veiculo;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import javax.swing.JOptionPane;

/**
 *
 * @author Belinha
 */
public class CadastrarAulaa extends javax.swing.JFrame {
    private FrmPrincipal fPrin;
    private frmListarAulas fLAulas;
    /**
     * Creates new form CadastrarAulaa
     */
    int codigoAluno = 0;
    int codigoInstrutor = 0;
    String placai;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
      
    
    //-----------------------------------------------------------------
    
    
    //----------------------------------------------------------------
    
    private void KeyListner (KeyEvent e){
      if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
          
          this.dispose();
          
           // btnSair.doClick();
        }  
    }
    
     private void HoraFocusLost(java.awt.event.FocusEvent evt) {
        JOptionPane.showMessageDialog(null, "Teste");
    }
       
    
    
     public void BloquearCampos(){
        codigo.setEnabled(false);
        aluno.setEnabled(false);
        instrutor.setEnabled(false);
        placa.setEnabled(false);
        data.setEnabled(false);
        Hora.setEnabled(false);
        cbCategoria.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisarAluno.setEnabled(false);
        btnPesquisarInstrutor.setEnabled(false);
        btnPesquisarVeiculo.setEnabled(false);
        cbRealizada.setEnabled(false);
    }
    
    public CadastrarAulaa() {
        initComponents();
        aluno.setEditable(false);
        instrutor.setEditable(false);
        placa.setEditable(false);
    }
    int indTela;
    
    public CadastrarAulaa(javax.swing.JFrame frm, Aula au,int b) {
        this();
        if(au.getCodAula() > 0){
            codigo.setText(Integer.toString(au.getCodAula()));
            aluno.setText(au.getNomeAluno());
            codigoAluno = au.getCodAluno();
            instrutor.setText(au.getNomeInstrutor());
            codigoInstrutor = au.getCodInstrutor();
            placa.setText(au.getPlaca());
            placai = au.getPlaca();
            data.setDate(au.getDataAula());
            Hora.setText(sdf.format(au.getHora()));
            cbCategoria.setSelectedItem(au.getCategoria());
            if(au.getRealizada() == 1){
                cbRealizada.setSelected(true);
            }else{
                cbRealizada.setSelected(false); 
            }
        }
        if(b == 1){
            fPrin = (FrmPrincipal) frm;
            indTela = 1;
        }else{
            fLAulas = (frmListarAulas) frm;
        }
    }
        
    
    
      boolean alterarAula = false;
    
     public void LiberarCampos(){
        codigo.setEnabled(true);
        aluno.setEnabled(true);
        instrutor.setEnabled(true);
        placa.setEnabled(true);
        data.setEnabled(true);
        Hora.setEnabled(true);
        cbCategoria.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisarAluno.setEnabled(true);
        btnPesquisarInstrutor.setEnabled(true);
        btnPesquisarVeiculo.setEnabled(true);
        cbRealizada.setEnabled(true);
    }
   
    public void LimparCampos(){
        codigo.setText("");
        aluno.setText("");
        instrutor.setText("");
        placa.setText("");
        data.setDate(null);
        Hora.setText("");
        cbCategoria.setSelectedIndex(0);
    }
    public void setarAluno(String nome, int Codigo){
        aluno.setText(nome);
        codigoAluno = Codigo;
    }
    public void setarInstrutor(String nome, int Codigo){
        instrutor.setText(nome);
        codigoInstrutor = Codigo;
    }
    
    public void setarVeiculo(String Placa){
        placa.setText(Placa);
        placai = Placa;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        aluno = new javax.swing.JTextField();
        instrutor = new javax.swing.JTextField();
        placa = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox();
        data = new com.toedter.calendar.JDateChooser();
        btnPesquisarAula = new javax.swing.JButton();
        btnPesquisarAluno = new javax.swing.JButton();
        btnPesquisarInstrutor = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisarVeiculo = new javax.swing.JButton();
        cbRealizada = new javax.swing.JCheckBox();
        btnLimpar = new javax.swing.JButton();
        Hora = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aulas");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da aula"));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jLabel1.setText("Codigo:");

        jLabel3.setText("Aluno:");

        jLabel4.setText("Instrutor:");

        jLabel5.setText("Placa do veiculo:");

        jLabel6.setText("Data:");

        jLabel7.setText("Categoria:");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoKeyPressed(evt);
            }
        });

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "A/B" }));

        btnPesquisarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAulaActionPerformed(evt);
            }
        });

        btnPesquisarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAlunoActionPerformed(evt);
            }
        });

        btnPesquisarInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisarInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarInstrutorActionPerformed(evt);
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
        btnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAlterarKeyPressed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416104181_DeleteRed.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btnSairComponentShown(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        btnSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSairKeyPressed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416103914_editor_trash_delete_recycle_bin_-24.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarVeiculoActionPerformed(evt);
            }
        });

        cbRealizada.setText("Realizada");

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1415678111_edit-clear.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        try {
            Hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraActionPerformed(evt);
            }
        });
        Hora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HoraKeyTyped(evt);
            }
        });

        jLabel2.setText("Hora:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbRealizada))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(placa))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(instrutor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnPesquisarVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnPesquisarInstrutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(13, 13, 13)
                .addComponent(btnSair)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPesquisarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisarInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRealizada))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void btnPesquisarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAulaActionPerformed
        alterarAula =false;
        AulaDao dao = new AulaDao();
        try{
            Aula au = dao.buscarAula(Integer.parseInt(codigo.getText()));

            codigo.setText(Integer.toString(au.getCodAula()));
            aluno.setText(au.getNomeAluno()/*Integer.toString(au.getCodAluno())*/);
            codigoAluno = au.getCodAluno();
            instrutor.setText(au.getNomeInstrutor()/*Integer.toString(au.getCodInstrutor())*/);
           // codigoInstrutor = au.getCodInstrutor();
            placa.setText(au.getPlaca());
            placai = au.getPlaca();
            data.setDate(au.getDataAula());
            Hora.setText(sdf.format(au.getHora()));
            cbCategoria.setSelectedItem(au.getCategoria());
            if(au.getRealizada() == 1){
                cbRealizada.setSelected(true);
            }else{
                cbRealizada.setSelected(false); 
            }

            BloquearCampos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Aula nao encontrada");
            LimparCampos();
            
        }

    }//GEN-LAST:event_btnPesquisarAulaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        if (Hora.getText().trim().equals(":") && aluno.getText().equals("") && instrutor.getText().isEmpty() && placa.getText().isEmpty() && data.getDate() == null){
            this.dispose();
        }else{
            
            int confirmar = JOptionPane.showConfirmDialog(this,"As informações ainda nao foram salvas. Deseja realmente sair?", "Deseja Sair?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
          
            if(confirmar == JOptionPane.YES_OPTION){
                this.dispose();
            }
        
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAlunoActionPerformed
        frmPesquisarAluno frm = new frmPesquisarAluno(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPesquisarAlunoActionPerformed

    private void btnPesquisarInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarInstrutorActionPerformed
        frmPesquisarInstrutor frm = new frmPesquisarInstrutor(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPesquisarInstrutorActionPerformed

    private void btnPesquisarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarVeiculoActionPerformed
        frmPesquisarVeiculo frm = new frmPesquisarVeiculo(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPesquisarVeiculoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Aula au = new Aula();
        
        int realizado;
         int categoria = cbCategoria.getSelectedIndex();
         String nomeCategoria = null;
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
           
           if(cbRealizada.isSelected()){
               realizado = 1;
           }else{
               realizado = 0;
           }
                

                AulaDao dao = new AulaDao(); 
                // para listar sdf.format(au.getHora());
                
                if(alterarAula == true){
                    au.setCodAula(Integer.parseInt(codigo.getText()));
                    au.setCodAluno(codigoAluno);
                    au.setCodInstrutor(codigoInstrutor);
                    au.setPlaca(placai);
                    au.setDataAula(data.getDate());
                    au.setCategoria(nomeCategoria);
                    au.setRealizada(realizado);
                    au.setHora(new Time(sdf.parse(Hora.getText()).getTime()));
                    
                    dao.alterarAula(au);

                    JOptionPane.showMessageDialog(this, "Aula alterado com secesso!");
                }else{
                    
                    au.setCodAluno(codigoAluno);
                    au.setCodInstrutor(codigoInstrutor);
                    au.setPlaca(placai);
                    au.setDataAula(data.getDate());
                    au.setCategoria(nomeCategoria);
                    au.setRealizada(realizado);
                    au.setHora(new Time(sdf.parse(Hora.getText()).getTime()));
                    
                    dao.cadastrarAula(au);
                
                    JOptionPane.showMessageDialog(this, "Aula cadastrado com sucesso!\n" + "Codigo da aula: " + dao.exibeCodigo());
                }
               //**Erro nesse trexo
                if(indTela == 1){
                    fPrin.atualizarTela();
                }else{
                    fLAulas.preencherTabelaListarAula();
                }
                
                LimparCampos();
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e/*"Preencha todos os campos corretamente!"*/);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(codigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe o aluno", "OPS!", JOptionPane.INFORMATION_MESSAGE);
        } else{ 
            LiberarCampos();
            alterarAula = true;
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try{
            int confirmar = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(confirmar == JOptionPane.YES_OPTION){
            Aula a = new Aula();

            a.setCodAula(Integer.parseInt(codigo.getText()));

            AulaDao dao = new AulaDao();
            dao.excluirAula(a);

            
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Informe o codigo da aula que deseja excluir", "Ops!", JOptionPane.ERROR_MESSAGE);
        }
        //fPrin.atualizarTela();
        LimparCampos(); 
        alterarAula = false;
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
        LiberarCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
        if (evt.getKeyCode() == evt.VK_ESCAPE){
            btnSair.doClick();
            this.dispose();
        }
    }//GEN-LAST:event_btnSairKeyPressed

    private void codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER){
            btnPesquisarAula.doClick();
            btnAlterar.requestFocus();
        }
        
    }//GEN-LAST:event_codigoKeyPressed

    private void btnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlterarKeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER){
            btnAlterar.doClick();
        }
    }//GEN-LAST:event_btnAlterarKeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        
    }//GEN-LAST:event_jPanel1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnSair.doClick();
        }
    }//GEN-LAST:event_formKeyPressed

    private void btnSairComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnSairComponentShown
         
    }//GEN-LAST:event_btnSairComponentShown

    private void HoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HoraKeyTyped

    }//GEN-LAST:event_HoraKeyTyped

    private void HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraActionPerformed
   
    }//GEN-LAST:event_HoraActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAulaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAulaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAulaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAulaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAulaa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Hora;
    private javax.swing.JTextField aluno;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisarAluno;
    private javax.swing.JButton btnPesquisarAula;
    private javax.swing.JButton btnPesquisarInstrutor;
    private javax.swing.JButton btnPesquisarVeiculo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JCheckBox cbRealizada;
    private javax.swing.JTextField codigo;
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JTextField instrutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField placa;
    // End of variables declaration//GEN-END:variables
}
