package classes.dao;

import classes.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.ConnectionFactory;

public class ClienteDAO {
    public void create(Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (cpf,nome,sobrenome,telefone) VALUES (?,?,?,?)");
            stmt.setString(1, c.getCpf());
            stmt.setString(2,c.getNome());
            stmt.setString(3, c.getSobrenome());
            stmt.setString(4, c.getTelefone());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }
    
    public void update (Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cliente SET cpf = ?,nome = ?,sobrenome = ?, telefone = ? WHERE cpf = ?");
            stmt.setString(1, c.getCpf());
            stmt.setString(2,c.getNome());
            stmt.setString(3, c.getSobrenome());
            stmt.setString(4, c.getTelefone());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }
    
    public void delete (Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE cpf = ?");
            stmt.setString(1, c.getCpf());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Deletar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }
    
    public List<Cliente> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
               Cliente c = new Cliente();
                
               c.setCpf(rs.getString("cpf"));
               c.setNome(rs.getString("nome"));
               c.setSobrenome(rs.getString("sobrenome"));
               c.setTelefone(rs.getString("telefone"));
               
               clientes.add(c);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return clientes;
    }
    
    public List<Cliente> readForCpf(String cpf) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
            stmt.setString(1,cpf);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Cliente cliente = new Cliente();
                
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setTelefone(rs.getString("telefone"));
                clientes.add(cliente);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return clientes;
    }    
}
