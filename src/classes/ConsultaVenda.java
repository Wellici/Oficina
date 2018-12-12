package classes;

/**
 *
 * @author Hugo
 */
public class ConsultaVenda {
    private int num_nf;
    private String nomeProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    private int codProduto;
    private String Cliente;
    private String cpf;
    
    public ConsultaVenda(){}

    public int getNum_nf() {
        return num_nf;
    }

    public void setNum_nf(int num_nf) {
        this.num_nf = num_nf;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    


    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
