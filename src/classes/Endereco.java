package classes;

public class Endereco {
    private String cpf;
    private String estado;
    private String cidade;
    private String rua;
    private String numero;
    
    public Endereco(String _cpf, String _estado, String _cidade, String _rua, String _numero){
        this.cpf = _cpf;
        this.estado = _estado;
        this.cidade = _cidade;
        this.rua = _rua;
        this.numero = _numero;
    }
    
    public Endereco(){}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
