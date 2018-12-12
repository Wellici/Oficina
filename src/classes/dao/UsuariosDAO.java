package classes.dao;

import classes.Produto;
import classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.ConnectionFactory;

/**
 *
 * @author Hugo
 */
public class UsuariosDAO {
    public void create(Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO login (usuario,senha) VALUES (?,?)");
            stmt.setString(1, u.getUser());
            stmt.setString(2, u.getSenha());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }
    
    public List<Produto> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Produto produto = new Produto();
                
                produto.setCodigo(rs.getInt("codigo"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setDescricao(rs.getString("descricao"));
                produtos.add(produto);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
    }
    
    public void update (Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE login SET usuario = ?,senha = ? WHERE usuario = ?");
            stmt.setString(1, u.getUser());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getUser());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }
    
    public void delete (Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM login WHERE usuario = ?");
            stmt.setString(1, u.getUser());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Deletar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }

    public List<Usuario> readForUsuario(String user) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM login WHERE usuario = ?");
            stmt.setString(1, user);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Usuario usuario = new Usuario();
                              
                usuario.setUser(rs.getString("usuario"));
                usuario.setSenha(rs.getString("senha"));
                usuarios.add(usuario);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }
}
