package classes;

public class Item {
    private int sequencial;
    private int num_nota;
    private int quantidade;
    private int cod_produto;
    
    public Item(int _sequencial, int _num_nota, int _quantidade, int _cod_produto){
        this.sequencial = _sequencial;
        this.num_nota = _num_nota;
        this.quantidade = _quantidade;
        this.cod_produto = _cod_produto;
    }
    
    public Item(){}

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public int getNum_nota() {
        return num_nota;
    }

    public void setNum_nota(int num_nota) {
        this.num_nota = num_nota;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }
    
}
