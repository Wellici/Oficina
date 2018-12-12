package classes;

public class Veiculo {
   private String placa;
   private String cpf;
   private String ano;
   private String modelo;
   
   public Veiculo(String _placa, String _cpf, String _ano, String _modelo){
       this.placa = _placa;
       this.cpf = _cpf;
       this.ano = _ano;
       this.modelo = _modelo;
   }
    
   public Veiculo(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
}
