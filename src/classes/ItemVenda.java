package classes;

public class ItemVenda extends Item{
    private int cod_servico;
    private String cod_funcionario;
    
    public ItemVenda(int _sequencial, int _num_nota, int _quantidade, int _cod_produto, int _cod_servico, String _cod_funcionario){
        super(_sequencial, _num_nota,_quantidade, _cod_produto);
        this.cod_servico = _cod_servico;
        this.cod_funcionario = _cod_funcionario;
    } 
    
    public ItemVenda(){}
    
    public int getCod_servico() {
        return cod_servico;
    }

    public void setCod_servico(int cod_servico) {
        this.cod_servico = cod_servico;
    }

    public String getCod_funcionario() {
        return cod_funcionario;
    }

    public void setCod_funcionario(String cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }
    

}
