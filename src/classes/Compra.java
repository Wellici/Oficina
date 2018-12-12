package classes;

public class Compra {
    private int num_nota;
    private String descricao;
    
    public Compra(int _num_nota, String _descricao){
        this.num_nota = _num_nota;
        this.descricao = _descricao;
    }
    
    public Compra(){}

    public int getNum_nota() {
        return num_nota;
    }

    public void setNum_nota(int num_nota) {
        this.num_nota = num_nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
