package classes;

public class Cliente extends Pessoa {
	public String sobrenome;
	public String telefone;
	
	public Cliente(String _nome, String _cpf) {
		super(_nome,_cpf);
	}

    public Cliente() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
        
        
}

