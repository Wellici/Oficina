package classes.dao;

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
public class VendasDAO {
    public List<Venda> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda> vendas = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM Venda");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Venda venda = new Venda();
                
                venda.setNum_nota(rs.getInt("num_nota"));
                venda.setCpf(rs.getString("cpf"));
                vendas.add(venda);
            
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Acessar: "+ex);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vendas;
    }
}
