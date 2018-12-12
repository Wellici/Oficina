package classes.dao;

import classes.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.ConnectionFactory;

public class FuncionarioDAO {
    public void create(Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (cpf,nome) VALUES (?,?)");
            stmt.setString(1, f.getCpf());
            stmt.setString(2,f.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }
    
    public void update (Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE funcionario SET cpf = ?,nome = ? WHERE cpf = ?");
            stmt.setString(1, f.getCpf());
            stmt.setString(2,f.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }
    
    public void delete (Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE cpf = ?");
            stmt.setString(1, f.getCpf());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Deletar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }
    
    public List<Funcionario> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> funcionarios = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
               Funcionario f = new Funcionario();
                
               f.setCpf(rs.getString("cpf"));
               f.setNome(rs.getString("nome"));
               
               funcionarios.add(f);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return funcionarios;
    }
}
