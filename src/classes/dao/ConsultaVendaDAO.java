package classes.dao;

import classes.Cliente;
import classes.ConsultaVenda;
import classes.Produto;
import classes.Venda;
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
public class ConsultaVendaDAO {
    public List<ConsultaVenda> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String cpfConsulta;

        List<ConsultaVenda> consultaVendas = new ArrayList<>();                
        try{
                                    
            stmt = con.prepareStatement("SELECT * FROM venda");
            rs = stmt.executeQuery();
            while(rs.next()){
                ConsultaVenda consultavenda = new ConsultaVenda();  
                ConsultaVendaDAO cvdao = new ConsultaVendaDAO();
                ConsultaVendaDAO consultadao = new ConsultaVendaDAO();
                ConsultaVendaDAO cvdao3 = new ConsultaVendaDAO();
                consultavenda.setNum_nf(rs.getInt("num_nota"));
                consultavenda.setCpf(rs.getString("cpf"));
                cpfConsulta = consultavenda.getCpf();
                int numNfConsulta = consultavenda.getNum_nf();
                
                
                //Aqui mostra o nome dos clientes
                for(ConsultaVenda cv: cvdao.readForCpf(cpfConsulta)){
                    String nome = cv.getCliente();
                    consultavenda.setCliente(nome);
                }       
                
                //Aqui tem uma consulta do codigo do produto e posterior a descrição de tal
                for(ConsultaVenda cv: consultadao.readForNF(numNfConsulta)){
                    int produto = cv.getCodProduto();
                    
                    for(ConsultaVenda cv1: cvdao3.readForCodProduto(produto)){
                        consultavenda.setNomeProduto(cv1.getNomeProduto());
                    
                    }
                    consultavenda.setCodProduto(produto);
                    
                }
                                
                consultaVendas.add(consultavenda);  
            }
               
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return consultaVendas;
    }
    
    /////////////////////////////////////////////////////////////////////////
    
        public List<ConsultaVenda> readForCpf(String cpf) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ConsultaVenda> consulta = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
            stmt.setString(1,cpf);
            rs = stmt.executeQuery();
            
            while(rs.next()){               
                ConsultaVenda cv = new ConsultaVenda();
                
                cv.setCliente(rs.getString("nome"));
                cv.setCpf(rs.getString("cpf"));
                               
                consulta.add(cv);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return consulta;
    }    
        
    /////////////////////////////////////////////////////////////////////////

    public List<ConsultaVenda> readForCodProduto(int codigo) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ConsultaVenda> consulta = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE codigo = ?");
            stmt.setInt(1,codigo);
            rs = stmt.executeQuery();
            
            while(rs.next()){               
                ConsultaVenda cv = new ConsultaVenda();
                
                cv.setNomeProduto(rs.getString("descricao"));                                               
                consulta.add(cv);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return consulta;
    }  

    /////////////////////////////////////////////////////////////////////////

    public List<ConsultaVenda> readForNF(int num_nf) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ConsultaVenda> consulta = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM itemvenda WHERE num_nota = ?");
            stmt.setInt(1,num_nf);
            rs = stmt.executeQuery();
            
            while(rs.next()){               
                ConsultaVenda cv = new ConsultaVenda();
                int codigo = rs.getInt("cod_produto");                
                cv.setCodProduto(codigo);                                                                       
                consulta.add(cv);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return consulta;
    }    
}
