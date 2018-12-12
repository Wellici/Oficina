package classes.dao;

import classes.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.ConnectionFactory;

public class ProdutoDAO {
    
    public void create(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto (codigo,preco,descricao) VALUES (?,?,?)");
            stmt.setInt(1, p.getCodigo());
            stmt.setFloat(2, p.getPreco());
            stmt.setString(3, p.getDescricao());
            
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
    
    public void update (Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produto SET codigo = ?,preco = ?,descricao = ? WHERE codigo = ?");
            stmt.setInt(1, p.getCodigo());
            stmt.setFloat(2, p.getPreco());
            stmt.setString(3, p.getDescricao());
            stmt.setInt(4, p.getCodigo());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }
    
    public void delete (Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE codigo = ?");
            stmt.setInt(1, p.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Deletar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }         
    }

    public List<Produto> readForCodigo(int codigo) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE codigo = ?");
            stmt.setInt(1,codigo);
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
    
}
