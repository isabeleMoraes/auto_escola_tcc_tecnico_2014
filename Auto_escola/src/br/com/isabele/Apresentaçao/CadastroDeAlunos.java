package br.com.isabele.Apresentaçao;

import br.com.isabele.Dao.AlunoDao;
import br.com.isabele.Dao.AulaDao;
import br.com.isabele.modelo.Aluno;
import br.com.isabele.modelo.Aula;
import br.com.isabele.modelo.SoNumeros;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import br.com.isabele.modelo.CPF;
import br.com.isabele.Dao.Conexao;
import java.sql.Connection;

/**
 * @author Belinha
 */
public class CadastroDeAlunos extends javax.swing.JFrame {
    private FrmPrincipal fPric;
    
    public CadastroDeAlunos() {
        initComponents();
        Numero.setDocument(new SoNumeros());
    }
    public CadastroDeAlunos(javax.swing.JFrame frm) {
        this();
        fPric = (FrmPrincipal) frm;
    }
    boolean alterarAluno = false;
    
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
        cbCategoria.setEnabled(true);
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
        cbCategoria.setEnabled(false);
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
        cbCategoria.setSelectedIndex(0);
        Residencial.setText("");
        Celular1.setText("");
        Celular2.setText("");
    }
    public void setarCampos(int codigo, String nome, int cpf, Date data, String rua, String bairro, int numero, String cat, int residencial, int celular1, int celular2){
        BloquearCampos();
        Aluno a = new Aluno();
        
        Codigo.setText(Integer.toString(codigo));
        Nome.setText(nome);
        CPF.setText(Integer.toString(cpf));
        Data.setDate(data);
        Rua.setText(rua);
        Bairro.setText(bairro);
        cbCategoria.setSelectedItem(cat);
        Numero.setText(Integer.toString(numero));
        Residencial.setText(Integer.toString(residencial));
        Celular1.setText(Integer.toString(celular1));
        Celular2.setText(Integer.toString(celular2));
    }
      
    public String RetirarMascara(String campo){
        return campo.replaceAll("\\D", ""); 
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        Rua = new javax.swing.JTextField();
        Bairro = new javax.swing.JTextField();
        Numero = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Codigo = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Data = new com.toedter.calendar.JDateChooser();
        btnExcluir = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JButton();
        CPF = new javax.swing.JFormattedTextField();
        Residencial = new javax.swing.JFormattedTextField();
        Celular1 = new javax.swing.JFormattedTextField();
        Celular2 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cep = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de aluno");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do aluno"));

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Nascimento:");

        jLabel5.setText("Numero:");

        jLabel6.setText("Rua:");

        jLabel7.setText("Bairro:");

        jLabel8.setText("Categoria:");

        jLabel9.setText("Residencial:");

        jLabel10.setText("Celular:");

        jLabel11.setText("Celular 2:");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "A/B" }));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
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

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416104181_DeleteRed.png"))); // NOI18N
        btnCancelar.setText("Sair");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Pesquisa.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Alunos.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416103914_editor_trash_delete_recycle_bin_-24.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1415678111_edit-clear.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        try {
            CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFActionPerformed(evt);
            }
        });

        try {
            Residencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Celular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Celular2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Celular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celular2ActionPerformed(evt);
            }
        });

        jLabel13.setText("CEP:");

        try {
            cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });

        jButton1.setText("V");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(262, 262, 262)
                                                .addComponent(btnAlterar)
                                                .addGap(163, 163, 163)
                                                .addComponent(btnExcluir)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(69, 69, 69)
                                                        .addComponent(Residencial, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Rua)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)
                                                .addGap(3, 3, 3)
                                                .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Celular1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Celular2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))))
                    .addComponent(jLabel12))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(Residencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addGap(5, 5, 5))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
        LiberarCampos();
        alterarAluno = false;
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try{
            if (Codigo.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Informe um aluno");
            }else{
                
                int confirmar = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(confirmar == JOptionPane.YES_OPTION){
                    Aluno a = new Aluno();
                    AulaDao daao = new AulaDao();
                    ArrayList<Aula> aulas = null;

                    aulas = daao.listarAulaAluno("" + Integer.parseInt(Codigo.getText()));
                    

                    if(aulas.size() == 0){
                        a.setCodAluno(Integer.parseInt(Codigo.getText()));

                        AlunoDao dao = new AlunoDao();
                        dao.excluirAluno(a);
                        LimparCampos();
                    }else{
                        JOptionPane.showMessageDialog(this, "O aluno nao pode ser excluido pois há aulas vinculadas a ele!");
                    }    
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e /*"Não há alunos para excluir"*/);
        }
        //Fazer o mesmo para o aluno Instrutor e veiculo!
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        alterarAluno=false;
        AlunoDao dao = new AlunoDao();
        if(Codigo.getText().isEmpty()){        
            PesquisarAuno frm = new PesquisarAuno(this);
            frm.setVisible(true);
            frm.setAlwaysOnTop(true);
            frm.setLocationRelativeTo(null);
        }else{
            try{
                Aluno a = dao.buscarAlunos(Integer.parseInt(Codigo.getText()));

                Codigo.setText(Integer.toString(a.getCodAluno()));
                Nome.setText(a.getNome());
                CPF.setText(Integer.toString(a.getCPF()));
                Data.setDate(a.getDataNascimento());
                Rua.setText(a.getRua());
                Bairro.setText(a.getBairro());
                Numero.setText(Integer.toString(a.getNumero()));
                cbCategoria.setSelectedItem(a.getCategoria());
                Residencial.setText(Integer.toString(a.getTelResidencial()));
                Celular1.setText(Integer.toString(a.getCelular1()));
                Celular2.setText(Integer.toString(a.getCelular2()));

                BloquearCampos();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Aluno nao encontrado!");
                Codigo.setText("");
            }
        }   
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoActionPerformed
        Aluno a = new Aluno();
        a.getCodAluno();
    }//GEN-LAST:event_CodigoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //if(){
            this.dispose();
        /*}else{
            
        }*/
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(Codigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe o aluno", "OPS!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            alterarAluno = true;
            LiberarCampos();
        };

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (Codigo.getText().equals("") && new AlunoDao().verificaAlunoExiste(Nome.getText())){
            JOptionPane.showMessageDialog(this, "O aluno já foi cadastro na base de dados.");
            return;
        }
        
        Aluno a = new Aluno();
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
            
            String Telefone = Residencial.getText().replaceAll("\\D", "");
            String CelularUm = Celular1.getText().replaceAll("\\D", "");
            String CelularDois = Celular2.getText().replaceAll("\\D", "");
            
            String cepp = cep.getText().trim().replace("-", "");
            
            String cpff = CPF.getText().replaceAll("[..-]", "");
                
