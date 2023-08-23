/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package controle;



/**
 *
 * @author dti
 */
public class frm_menu extends javax.swing.JFrame {

    /** Creates new form frm_menu */
    public frm_menu() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_prof = new javax.swing.JButton();
        btn_aluno = new javax.swing.JButton();
        btn_curso = new javax.swing.JButton();
        btn_disciplina = new javax.swing.JButton();
        btn_desenvolvedor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_sair = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        professor = new javax.swing.JMenuItem();
        aluno = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        curso = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        disciplina = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        desenvolvedor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(196, 219, 247));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btn_prof.setBackground(new java.awt.Color(255, 255, 255));
        btn_prof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/professor.png"))); // NOI18N
        btn_prof.setText("Professores");
        btn_prof.setFocusable(false);
        btn_prof.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_prof.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_profActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_prof);

        btn_aluno.setBackground(new java.awt.Color(255, 255, 255));
        btn_aluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/aluna.png"))); // NOI18N
        btn_aluno.setText("Alunos");
        btn_aluno.setFocusable(false);
        btn_aluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_aluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alunoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_aluno);

        btn_curso.setBackground(new java.awt.Color(255, 255, 255));
        btn_curso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/graduacao.png"))); // NOI18N
        btn_curso.setText("Cursos");
        btn_curso.setFocusable(false);
        btn_curso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_curso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cursoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_curso);

        btn_disciplina.setBackground(new java.awt.Color(255, 255, 255));
        btn_disciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/disciplina.png"))); // NOI18N
        btn_disciplina.setText("Disciplinas");
        btn_disciplina.setFocusable(false);
        btn_disciplina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_disciplina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_disciplinaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_disciplina);

        btn_desenvolvedor.setBackground(new java.awt.Color(255, 255, 255));
        btn_desenvolvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/desenvolvedor.png"))); // NOI18N
        btn_desenvolvedor.setText("Desenvolvedor");
        btn_desenvolvedor.setFocusable(false);
        btn_desenvolvedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_desenvolvedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_desenvolvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desenvolvedorActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_desenvolvedor);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jLabel8);

        btn_sair.setBackground(new java.awt.Color(255, 255, 255));
        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.setFocusable(false);
        btn_sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_sair);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(977, 722));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Acesso");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        professor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        professor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/professor.png"))); // NOI18N
        professor.setText("Acesso de Professores");
        professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorActionPerformed(evt);
            }
        });
        jMenu1.add(professor);

        aluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/aluna.png"))); // NOI18N
        aluno.setText("Acesso Aluno");
        aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoActionPerformed(evt);
            }
        });
        jMenu1.add(aluno);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Cursos");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        curso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        curso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/graduacao.png"))); // NOI18N
        curso.setText("Cursos");
        curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoActionPerformed(evt);
            }
        });
        jMenu4.add(curso);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Disciplinas");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        disciplina.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        disciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/disciplina.png"))); // NOI18N
        disciplina.setText("Disciplinas");
        disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplinaActionPerformed(evt);
            }
        });
        jMenu5.add(disciplina);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Desenvolvedor");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        desenvolvedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        desenvolvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/desenvolvedor.png"))); // NOI18N
        desenvolvedor.setText("Desenvolvedor");
        desenvolvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenvolvedorActionPerformed(evt);
            }
        });
        jMenu2.add(desenvolvedor);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 0, 0));
        jMenu3.setText("Sair");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 0, 0));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png"))); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu3.add(sair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorActionPerformed
      Frm_Professoress frm1 = new Frm_Professoress();
        frm1.setVisible(true);
        jDesktopPane1.add( frm1 );
    }//GEN-LAST:event_professorActionPerformed

    private void alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoActionPerformed
        // TODO add your handling code here:
        Frm_Alunoss frm2 = new Frm_Alunoss();
        frm2.setVisible(true);
        jDesktopPane1.add( frm2 );
    }//GEN-LAST:event_alunoActionPerformed

    private void cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoActionPerformed
        Frm_Cursos frm3 = new Frm_Cursos();
        frm3.setVisible(true);
        jDesktopPane1.add( frm3 );
    }//GEN-LAST:event_cursoActionPerformed

    private void disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinaActionPerformed
        // TODO add your handling code here:
        Frm_Disciplinas frm4= new Frm_Disciplinas();
        frm4.setVisible(true);
        jDesktopPane1.add( frm4 );
    }//GEN-LAST:event_disciplinaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void btn_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_profActionPerformed
      Frm_Professoress frm5 = new Frm_Professoress();
        frm5.setVisible(true);
        jDesktopPane1.add( frm5 );
    }//GEN-LAST:event_btn_profActionPerformed

    private void btn_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alunoActionPerformed
        Frm_Alunoss frm6 = new Frm_Alunoss();
        frm6.setVisible(true);
        jDesktopPane1.add( frm6 );
    }//GEN-LAST:event_btn_alunoActionPerformed

    private void btn_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cursoActionPerformed
      Frm_Cursos frm7 = new Frm_Cursos();
        frm7.setVisible(true);
        jDesktopPane1.add( frm7 );
    }//GEN-LAST:event_btn_cursoActionPerformed

    private void btn_disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_disciplinaActionPerformed
        Frm_Disciplinas frm8= new Frm_Disciplinas();
        frm8.setVisible(true);
        jDesktopPane1.add( frm8 );
    }//GEN-LAST:event_btn_disciplinaActionPerformed

    private void btn_desenvolvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desenvolvedorActionPerformed
        Frm_Desenvolvedor frm9= new Frm_Desenvolvedor();
        frm9.setVisible(true);
        jDesktopPane1.add( frm9 );
    }//GEN-LAST:event_btn_desenvolvedorActionPerformed

    private void desenvolvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenvolvedorActionPerformed
        // TODO add your handling code here:
        Frm_Desenvolvedor frm10= new Frm_Desenvolvedor();
        frm10.setVisible(true);
        jDesktopPane1.add( frm10 );
    }//GEN-LAST:event_desenvolvedorActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

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
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aluno;
    private javax.swing.JButton btn_aluno;
    private javax.swing.JButton btn_curso;
    private javax.swing.JButton btn_desenvolvedor;
    private javax.swing.JButton btn_disciplina;
    private javax.swing.JButton btn_prof;
    private javax.swing.JButton btn_sair;
    private javax.swing.JMenuItem curso;
    private javax.swing.JMenuItem desenvolvedor;
    private javax.swing.JMenuItem disciplina;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem professor;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables

}