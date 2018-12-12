package classes.dao;

import classes.RendFuncionario;
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
public class RendFuncionarioDAO {
    
    //Funcao pra saber nome de funcionario pelo cpf
    public List<RendFuncionario> readForCpf(String cpf) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<RendFuncionario> consulta = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM funcionario WHERE cpf = ?");
            stmt.setString(1,cpf);
            rs = stmt.executeQuery();
            
            while(rs.next()){               
                RendFuncionario rf = new RendFuncionario();
                
                rf.setNome(rs.getString("nome"));
                               
                consulta.add(rf);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return consulta;
    }    
    
    //////////////////////////////////////////////////////////////////////////////
    
    public List<RendFuncionario> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<RendFuncionario> rendFuncionarios = new ArrayList<>();                
        try{
                                    
            stmt = con.prepareStatement("SELECT * FROM itemvenda");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                RendFuncionario rf = new RendFuncionario();
                
                RendFuncionarioDAO rfdao1 = new RendFuncionarioDAO();
                RendFuncionarioDAO rfdao2 = new RendFuncionarioDAO();
                
                
                rf.setCpf(rs.getString("cod_funcionario"));
                rf.setCodProduto(rs.getInt("cod_produto"));
                
                String cpfConsulta = rf.getCpf();
                int codigo = rf.getCodProduto();
                float soma=0;
                
                for(RendFuncionario rFunc: rfdao1.readForCpf(cpfConsulta)){
                    rf.setNome(rFunc.getNome());
                }
                
                for(RendFuncionario rFunc: rfdao2.readForValor(codigo)){
                    soma = soma + rFunc.getValor();
                    rf.setValor(soma);
                }
                                
                rendFuncionarios.add(rf);  
            }
               
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return rendFuncionarios;
    }
    
    //////////////////////////////////////////////////////////////////////////////
    
    //Funcao para saber valor do produto apartir do codigo
    
    public List<RendFuncionario> readForValor(int codProduto) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<RendFuncionario> rendFuncionarios = new ArrayList<>();                
        try{
                                    
            stmt = con.prepareStatement("SELECT * FROM produto WHERE codigo = ?");
            stmt.setInt(1, codProduto);
            rs = stmt.executeQuery();
            while(rs.next()){
                
                RendFuncionario rf = new RendFuncionario();
                
                
                rf.setValor(rs.getFloat("preco"));                                                                
                rendFuncionarios.add(rf);  
            }
               
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return rendFuncionarios;
    }        

}
