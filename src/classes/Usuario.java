package classes;

/**
 *
 * @author Hugo
 */
public class Usuario {
    private String user;
    private String senha;
        
    public Usuario(){}
    
    public Usuario(String _user, String _senha){
        this.user = _user;
        this.senha = _senha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
