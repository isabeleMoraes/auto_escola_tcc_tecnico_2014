/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.Apresentaçao;

import br.com.isabele.Dao.AulaDao;
import br.com.isabele.modelo.Aula;
import br.com.isabele.modelo.Instrutor;
import br.com.isabele.modelo.TableModelAulas;

import br.com.isabele.Dao.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Belinha
 */
public class FrmPrincipal extends javax.swing.JFrame {

   TableModelAulas tabela;
   
   
    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        preencherTabela();
        setExtendedState(FrmPrincipal.MAXIMIZED_BOTH);
    }

    public void preencherTabela(){
        AulaDao dao = new AulaDao();
        tabela = new TableModelAulas(dao.listarAula());
        jtAulas.setModel(tabela);
    }
    
    public void atualizarTela(){
        preencherTabela();
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        btnExames = new javax.swing.JButton();
        btnCadastrarAula = new javax.swing.JButton();
        btnCadastrarExame = new javax.swing.JButton();
        btnListarAulas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAulas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Exames = new javax.swing.JMenuBar();
        jmSair = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmCadastrarInstrutores = new javax.swing.JMenuItem();
        jmCadastrarAluno = new javax.swing.JMenuItem();
        jmCadastrarVeiculo = new javax.swing.JMenuItem();
        jmCadastrarAula = new javax.swing.JMenuItem();
        jmCadastrarExame = new javax.swing.JMenuItem();
        jmListarAluno = new javax.swing.JMenu();
        jmListarAlunos = new javax.swing.JMenuItem();
        jmListarInstrutores = new javax.swing.JMenuItem();
        jmListarVeiculos = new javax.swing.JMenuItem();
        jmListarAulas = new javax.swing.JMenuItem();
        jmListarExames = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto System");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Atalhos"));

        btnExames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416185482_purchase_order.png"))); // NOI18N
        btnExames.setText("Exames");
        btnExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamesActionPerformed(evt);
            }
        });

        btnCadastrarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/grey_new_seo2-30-32.png"))); // NOI18N
        btnCadastrarAula.setText("Cadastrar Aula");
        btnCadastrarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAulaActionPerformed(evt);
            }
        });

        btnCadastrarExame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416186043_sign-up.png"))); // NOI18N
        btnCadastrarExame.setText("Cadastrar Exame");
        btnCadastrarExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarExameActionPerformed(evt);
            }
        });

        btnListarAulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416110837_edit-paste-24.png"))); // NOI18N
        btnListarAulas.setText("Listar Aulas");
        btnListarAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAulasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListarAulas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExames, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnCadastrarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnCadastrarExame, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnListarAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Relação de aulas"));

        jtAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Data", "Hora", "Aluno", "Instrutor", "Veiculo", "Categoria", "Realizada"
            }
        ));
        jtAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAulasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAulas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("Para editar clique duas vezes sobre a aula desejado!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/1416100878_ktip.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isabele/imagens/Isabele.png"))); // NOI18N

        jmSair.setText("Arquivo");

        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmSair.add(jMenuItem4);

        Exames.add(jmSair);

        jMenu1.setText("Cadastros");

        jmCadastrarInstrutores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jmCadastrarInstrutores.setText("Cadastro de Instrutores");
        jmCadastrarInstrutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarInstrutoresActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastrarInstrutores);

        jmCadastrarAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmCadastrarAluno.setText("Cadastro de Alunos");
        jmCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastrarAluno);

        jmCadastrarVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jmCadastrarVeiculo.setText("Cadastro de Veiculos");
        jmCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarVeiculoActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastrarVeiculo);

        jmCadastrarAula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmCadastrarAula.setText("Cadastrar Aula");
        jmCadastrarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarAulaActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastrarAula);

        jmCadastrarExame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmCadastrarExame.setText("Cadastrar Exame");
        jmCadastrarExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarExameActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastrarExame);

        Exames.add(jMenu1);

        jmListarAluno.setText("Listar");

        jmListarAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmListarAlunos.setText("Listar Alunos");
        jmListarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarAlunosActionPerformed(evt);
            }
        });
        jmListarAluno.add(jmListarAlunos);

        jmListarInstrutores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jmListarInstrutores.setText("Listar Instrutores");
        jmListarInstrutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarInstrutoresActionPerformed(evt);
            }
        });
        jmListarAluno.add(jmListarInstrutores);

        jmListarVeiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmListarVeiculos.setText("Listar veiculos");
        jmListarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarVeiculosActionPerformed(evt);
            }
        });
        jmListarAluno.add(jmListarVeiculos);

        jmListarAulas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmListarAulas.setText("Listar Aulas");
        jmListarAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarAulasActionPerformed(evt);
            }
        });
        jmListarAluno.add(jmListarAulas);

        jmListarExames.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jmListarExames.setText("Listar Exames");
        jmListarExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarExamesActionPerformed(evt);
            }
        });
        jmListarAluno.add(jmListarExames);

        Exames.add(jmListarAluno);

        setJMenuBar(Exames);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnCadastrarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAulaActionPerformed
        Aula au = new Aula();
        int b = 1;
        CadastrarAulaa frm = new CadastrarAulaa(this,au,b);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCadastrarAulaActionPerformed

    private void jmCadastrarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarAulaActionPerformed
        Aula au = new Aula();
        int b = 1;
        CadastrarAulaa frm = new CadastrarAulaa(this,au, 1);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmCadastrarAulaActionPerformed

    private void btnExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamesActionPerformed
        FrmExames frm = new FrmExames(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnExamesActionPerformed

    private void btnCadastrarExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarExameActionPerformed
        
        /*Connection con;
        con = new Conexao().criarConexao();
        
        if (con != null){
        CadastrarExame frm = new CadastrarExame(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
        
        }else{
            JOptionPane.showMessageDialog(this, "Sem conexão");
        }*/
    }//GEN-LAST:event_btnCadastrarExameActionPerformed

    private void btnListarAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAulasActionPerformed
        frmListarAulas frm = new frmListarAulas(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnListarAulasActionPerformed

    private void jmCadastrarInstrutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarInstrutoresActionPerformed
        CadastroDeInstrutor frm = new CadastroDeInstrutor(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmCadastrarInstrutoresActionPerformed

    private void jmCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarAlunoActionPerformed
        CadastroDeAlunos frm = new CadastroDeAlunos(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmCadastrarAlunoActionPerformed

    private void jmCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarVeiculoActionPerformed
        CadastroDeVeiculo frm = new CadastroDeVeiculo(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmCadastrarVeiculoActionPerformed

    private void jmCadastrarExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarExameActionPerformed
        CadastrarExame frm = new CadastrarExame(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmCadastrarExameActionPerformed

    private void jmListarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarAlunosActionPerformed
        ListarAluno frm = new ListarAluno(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmListarAlunosActionPerformed

    private void jmListarInstrutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarInstrutoresActionPerformed
        ListarInstrutor frm = new ListarInstrutor(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmListarInstrutoresActionPerformed

    private void jmListarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarVeiculosActionPerformed
        ListarVeiculo frm = new ListarVeiculo(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmListarVeiculosActionPerformed

    private void jmListarExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarExamesActionPerformed
        frmListarExame frm = new frmListarExame(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmListarExamesActionPerformed

    private void jmListarAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarAulasActionPerformed
        frmListarAulas frm = new frmListarAulas(this);
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmListarAulasActionPerformed

    private void jtAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAulasMouseClicked
         if(evt.getClickCount() == 2){
            int linhaSelecionada = jtAulas.getSelectedRow();
            tabela = (TableModelAulas) jtAulas.getModel();
            Aula au = tabela.retornarAulaSelecionada(linhaSelecionada);
            int b = 1;
            CadastrarAulaa frm = new CadastrarAulaa(this, au, b);
            frm.alterarAula = true;
            frm.setVisible(true);
            frm.setAlwaysOnTop(true);
            frm.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jtAulasMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Exames;
    private javax.swing.JButton btnCadastrarAula;
    private javax.swing.JButton btnCadastrarExame;
    private javax.swing.JButton btnExames;
    private javax.swing.JButton btnListarAulas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmCadastrarAluno;
    private javax.swing.JMenuItem jmCadastrarAula;
    private javax.swing.JMenuItem jmCadastrarExame;
    private javax.swing.JMenuItem jmCadastrarInstrutores;
    private javax.swing.JMenuItem jmCadastrarVeiculo;
    private javax.swing.JMenu jmListarAluno;
    private javax.swing.JMenuItem jmListarAlunos;
    private javax.swing.JMenuItem jmListarAulas;
    private javax.swing.JMenuItem jmListarExames;
    private javax.swing.JMenuItem jmListarInstrutores;
    private javax.swing.JMenuItem jmListarVeiculos;
    private javax.swing.JMenu jmSair;
    private javax.swing.JTable jtAulas;
    // End of variables declaration//GEN-END:variables
}
