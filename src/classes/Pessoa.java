package classes;

public class Pessoa {
	public String nome;
	public String cpf;
	
	public Pessoa(String _nome, String _cpf) {
		this.nome = _nome;
		this.cpf = _cpf;
	}
	
	public Pessoa() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}