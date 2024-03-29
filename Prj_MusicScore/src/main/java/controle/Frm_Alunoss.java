/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package controle;
import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/**
 *
 * @author bruno
 */
public class Frm_Alunoss extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frm_Alunos
     */
    Conexao con_alunos;
    public Frm_Alunoss() {
        initComponents(); 
        con_alunos = new Conexao(); // inicialização do objeto
        con_alunos.conecta(); // chama o método que conecta
        con_alunos.executaSQL("select * from tblaulunos order by CodAluno");
        preencherTabela();
        posicionarRegistro();
        tblAlunos.setAutoCreateRowSorter(true);
        
    }
 public void preencherTabela(){
         tblAlunos.getColumnModel().getColumn(0).setPreferredWidth(4);
         tblAlunos.getColumnModel().getColumn(1).setPreferredWidth(110);
         tblAlunos.getColumnModel().getColumn(2).setPreferredWidth(30);
         tblAlunos.getColumnModel().getColumn(3).setPreferredWidth(30);
         tblAlunos.getColumnModel().getColumn(4).setPreferredWidth(80);
         tblAlunos.getColumnModel().getColumn(5).setPreferredWidth(30);
         tblAlunos.getColumnModel().getColumn(6).setPreferredWidth(110);
        
        DefaultTableModel modelo = (DefaultTableModel) tblAlunos.getModel();
        modelo.setNumRows(0);
        
        try {
            con_alunos.resultset.beforeFirst();
            while(con_alunos.resultset.next()){
                modelo.addRow(new Object[]{
                   con_alunos.resultset.getString("CodAluno"),con_alunos.resultset.getString("NomeAluno"),con_alunos.resultset.getString("FoneAluno"),con_alunos.resultset.getString("CEPaluno"), con_alunos.resultset.getString("CPFaluno"),con_alunos.resultset.getString("DtNascAluno"),con_alunos.resultset.getString("EmailAluno")

                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistro(){
        try {
            con_alunos.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro:"+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //método que irá mostrar os dados do registro selecionado nos campos de cadastro
    public void mostrar_Dados(){
        try {
            txt_Codigo.setText(con_alunos.resultset.getString("CodAluno"));
            txt_Nome.setText(con_alunos.resultset.getString("NomeAluno"));
            txt_Telefone.setText(con_alunos.resultset.getString("FoneAluno"));
            txt_CEP.setText(con_alunos.resultset.getString("CEPaluno"));
            txt_CPF.setText(con_alunos.resultset.getString("CPFaluno"));
            txt_DataNasc.setText(con_alunos.resultset.getString("DtNascAluno"));
            txt_Email.setText(con_alunos.resultset.getString("EmailAluno"));
           
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
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
        jLabel3 = new javax.swing.JLabel();
        btn_Novo = new javax.swing.JButton();
        btn_Gravar = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_PrimeiroRegistro = new javax.swing.JButton();
        btn_Anterior = new javax.swing.JButton();
        btn_Ultimo = new javax.swing.JButton();
        btn_Proximo = new javax.swing.JButton();
        txt_pesquisa = new javax.swing.JTextField();
        lbl_pesquisarCliente = new javax.swing.JLabel();
        lbl_Codigo = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        lbl_Nome = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        lbl_DataNasc = new javax.swing.JLabel();
        txt_DataNasc = new javax.swing.JTextField();
        lbl_Telefone = new javax.swing.JLabel();
        txt_Telefone = new javax.swing.JTextField();
        lbl_Email = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        lbl_CEP = new javax.swing.JLabel();
        txt_CEP = new javax.swing.JTextField();
        lbl_CPF = new javax.swing.JLabel();
        txt_CPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Alunos");

        jPanel1.setBackground(new java.awt.Color(196, 219, 247));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 50, 98));
        jLabel3.setText("Alunos");

        btn_Novo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoActionPerformed(evt);
            }
        });

        btn_Gravar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/disk.png"))); // NOI18N
        btn_Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GravarActionPerformed(evt);
            }
        });

        btn_Alterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_edit.png"))); // NOI18N
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_delete.png"))); // NOI18N
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_PrimeiroRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_PrimeiroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_first.png"))); // NOI18N
        btn_PrimeiroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrimeiroRegistroActionPerformed(evt);
            }
        });

        btn_Anterior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_previous.png"))); // NOI18N
        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });

        btn_Ultimo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_last.png"))); // NOI18N
        btn_Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UltimoActionPerformed(evt);
            }
        });

        btn_Proximo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_next.png"))); // NOI18N
        btn_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProximoActionPerformed(evt);
            }
        });

        txt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesquisaActionPerformed(evt);
            }
        });
        txt_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pesquisaKeyReleased(evt);
            }
        });

        lbl_pesquisarCliente.setFont(new java.awt.Font("Eras Demi ITC", 0, 15)); // NOI18N
        lbl_pesquisarCliente.setForeground(new java.awt.Color(2, 50, 98));
        lbl_pesquisarCliente.setText("Pesquisar pelo do  nome do Aluno:");

        lbl_Codigo.setFont(new java.awt.Font("Eras Demi ITC", 1, 15)); // NOI18N
        lbl_Codigo.setForeground(new java.awt.Color(2, 50, 98));
        lbl_Codigo.setText("Código:");

        lbl_Nome.setFont(new java.awt.Font("Eras Demi ITC", 1, 15)); // NOI18N
        lbl_Nome.setForeground(new java.awt.Color(2, 50, 98));
        lbl_Nome.setText("Nome:");

        lbl_DataNasc.setFont(new java.awt.Font("Eras Demi ITC", 1, 15)); // NOI18N
        lbl_DataNasc.setForeground(new java.awt.Color(2, 50, 98));
        lbl_DataNasc.setText("Data Nascimento:");

        lbl_Telefone.setFont(new java.awt.Font("Eras Demi ITC", 1, 15)); // NOI18N
        lbl_Telefone.setForeground(new java.awt.Color(2, 50, 98));
        lbl_Telefone.setText("Telefone:");

        lbl_Email.setFont(new java.awt.Font("Eras Demi ITC", 1, 15)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(2, 50, 98));
        lbl_Email.setText("Email:");

        lbl_CEP.setFont(new java.awt.Font("Eras Demi ITC", 1, 15)); // NOI18N
        lbl_CEP.setForeground(new java.awt.Color(2, 50, 98));
        lbl_CEP.setText("CEP:");

        lbl_CPF.setFont(new java.awt.Font("Eras Demi ITC", 1, 15)); // NOI18N
        lbl_CPF.setForeground(new java.awt.Color(2, 50, 98));
        lbl_CPF.setText("CPF:");

        tblAlunos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "CEP", "CPF", "Data Nasc", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlunosMouseClicked(evt);
            }
        });
        tblAlunos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAlunosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_pesquisarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Nome)
                            .addComponent(lbl_Codigo)
                            .addComponent(lbl_Telefone)
                            .addComponent(lbl_DataNasc)
                            .addComponent(lbl_Email)
                            .addComponent(lbl_CPF)
                            .addComponent(lbl_CEP))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Email))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btn_PrimeiroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(btn_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Codigo)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Nome)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Telefone)
                    .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_CEP))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_CPF))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Email)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Ultimo)
                        .addComponent(btn_Anterior)
                        .addComponent(btn_Proximo)
                        .addComponent(btn_PrimeiroRegistro))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Gravar)
                        .addComponent(btn_Novo)
                        .addComponent(btn_Alterar)
                        .addComponent(btn_excluir)))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pesquisarCliente)
                    .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoActionPerformed
        txt_Codigo.setText("");
        txt_Nome.setText("");
        txt_Telefone.setText("");
        txt_CPF.setText("");
        txt_CEP.setText("");
        txt_DataNasc.setText("");
        txt_Email.setText("");
  
        
        txt_Codigo.requestFocus();
    }//GEN-LAST:event_btn_NovoActionPerformed

    private void btn_GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GravarActionPerformed
        String Cod= txt_Codigo.getText();
        String Nome = txt_Nome.getText();
        String CPF = txt_CPF.getText();
        String DataNasc =  txt_DataNasc.getText();
        String Email = txt_Email.getText();
        String CEP = txt_CEP.getText();
        String Telefone = txt_Telefone.getText();

        try{
            String insert_sql="insert into tblaulunos (CodAluno, NomeAluno,FoneAluno, CEPaluno, CPFaluno, DtNascAluno, EmailAluno) values ('" + Cod + "','" + Nome + "','" + Telefone + "','" + CEP + "','" + CPF + "','" + DataNasc + "','" + Email + "')";
            con_alunos.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada ", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            con_alunos.executaSQL("select * from tblaulunos order by CodAluno");
            preencherTabela();

        }

        catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n"+errosql,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_GravarActionPerformed

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        String Cod= txt_Codigo.getText();
        String Nome = txt_Nome.getText();
        String Telefone = txt_Telefone.getText();
        String CEP = txt_CEP.getText();
        String CPF = txt_CPF.getText();
        String DataNasc =  txt_DataNasc.getText();
        String Email = txt_Email.getText();

        String sql;
        String msg="";

        try{
            if(txt_Codigo.getText().equals("0")){
                sql="insert into tblaulunos (NomeAluno,FoneAluno, CEPaluno, CPFaluno, DtNascAluno, EmailAluno) values ('" + Nome + "','" + Telefone + "','" + CEP + "','" + CPF + "','" + DataNasc + "','" + Email + "')";
                msg="Gravação de um novo registro";
            }
            else{
                sql="update tblaulunos set NomeAluno='" + Nome + "', FoneAluno='" + Telefone + "', CEPaluno='" + CEP + "', CPFaluno='" + CPF +"', DtNascAluno='" + DataNasc +"', EmailAluno='" + Email +"' where CodAluno= " + txt_Codigo.getText();
                msg="Alteração de registro";
            }

            con_alunos.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " Gravação realizada com sucesso!!!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            con_alunos.executaSQL("select * from tblaulunos order by CodAluno");
            preencherTabela();
        }

        catch (SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Erro na gravação:\n"+errosql,"Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:String sql="";
        String sql="";
        try{
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusção",JOptionPane.YES_NO_OPTION,3);
            if(resposta==0){
                sql="delete from tblaulunos where CodAluno = "+txt_Codigo.getText();
                int excluir = con_alunos.statement.executeUpdate(sql);
                if(excluir==1){
                    JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso!!","Mensageem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_alunos.executaSQL("select * from tblaulunos order by CodAluno");
                    con_alunos.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }
                else{
                    JOptionPane.showInternalMessageDialog(null," Operação cancelada pelo usuário!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(SQLException excecao){
            JOptionPane.showMessageDialog(null,"Erro na exclusão: "+excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_PrimeiroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrimeiroRegistroActionPerformed
       try {
        con_alunos.resultset.first();
        mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: "+erro);
        }   
    }//GEN-LAST:event_btn_PrimeiroRegistroActionPerformed

    private void btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnteriorActionPerformed
        try {
            //atribuindo o numero do id que está em uso á variavel, funcionando como "linha selecionada"
            int id_selecionado =  con_alunos.resultset.getInt(1);

            //se o Id selecionado for maior que 1, então ele irá selecionar o registro anterior, senão, irá para o primeiro
            if(id_selecionado > 1){
                con_alunos.resultset.previous();
                mostrar_Dados();
            }else{
                con_alunos.resultset.first();
                mostrar_Dados();
            }

        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no registro anterior: "+erro);
        }
    }//GEN-LAST:event_btn_AnteriorActionPerformed

    private void btn_UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UltimoActionPerformed
        try {
            con_alunos.resultset.last();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no último registro: "+erro);
        }
    }//GEN-LAST:event_btn_UltimoActionPerformed

    private void btn_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProximoActionPerformed
        try {
            //se o registro selecionado não for o último, ele irá passar para o próximo registro
            //senão, ele irá para o primeiro registro
            if(con_alunos.resultset.isLast() == false){
                con_alunos.resultset.next();
                mostrar_Dados();
            }else{
                con_alunos.resultset.first();
                mostrar_Dados();
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no próximo registro: "+erro);
        }
    }//GEN-LAST:event_btn_ProximoActionPerformed

    private void txt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesquisaActionPerformed
        // private void txt_pesquisaKeyReleased(java.awt.event.KeyEvent evt){
    }//GEN-LAST:event_txt_pesquisaActionPerformed

    private void txt_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisaKeyReleased
        try{
            String pesquisa = " select * from tblaulunos where NomeAluno like '" + txt_pesquisa.getText()+"%'";
            con_alunos.executaSQL(pesquisa);
            if(con_alunos.resultset.first()){
                preencherTabela();
            }
            else{
                JOptionPane.showMessageDialog(null,"\n Não existe dados com este paramêtro!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesquisaKeyReleased

    private void tblAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunosMouseClicked
        int linha_selecionada = tblAlunos.getSelectedRow();
        txt_Codigo.setText(tblAlunos.getValueAt(linha_selecionada,0).toString());
        txt_Nome.setText(tblAlunos.getValueAt(linha_selecionada, 1).toString());
        txt_Telefone.setText(tblAlunos.getValueAt(linha_selecionada, 2).toString());
        txt_CEP.setText(tblAlunos.getValueAt(linha_selecionada, 3).toString());
        txt_CPF.setText(tblAlunos.getValueAt(linha_selecionada, 4).toString());
        txt_DataNasc.setText(tblAlunos.getValueAt(linha_selecionada, 5).toString());
        txt_Email.setText(tblAlunos.getValueAt(linha_selecionada, 6).toString());
        
        
    }//GEN-LAST:event_tblAlunosMouseClicked

    private void tblAlunosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAlunosKeyPressed
        int linha_selecionada = tblAlunos.getSelectedRow();
        txt_Codigo.setText(tblAlunos.getValueAt(linha_selecionada,0).toString());
        txt_Nome.setText(tblAlunos.getValueAt(linha_selecionada, 1).toString());
        txt_Telefone.setText(tblAlunos.getValueAt(linha_selecionada, 2).toString());
        txt_CEP.setText(tblAlunos.getValueAt(linha_selecionada, 3).toString());
        txt_CPF.setText(tblAlunos.getValueAt(linha_selecionada, 4).toString());
        txt_DataNasc.setText(tblAlunos.getValueAt(linha_selecionada, 5).toString());
        txt_Email.setText(tblAlunos.getValueAt(linha_selecionada, 6).toString());
    }//GEN-LAST:event_tblAlunosKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Gravar;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_PrimeiroRegistro;
    private javax.swing.JButton btn_Proximo;
    private javax.swing.JButton btn_Ultimo;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_CEP;
    private javax.swing.JLabel lbl_CPF;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_DataNasc;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_Telefone;
    private javax.swing.JLabel lbl_pesquisarCliente;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txt_CEP;
    private javax.swing.JTextField txt_CPF;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_DataNasc;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Telefone;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}
