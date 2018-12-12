package classes;

public class Servico {
    private int codigo;
    private float preco;
    private String descricao;
    
    public Servico(int _codigo, float _preco, String _descricao){
        this.codigo = _codigo;
        this.preco = _preco;
        this.descricao = _descricao;
    }
    
    public Servico(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
