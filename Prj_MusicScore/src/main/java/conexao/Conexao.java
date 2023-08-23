/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Conexao {
    final private String driver = "com.mysql.cj.jdbc.Driver";
    final private String url = "jdbc:mysql://127.0.0.1/clientes";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset; 
    
    public boolean conecta(){
    boolean result = true;
    try{
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, usuario, senha);
        //JOptionPane.showMessageDialog(null, "Conxão Estabelecida", "Mensagem Do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
            catch (ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null, "Driver Não Localizado"+Driver,"Mensagem Do Programa",JOptionPane.INFORMATION_MESSAGE);
            result = false;
            }
            catch (SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Fonte De Dados Não Localizada"+Fonte,"Mensagem Do Programa",JOptionPane.INFORMATION_MESSAGE);
            result = false;
            }
    return result;
}
    public void desconecta(){
    try{ 
        conexao.close();
        JOptionPane.showMessageDialog(null, "Conexão Com o Banco Fechada","Mensagem Do Programa",JOptionPane.INFORMATION_MESSAGE);
        } 
    catch (SQLException fecha){     
         }
}
    public void executaSQL(String sql){
    try{
        statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultset = statement.executeQuery(sql);
       }
            catch(SQLException excecao){
            JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n ERRO"+excecao,"Mensagem Do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }
}