///dar truncate na tabela e tentar novamente... Depois colocar essas remoçoes de mascaras em um metodo.
            
             
            AlunoDao dao = new AlunoDao();
            if(alterarAluno == true){

                a.setCodAluno(Integer.parseInt(Codigo.getText()));
                a.setNome(Nome.getText());
                a.setCPF(Integer.parseInt(RetirarMascara(CPF.getText())));
                a.setDataNascimento(Data.getDate());
                a.setRua(Rua.getText());
                a.setBairro(Bairro.getText());
                a.setNumero(Integer.parseInt(Numero.getText()));
                a.setCategoria(nomeCategoria);
                a.setTelResidencial((int) Long.parseLong(RetirarMascara(Residencial.getText())));
                a.setCelular1((int) Long.parseLong(RetirarMascara(Celular1.getText())));
                a.setCelular2((int) Long.parseLong(RetirarMascara(Celular2.getText())));
                a.setCep((int)Long.parseLong(RetirarMascara(cep.getText())));
                
                dao.alterarAluno(a);
                JOptionPane.showMessageDialog(this, "Alunos alterados com secesso!");
            }else{
                a.setNome(Nome.getText());
                a.setCPF((int)Long.parseLong(RetirarMascara(CPF.getText())));
                a.setDataNascimento(Data.getDate());
                a.setRua(Rua.getText());
                a.setBairro(Bairro.getText());
                a.setNumero(Integer.parseInt(Numero.getText()));
                a.setCategoria(nomeCategoria);
                a.setTelResidencial((int)Long.parseLong(RetirarMascara(Residencial.getText())));
                a.setCelular1((int) Long.parseLong(RetirarMascara(Celular1.getText())));
                a.setCelular2((int) Long.parseLong(RetirarMascara(Celular2.getText())));
                a.setCep((int)Long.parseLong(RetirarMascara(cep.getText())));

                dao.cadastrarAluno(a);

                JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!\n" +"Codigo do aluno: " + dao.exibeCodigo());
            }

            Codigo.selectAll();
            LimparCampos();

        }catch(Exception e){

            JOptionPane.showMessageDialog(this, e/*"Preenchimento incorreto!"*/);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFActionPerformed

    private void Celular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celular2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Celular2ActionPerformed

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro;
    private javax.swing.JFormattedTextField CPF;
    private javax.swing.JFormattedTextField Celular1;
    private javax.swing.JFormattedTextField Celular2;
    private javax.swing.JTextField Codigo;
    private com.toedter.calendar.JDateChooser Data;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Numero;
    private javax.swing.JFormattedTextField Residencial;
    private javax.swing.JTextField Rua;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private Date Date(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
