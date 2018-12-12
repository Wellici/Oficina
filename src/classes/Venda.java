package classes;

public class Venda {
    private int num_nota;
    private String cpf;
    
    public Venda(int _num_nota, String _descricao){
        this.num_nota = _num_nota;
        this.cpf = _descricao;
    }
    
    public Venda(){}

    public int getNum_nota() {
        return num_nota;
    }

    public void setNum_nota(int num_nota) {
        this.num_nota = num_nota;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
